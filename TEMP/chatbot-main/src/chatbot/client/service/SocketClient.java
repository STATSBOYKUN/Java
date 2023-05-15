package chatbot.client.service;

import chatbot.util.Setting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Mutaqin
 */
public class SocketClient implements Connection {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    @Override
    public boolean startConnection() {
        String ip = Setting.getDefault().getHost();
        int port = Setting.getDefault().getPort();
        try {
            clientSocket = new Socket(ip, port);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean closeConnection() {
        try {
            in.close();
            out.close();
            clientSocket.close();
            return true;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public String request(String params) {
        String response = null;
        try {
            out.println(params);
            response = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return response;
    }

    @Override
    public String response() {
        return null;
    }

}
