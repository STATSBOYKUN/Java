package chatbot.server;

import chatbot.server.db.DBConnection;
import chatbot.server.db.service.UserRepository;
import chatbot.server.model.User;
import chatbot.util.Utils;
import java.net.Socket;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author user
 */
public class SocketClient extends ClientService {

    public final String LOGIN_ACTION = "login";
    public final String REGISTER_ACTION = "register";
    public final String USER_ACTION = "user";
    public final String USER_ALL_ACTION = "user/all";
    public final String USER_CREATE_ACTION = "user/create";
    public final String CHAT_ACTION = "chat";
    
    private User user;//authenticated user

    public SocketClient(Socket socket) {
        super(socket);
    }
    
    

    @Override
    public void handleRequest(String message) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject obj = (JSONObject)parser.parse(message);
            String action = (String) obj.get("action");
            Object payload = obj.get("payload");
            
            switch (action) {
                case REGISTER_ACTION:
                    register(payload);
                    break;
                case LOGIN_ACTION:
                    login(payload);
                    break;
                case USER_ACTION:
                    break;
                case CHAT_ACTION:
                    replyMessage(payload);
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }

    public void login(Object payload) {
        JSONObject obj = (JSONObject) payload;
        String email = (String) obj.get("email");
        String password = (String) obj.get("password");
        UserRepository repo = new UserRepository(DBConnection.getConnection());
        User user = repo.login(email, password);
        
        JSONObject data = new JSONObject();
        String status = "success";
        String message = null;
        if (user != null) {
            this.user = user;
            data.put("id", user.getId());
            data.put("name", user.getName());
            data.put("email", user.getEmail());
            data.put("password", user.getPassword());
        } else {
            status = "error";
            message = "Invalid email or password.";
        }
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("status", status);
        jsonObj.put("data", data);
        jsonObj.put("message", message);
        String json = jsonObj.toJSONString();
        
        sendResponse(json);
    }

    public void logout() {
        this.user = null;
    }

    public void register(Object payload) {
        JSONObject obj = (JSONObject) payload;
        String name = (String) obj.get("name");
        String email = (String) obj.get("email");
        String password = (String) obj.get("password");
        User user = new User(name, email, password);
        UserRepository repo = new UserRepository(DBConnection.getConnection());
        int id = repo.create(user);
        user = repo.find(id);
        JSONObject data = new JSONObject();
        String status = "success";
        String message = null;
        if (user != null) {
            data.put("id", user.getId());
            data.put("name", user.getName());
            data.put("email", user.getEmail());
            data.put("password", user.getPassword());
        } else {
            status = "error";
            message = "Invalid email or password.";
        }
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("status", status);
        jsonObj.put("data", data);
        jsonObj.put("message", message);
        String json = jsonObj.toJSONString();
        sendResponse(json);
    }

    public void replyMessage(Object payload) {
        Map<String, String> dict = Utils.getChatDict();
        JSONObject obj = (JSONObject) payload;
        String name = (String) obj.get("name");
        String email = (String) obj.get("email");
        String message = (String) obj.get("message");
        Long time = Long.parseLong(obj.get("time").toString());
        
        String reply = dict.get(message.toLowerCase());
        JSONObject data = new JSONObject();
        String status = "success";
        data.put("message", reply);
        data.put("time", System.currentTimeMillis());
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("status", status);
        jsonObj.put("data", data);
        String json = jsonObj.toJSONString();
        sendResponse(json);
    }

}
