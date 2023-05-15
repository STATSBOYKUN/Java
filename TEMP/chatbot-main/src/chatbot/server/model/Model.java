package chatbot.server.model;

/**
 *
 * @author Mutaqin
 */
public abstract class Model {
    public abstract String toJSON();
    public abstract void fromJSON(Object json);
}
