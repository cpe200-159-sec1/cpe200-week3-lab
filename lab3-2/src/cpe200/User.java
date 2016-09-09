package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;
    private String uPattern = new String("^[A-Z|a-z][A-Z|a-Z|0-9]{7,}");
    private String pPattern = new String("^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{12,}$");

    public User()
    {
        /* your code here */
    }

    public boolean setUserName(String name)
    {
        /* your code here */
        this.userName = (name.equals(uPattern))?name:this.userName;
        return (name.equals(uPattern));
    }

    public boolean setPassword(String name)
    {
        /* your code here */
        this.password = (name.equals(pPattern))?name:this.password;
        return (name.equals(pPattern));
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
