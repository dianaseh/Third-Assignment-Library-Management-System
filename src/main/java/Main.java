import java.util.Scanner;

public class Main {
    /*
    * make a functional library app using oop
    * run the main program in Main.java and code the oop part in other classes
    * don't forget to add at least 1 librarian to the library to make it functionable.
    * *  *** don't limit yourself to our template ***
     */

    public static void main(String[] args) {
        System.out.println("Welcome to THE LIBRARY , choose your action by entering it's number :");
        System.out.println("1- LOGIN");
        System.out.println("2- SIGN UP");
        Scanner input = new Scanner(System.in);
        int op = input.nextInt() ;
        runMenu(op);



    }

    public static void runMenu(int n){
        Scanner input = new Scanner(System.in);
        Librarian librarian = new Librarian() ;
        User user = new User() ;
        if(n==1){
            System.out.println("Are you : ");
            System.out.println("1- A Librarian");
            System.out.println("2- A User");
            int op = input.nextInt() ;
            if(op==1){  //loging in as a librarian
                System.out.println("Enter your username : ");
                String username = input.nextLine() ;
                System.out.println("Enter your password : ");
                String pass = input.nextLine ();
                librarian.setLiblogin(username , pass);
            }
            if(op==2){ // loging in as a user
                System.out.println("Enter your username : ");
                String username = input.nextLine() ;
                System.out.println("Enter your password : ");
                String pass = input.nextLine ();
                user.setUserlogin(username , pass);
            }
            else
                System.out.println("invalid input");
        }
        if(n==2){ //
            System.out.println("Are you : ");
            System.out.println("1- A Librarian");
            System.out.println("2- A User");
            int op = input.nextInt ();
            if(op==1){ //sign up as librarian
                System.out.println("Enter your username : ");
                String username = input.nextLine() ;
                System.out.println("Enter your password : ");
                String pass = input.nextLine ();
                librarian.libsignup(username , pass);
            }
            if(op==2){
                System.out.println("Enter your username : ");
                String username = input.nextLine() ;
                System.out.println("Enter your password : ");
                String pass = input.nextLine ();
                user.usersignup(username , pass);
            }
            else
                System.out.println("invalid input");


        }
        else
            System.out.println("invalid input");
    }
}
