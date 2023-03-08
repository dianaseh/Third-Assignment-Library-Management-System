import java.util.*;
public class User {
    //User should have a list of books
    //User should have a username and a password
    private HashMap<String , String> userlogin = new HashMap<String , String>() ;


    public void usersignup (String username , String pass){
        userlogin.put(username , pass);
    }
    public void userremove (String username){
        for(String i : userlogin.keySet()){
            if(i.equals(username))
                userlogin.remove(i);

        }
    }
    public void usersearch (String username){
        boolean flag = true ;
        for(String i : userlogin.keySet()){
            if(i.equals(username)){
                flag = false ;
                System.out.format("user %s does exist"  , username);
            }
        }
        if(flag)
            System.out.format("user with username %s was not found" , username);
    }
    public void setUserlogin (String username , String pass){
        for(String i : userlogin.keySet()){
            if(i.equals(username)){
                if(userlogin.get(i).equals(pass))
                    System.out.format("WELCOME %s" , username);
                else
                    System.out.println("password incorrect");
            }
            else
                System.out.println("username not found");
        }
    }

    public void rentBook(){
        //TODO
    }

    public void returnBook(){
        //TODO
    }
}
