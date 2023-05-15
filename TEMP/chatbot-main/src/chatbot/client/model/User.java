package chatbot.client.model;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Mutaqin
 */
public class User extends Model {

    private int id;
    private String name;
    private String email;
    private String password;
    private String token;

    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    

    @Override
    public String toJSON() {
        JSONObject jsonObj = new JSONObject();
        jsonObj.put("id", getId());
        jsonObj.put("name", getName());
        jsonObj.put("email", getEmail());
        jsonObj.put("password", getPassword());
        jsonObj.put("token", getToken());
        return jsonObj.toJSONString();
    }

    @Override
    public void fromJSON(Object json) {
        JSONObject jsonObj = null;
        if (json instanceof JSONObject) {
            jsonObj = (JSONObject) json;
        } else if (json instanceof String) {
            JSONParser jsonParser = new JSONParser();
            try {
                jsonObj = (JSONObject) jsonParser.parse(json.toString());
            } catch (ParseException ex) {
                ex.printStackTrace();
            }
        }
        if (jsonObj != null) {
            id = Integer.parseInt(jsonObj.get("id").toString());
            name = (String) jsonObj.get("name");
            email = (String) jsonObj.get("email");
            token = jsonObj.get("token")==null?null:(String) jsonObj.get("token");
        }
    }
}
