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
        String UserPattern = "^[A-Za-z][a-zA-Z0-9]{7,}$";
        if(name.matches(UserPattern)){
            userName = name;
            return true;
        }
            return false;
    }

    public boolean setPassword(String name)
    {
        String PassPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
       if(name.matches(PassPattern)) {
           password = name;
           return true;
       }
       return  false;
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
