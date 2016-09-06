package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {

    }

    public boolean setUserName(String name)
    {
        String K = "[a-zA-Z][A-Za-z0-9]{7,}";
        if (name.matches(K)){
            userName = name;
            return true;
        }
        else return false;
    }

    public boolean setPassword(String name)
    {
        String L = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{12,}";
        if (name.matches(L)){
            password = name;
            return true;
        }
        else return false;
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
