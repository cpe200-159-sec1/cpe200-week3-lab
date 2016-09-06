package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    protected String userNamePattern = "^[a-zA-Z][a-zA-Z0-9]{7,}";
    protected String passwordPattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}";

    public User()
    {
        this.userName = "";
        this.password = "";
    }

    public boolean setUserName(String name)
    {

        if(name.matches(userNamePattern))
        {
            userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name)
    {
        if(name.matches(passwordPattern))
        {
            password = name;
            return true;
        }
        return false;
    }

    public String getUserName()
    {
        return userName;
    }

    public String getPassword()
    {
        return password;
    }
}
