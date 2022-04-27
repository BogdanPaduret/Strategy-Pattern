package altExemplu.models;

public abstract class User implements Comparable{

    public final static String SAVE_SEPARATOR = "/";

    private String type;
    private int userId;
    private String name;

    public User(String type, int userId, String name) {
        this.type = type;
        this.userId = userId;
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return this.userId == user.userId && this.name.equals(user.name);
    }

    @Override
    public String toString() {
        String string = "";

        string += this.getName() + SAVE_SEPARATOR + this.getUserId();

        return string;
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        int c = this.userId - user.userId;
        if (c < 0) {
            return -1;
        } else if (c > 0) {
            return 1;
        } else {
            return equals(user);
        }
    }

    private int equals(User user) {
        int len = Math.min(this.name.length(), user.name.length());
        for (int i = 0; i < len; i++) {
            Character chThis = this.name.charAt(i);
            Character chUser = this.name.charAt(i);
            if ((int) chThis < (int) chUser) {
                return -1;
            } else if ((int) chThis > (int) chUser) {
                return 1;
            }
        }
        return 0;
    }
}
