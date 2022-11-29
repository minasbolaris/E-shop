import java.io.File;
import java.io.IOException;
import java.util.*;

public class User
{
    private String name;
    private String email;
    private ArrayList <User> UserList = new ArrayList <User>();// Δημιουργώ ArrayList  για να ελέγχο των χρηστών
    
 public User(String aName, String anEmail){
       name = aName;
       email = anEmail;
              
    }
    
 public String getName(){
     return name;
    }

  public void checkUser(){
      String uName;
    for(User U : UserList){
        uName = U.getName();
        if(uName == name)
         System.out.println("This User does already exist");
         else 
          System.out.println("This User doesn't exist. You have to create an account first");
         
        
     }
     
    }
}