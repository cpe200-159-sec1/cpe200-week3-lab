package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    private String uPattern = new String("^[A-Z|a-z][A-Z|a-z|0-9]{7,}$");
    private String pPattern = new String("^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{12,}$");

    public User()
    {
        /* your code here */
    }

    public boolean setUserName(String name)
    {
        /* your code here */
        this.userName = (name.matches(uPattern))?name:this.userName;
        return (name.matches(uPattern));
    }

    public boolean setPassword(String name)
    {
        /* your code here */
        this.password = (name.matches(pPattern))?name:this.password;
        return (name.matches(pPattern));
    }

    public String getUserName()
    {
        /* your code here */
        return this.userName;
    }

    public String getPassword()
    {
        /* your code here */
        return this.password;
    }
}
