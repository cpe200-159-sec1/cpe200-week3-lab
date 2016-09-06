/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    public String userName;
    protected String password;

    public User()
    {
        /* your code here */
    }

    public boolean setUserName(String name)
    {
        String regex = "^[A-Za-z][A-Za-z0-9]{7,}$";
        if(name.matches(regex)){
                   userName = name;
                   return true;
              }
        return false;
    }

    public boolean setPassword(String pass)
    {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{12,}$";
        if(pass.matches(regex)){
            password = pass;
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
