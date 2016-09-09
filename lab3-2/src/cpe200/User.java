package cpe200;

import sun.security.util.Password;

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
        String tr = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if(name.matches(tr)){
            userName = name;
            return true;
            }
        else return false;
    }

    public boolean setPassword(String Password)
    {
        String tr = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if(Password.matches(tr)){
        password = Password;
        return true;
        }else return false;
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
