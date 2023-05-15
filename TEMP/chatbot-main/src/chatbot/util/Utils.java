package chatbot.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Muttaqin Alanshoiry
 */
public class Utils {
    
    public static Map<String, String> getChatDict(){
        Hashtable<String, String> dict = new Hashtable<>();
        dict.put("welcome", "Welcome to chatbot...<br>For more info type: <b>help</b>.");
        dict.put("help", "Please type: <b>info</b>");
        dict.put("info", "For more info type: <ol><li><b>java</b></li><li><b>network</b></li><li><b>design pattern</b></li></ol>");
        dict.put("halo", "Halo...");
        dict.put("java", "For more info about <b>Java</b> follow this link: <a href=\"https://en.wikipedia.org/wiki/Java_(programming_language)\">https://en.wikipedia.org/wiki/Java_(programming_language)</a>");
        dict.put("network", "For more info about <b>Network</b> follow this link: <a href=\"https://en.wikipedia.org/wiki/Computer_network\">https://en.wikipedia.org/wiki/Computer_network</a>");
        dict.put("design pattern", "For more info about <b>Design Pattern</b> follow this link: <a href=\"https://en.wikipedia.org/wiki/Design_pattern\">https://en.wikipedia.org/wiki/Design_pattern</a>");
        
        dict.put("assalamu'alaikum", "Wa'alaikumussalam");
        dict.put("Good morning", "Good morning. How are you today?");
        dict.put("I'm fine.", "That's good");
        
        return dict;
    }
    
    public static String encryptPassword(String password){
        String encryptedpassword = null;  
        try {  
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(password.getBytes());
            byte[] bytes = m.digest();
            StringBuilder s = new StringBuilder();  
            for(int i=0; i< bytes.length ;i++)  
            {  
                s.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));  
            }  
            encryptedpassword = s.toString();  
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encryptedpassword;
    }
}
