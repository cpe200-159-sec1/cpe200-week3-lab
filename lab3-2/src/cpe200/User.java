package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;



    public User()
    {
        /* your code here */
        userName = "";
        password = "";
    }

    public boolean setUserName(String name)
    {
        /* your code here */
        if(name.matches("^[a-zA-Z][a-zA-Z0-9]{7,}$")){
            userName = name;
            return true;
        }return false;
    }

    public boolean setPassword(String name)
    {
        /* your code here */
        if(name.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$")){
            password = name;
            return true;
        }return false;
    }

    public String getUserName()
    {
        /* your code here */
        return userName;
    }

    public String getPassword()
    {
        /* your code here */
        return password;
    }
}
