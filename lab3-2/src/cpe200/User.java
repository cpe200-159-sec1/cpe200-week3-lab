package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        userName="";
        password="";
    }

    public boolean setUserName(String name)
    {
        String test="^[a-zA-Z][a-zA-Z0-9]{7,}$";
        if(name.matches(test))
        {
            this.userName=name;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean setPassword(String name)
    {
        String test="^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if(name.matches(test))
        {
            this.password=name;
            return true;
        }
        else
        {
            return false;
        }
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
