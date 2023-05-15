package chatbot.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Mutaqin
 */
public class Setting {

    private static Setting setting;
    private String dbfile;
    private String host;
    private int port;

    private Setting() {
        readSetting();
    }

    public static Setting getDefault() {
        if (setting == null) {
            setting = new Setting();
        }
        return setting;
    }

    public String getDbfile() {
        return dbfile;
    }

    public void setDbfile(String dbfile) {
        this.dbfile = dbfile;
    }
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    private void readSetting() {
        Properties prop = new Properties();
        String fileName = "setting.properties";
        try (FileInputStream fis = new FileInputStream(fileName)) {
            prop.load(fis);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        this.dbfile = prop.getProperty("dbfile");
        this.host = prop.getProperty("host");
        String _port = prop.getProperty("port");
        this.port = _port!=null?Integer.parseInt(_port):6589;
    }
    
    public void writeSetting(){
        //TODO save setting changes to file
    }

}
