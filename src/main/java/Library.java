//import java.util.Scanner ;
import java.util.*;
public class Library {
    /*
    * The library should have a list of books.
    * The library should have a map of books ISBNs which is linked to the amount of book
    -> (for example: harry potter -> 4 means there are currently 4 harry potter books)
    * The library should have a list of users and a list of librarians.
     */

    //book related functions
    User user = new User() ;
    Librarian librarian = new Librarian();
    ArrayList<Book>  books = new ArrayList<Book>();
    HashMap<Book , String> borrowedBooks = new HashMap<Book , String>();

    public void addBook(String name, String author, int pubYear, int isbn ){
        Book bookk = new Book(name, author, pubYear, isbn);
        books.add(bookk);
    }

    public void removeBook( int ISBN){
        boolean flag = true ;
        for(Book i : books){
            if( i.getIsbn() == ISBN ){
                books.remove(books.indexOf(i));
                flag = false ;
            }
        }
        if(flag)
            System.out.println("book was not found");
    }
    public int amountof (int ISBN){
        int count =0 ;
        for(Book i: books){
            if(i.getIsbn()==ISBN)
                count++;
        }
        return count ;
    }

    public void searchBook(int ISBN){
        boolean flag = true ;
        for(Book i : books){
            if(i.getIsbn() == ISBN ){
                System.out.println(i);
                flag = false ;
            }
            if(flag)
                System.out.println("book was not found");
        }
    }

    public void updateBook(int ISBN){
        int count  =0 ;
        boolean flag = true ;
        for(Book i : books){
            if(i.getIsbn()==ISBN) {
                count++;
                flag = false ;
            }
        }
        if(flag)
            System.out.println("book was not found");
        else{
        if(count>1)
            System.out.format("There are %d many left from book with ISBN: %d" , count , ISBN );
        else
            System.out.format("There is 1 left from book with ISBN: %d" , ISBN );
        }
    }

    public void doesBookExist(int ISBN){
        boolean flag = true ;
        for(Book i :books){
            if(i.getIsbn()==ISBN) {
                System.out.format("Book with ISBN: %d does exist", ISBN);
                flag = false;
            }
        }
        if(flag)
            System.out.format("Book with ISBN: %d does not exist", ISBN);
    }

    public void increaseBook(String name, String author, int pubYear, int ISBN  , int amount  , String username){
        for(int i=0 ; i<amount ; i++){
            for(Book p : borrowedBooks.keySet()){
                if (p.getIsbn() == ISBN)
                    borrowedBooks.remove(p , username);
            }
            for (Book b : books) {
                Book book = new Book(name , author , pubYear , ISBN) ;
                if (b.getIsbn() == ISBN)
                    books.add(book);
            }

        }
    }

    public void decreaseBook(int ISBN , int amount , String username){
     if(amountof(ISBN)>= amount){
         for(int i=0 ; i<amount ; i++){
             for(Book p : borrowedBooks.keySet()){
                 if (p.getIsbn() == ISBN)
                   borrowedBooks.put(p , username);
             }
             for (Book b : books) {
                 if (b.getIsbn() == ISBN)
                     books.remove(books.indexOf(b));
             }

         }
     }
     else
         System.out.println("not enough books exist to do wanted action");
    }

    //user related functions

    public void addUser(String username , String pass){
        user.usersignup( username , pass);
    }

    public void removeUser(String username ,String pass){
            user.userremove(username);
    }

    public void searchUser(String username){
        user.usersearch(username);
    }

    public void updateUser(){

    }

    public void doesUserExist(String username){
        user.usersearch(username);
    }

    //librarian related functions

    public void addLibrarian(String username , String pass){
        librarian.libsignup(username , pass);
    }

    public void removeLibrarian(String username){
        librarian.removeLibrarian(username);
    }

    public void searchLibrarian(String username){
        librarian.libsearch(username);
    }

    public void updateLibrarian(){

    }

    public void doesLibrarianExist(){
        //TODO
    }


}
