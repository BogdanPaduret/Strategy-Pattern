package altExemplu.models;

import java.io.Serializable;

public class Admin extends User {

    public Admin(int userId, String name) {
        super("admin", userId, name);
    }
}
