package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        this.userName = "DummyJerky123";
        this.password = "JunkyDumb321";
    }

    public boolean setUserName(String name)
    {
        if(name.length()>=8){
            for (int i = 0; i < name.length(); i++) {
                String tmp =  "" + name.charAt(i);
                if (!tmp.matches("\\p{Alnum}"))return false;
                if (i==0&&tmp.matches("\\p{Digit}"))return false;
            }
            this.userName = name;
            return true;
        }
        return false;
    }

    public boolean setPassword(String name)
    {
        int upper = 0,lower = 0, digit = 0;
        if(name.length()>=12){
            for (int i = 0; i < name.length(); i++) {
                String tmp =  "" + name.charAt(i);
                if (!tmp.matches("\\p{Alnum}"))return false;
                if (tmp.matches("\\p{Upper}"))upper = 1;
                if (tmp.matches("\\p{Lower}"))lower = 1;
                if (tmp.matches("\\p{Digit}"))digit = 1;
            }
            if ((upper+lower+digit)==3) {
                this.password = name;
                return true;
            }
        }
        return false;
    }

    public String getUserName()
    {
        return this.userName;
    }

    public String getPassword()
    {
        return  this.password;
    }
}
