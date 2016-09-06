package cpe200;

import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    protected String userNamePattern= new String("^[a-zA-Z][A-Za-z0-9]{7,}$");
    protected String passWordPattern= new String("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$");

    public User()
    {
        /* your code here */
        this.userName="";
        this.password="";
    }

    public boolean setUserName(String name)
    {
        /* your code here */
        if(name.matches(userNamePattern))
        {
            userName=name;
            return true;
        }


        return false;
    }

    public boolean setPassword(String name)
    {
        /* your code here */
        if(name.matches(passWordPattern))
        {
            password=name;
            return true;
        }
        return false;
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
