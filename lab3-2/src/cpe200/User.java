package cpe200;

public class User {
    protected String userName;
    protected String password;

    public User()
    {
        /* your code here */
    }

    public boolean setUserName(String name)
    {
        String re = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if(name.matches(re)){
            userName = name;
            return true;}
        else{return false;}
    }

    public boolean setPassword(String name)
    {
        String re = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if(name.matches(re)){
            password = name;
            return true;
        }
        else{return false;}
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
