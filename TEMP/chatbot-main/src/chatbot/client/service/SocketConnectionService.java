package chatbot.client.service;

import chatbot.client.model.Message;
import chatbot.client.model.User;
import chatbot.util.Utils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Mutaqin
 */
public class SocketConnectionService extends ConnectionService {

    @Override
    public Connection createConnection() {
        SocketClient socket = new SocketClient();
        return socket;
    }

    @Override
    public boolean login(String email, String password) {
        String enPassword = Utils.encryptPassword(password);
        JSONObject payload = new JSONObject();
        payload.put("email", email);
        payload.put("password", enPassword);
        JSONObject msgObj = new JSONObject();
        msgObj.put("action", "login");
        msgObj.put("payload", payload);
        String json = msgObj.toJSONString();
        String response = getConnection().request(json);
        JSONParser parser = new JSONParser();
        try {
            JSONObject resObj = (JSONObject) parser.parse(response);
            String status = (String) resObj.get("status");
            if (status.equals("success")) {
                //get login data
                User user = new User();
                user.fromJSON(resObj.get("data"));
                setUser(user);
                return true;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean logout() {
        System.out.println("Logout...");
        setUser(null);
        return true;
    }

    @Override
    public Message sendMessage(Message message) {
        JSONObject payload = new JSONObject();
        payload.put("name", getUser().getName());
        payload.put("email", getUser().getEmail());
        payload.put("message", message.getContent());
        payload.put("time", System.currentTimeMillis());

        JSONObject msgObj = new JSONObject();
        msgObj.put("action", "chat");
        msgObj.put("payload", payload);
        String json = msgObj.toJSONString();

        //submit to server
        String response = getConnection().request(json);
        System.out.println("Send message: " + json);
        System.out.println("Response: " + response);
        JSONParser parser = new JSONParser();
        try {
            JSONObject resObj = (JSONObject) parser.parse(response);
            String status = (String) resObj.get("status");
            if (status.equals("success")) {
                Message responseMsg = new Message();
                JSONObject data = (JSONObject) resObj.get("data");
                Long time = Long.parseLong(data.get("time").toString());
                String msg = (String) data.get("message");
                responseMsg.setBot(true);
                responseMsg.setContent(msg);
                responseMsg.setTime(time);
                return responseMsg;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean register(String name, String email, String password) {
        String enPassword = Utils.encryptPassword(password);
        JSONObject payload = new JSONObject();
        payload.put("name", name);
        payload.put("email", email);
        payload.put("password", enPassword);
        JSONObject msgObj = new JSONObject();
        msgObj.put("action", "register");
        msgObj.put("payload", payload);
        String json = msgObj.toJSONString();

        //submit to server
        String response = getConnection().request(json);

        JSONParser parser = new JSONParser();
        try {
            JSONObject resObj = (JSONObject) parser.parse(response);
            String status = (String) resObj.get("status");
            if (status.equals("success")) {
                //get login data
                User user = new User();
                user.fromJSON(resObj.get("data"));
                setUser(user);
                return true;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
