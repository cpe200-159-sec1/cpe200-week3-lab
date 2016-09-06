package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        this.userName = "";
        this.password = "";
    }

    public boolean setUserName(String name)
    {
        String tmp = "[A-Za-z][A-Za-z0-9]{7,}";
        if(name.matches(tmp)){
            this.userName = name;
            return true;
        }else return false;
    }

    public boolean setPassword(String name)
    {
        String tmp = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-1])[A-Za-z0-9]{11,}";
        if(name.matches(tmp)){
            this.password = name;
            return true;
        }else return false;
    }

    public String getUserName()
    {
        return this.userName;
    }

    public String getPassword()
    {
        return this.password;
    }
}
