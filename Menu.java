 
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;



public class Menu extends User{

    //Constructor
    Menu(){
    }
    
    //Methods
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    //This page offers the user the option to go back to another page (it's customizable)
    public void goBackPage(String a, String b, String c, String back) {
        System.out.println(a);
        System.out.println("[1] " + b + "\n" + "[0] " + c + "\n");
        switch(inputCheck(1, 0)) {
               case 1 :
               break;  
               case 0:
              switch(back) {
              case "Start Page":
                startPage();
                break;
               case "User Menu":
                userMenuPage();
                break;
               case "User Settings":
                userSettingsPage();
                
            }
            break;
        }
    }
    
    //Pauses the program
    public static void ok() {
        System.out.println("\n[1] Ok\n");
        inputCheck(1, 1);
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    //Hello Page
    public void helloPage() {
        System.out.println("###  Hello user! ###\n");
        System.out.println("### In order to select the option you want, you have to type the code that is displayed next to the option ###");
        startPage();
    }
    public static void WriteUsersToFile()
	{
	    String fileName = "USERS.txt";
	    try {
	        try {
	         PrintWriter writer = new PrintWriter("USERS.txt");
		 writer.print("");
		 writer.close();
	        }catch (FileNotFoundException fe) {}
	        FileOutputStream f = new FileOutputStream(new File(fileName));
		ObjectOutputStream o = new ObjectOutputStream(f);
		for (User u : userList){
	          o.writeObject(u);	    
                }
                   o.close();
                   f.close();
	        } catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
		
             }
	   }
    
    //This is the first page of the program, where the user chooses whether to login, register, get help or exit
    public void startPage() {
        System.out.println("\n" + "-~~~~~~~~~-\n" + " Main Menu\n" + "-~~~~~~~~~-\n");
        System.out.println("[1] Login\n" + "[2] Register\n" + "[0] Exit\n");
        
        switch(inputCheck(2, 0)) {
           case 1 :
                
            loginPage();
            break;  
           case 2:
            
            registerPage();
            break;
           case 0:
                Menu.WriteUsersToFile();
            exitPage();
            break;
        }   
    }
    
    
    //This is the login page
    private void loginPage() {
        System.out.println("\n" + "-~~~~~-\n" + " Login\n" + "-~~~~~-\n");
        login();
        ok();
        userWelcomePage();
    }
    
    //This is the register page
    private void registerPage() {
        System.out.println("\n" + "-~~~~~~~~-\n" + " Register\n" + "-~~~~~~~~-\n");
        register();
        goBackPage("### Do you want to login or go back? ###\n", "Login", "Back", "Start Page");
        userWelcomePage();
    }

    //This is the exit page
    private void exitPage() {
        goBackPage("\n### Are you sure you want to exit? ###\n", "Yes", "No", "Start Page");
        System.exit(0); 
    }
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    
    //This is the user welcome page
    /**public static void userWelcomePage() {
        if(Ul.isFirstLogin()) {
            System.out.println("\n### This is your first login. Please enter your first name and last name, so that your friends know who you are. ###\n");
            Ul.setFirstName(chooseFirstName());
            Ul.setLastName(chooseLastName());
            Ul.isntFirstLogin();
            System.out.println("\n### Welcome " + Ul.getFirstName() + "! ###");
            }
        else {
            System.out.println("\n" + "### Welcome Back " + Ul.getFirstName() + "! ###");
        }
        userMenuPage();
    }*/
    
    
    /**private static changeNamePage() { 
        System.out.println("\n" + "-~~~~~~~~~~~-\n" + " Change Name\n" + "-~~~~~~~~~~~-\n");
        Ul.setFirstName(chooseFirstName());
        Ul.setLastName(chooseLastName());
        System.out.println("\n### Your first name and last name have been successfully changed! ###");
        ok();
        userSettingsPage();
    }*/
            
    
    
}