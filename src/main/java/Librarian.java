import java.util.*;
public class Librarian extends Library {

    private HashMap<String , String> liblogin = new HashMap<String , String>() ;


    public void libsignup (String username , String pass){
        liblogin.put(username , pass);
    }
    public void setLiblogin (String username , String pass){
        for(String i : liblogin.keySet()){
            if(i.equals(username)){
                if(liblogin.get(i).equals(pass))
                    System.out.format("WELCOME %s" , username);
                else
                    System.out.println("password incorrect");
            }
            else
                System.out.println("username not found");
        }
    }
    public void libremove (String username){
        for(String i : liblogin.keySet()){
            if(i.equals(username))
                liblogin.remove(i);
        }
    }
    public void libsearch (String username){
        boolean flag = true ;
        for(String i : liblogin.keySet()){
            if(i.equals(username)) {
                flag = false ;
                System.out.format("librarian %s does exist", username);
            }
        }
        if(flag)
            System.out.format("librarian with username %s was not found" , username);
    }


}
