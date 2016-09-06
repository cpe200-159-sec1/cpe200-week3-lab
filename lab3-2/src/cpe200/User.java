package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    protected String userName;
    protected String password;

    public User()
    {
        userName = new String();
        password = new String();
    }

    public boolean setUserName(String name) {
        if (name.length() < 8)//check lengh >=8
            return false;
        else if (Character.isDigit(name.charAt(0)) == true)
            return false;
        else {
            for (int i = 0; i < name.length(); i++) {
                if (Character.isAlphabetic(name.charAt(i)) == false)
                    if (Character.isDigit(name.charAt(i))==false)
                        return false;
                }
        userName = name;
        return true;

        }
    }
    public boolean setPassword(String name)
    {
        if (name.length() >=12){
            boolean haveDigit=false,haveCapital=false,haveSmall=false;
            for (int i=0;i<name.length();i++)
          {
              if(Character.isUpperCase(name.charAt(i))) haveCapital=true;
              else if(Character.isLowerCase(name.charAt(i))) haveSmall=true;
              else if(Character.isDigit(name.charAt(i))) haveDigit=true;
              if(haveCapital && haveDigit && haveSmall){
                  password = name;
                  return true;
              }
          }
          return false;
        }
        return false;
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
