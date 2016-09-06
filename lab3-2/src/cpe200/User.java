package cpe200;

import java.util.regex.Pattern;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    private String userpattern = new String("^[A-Za-z][a-zA-Z0-9]{7,}$");
    private String passPattern = new String("^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{12,}$");

    public User()
    {
        /* your code here */
        //userName = new String("");
        //password = new String("");
    }

    public boolean setUserName(String name)
    {
        /* your code here */

        if (name.matches(userpattern)){
            userName = name;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean setPassword(String name)
    {
        /* your code here */

        if (name.matches(passPattern)){
            password = name;
            return true;
        }
        else {
            return false;
        }
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
