import java.util.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.HashMap;


public class ShoppingCart{
 private ArrayList <ShoppingCart> Bucket = new ArrayList <ShoppingCart>();
 private ArrayList <ShoppingCart> Confirm = new ArrayList <ShoppingCart>();

   public ItemOrdered orderList;
   ShoppingCart decrease; //dimiourgia antikeimenwn
   ShoppingCart checkObj;
   Buyer transfer = new Buyer();
   double price=0;
   double cost;
   Buyer aBuyer = new Buyer(); //dimiourgia antikeimenou apo th Buyer class
   boolean more = true;
   ShoppingCart timi;
  
   
   
 
    public void Quantity(){  
      
    Map <String,Integer> item = new HashMap<>(); 
     item.put("Pen",1); //oi posotites einai tuxaies.Prepei na tairiazoun me to stock ths Item
     item.put("Pencil",20); //ksanakoita item 
     item.put("Notebook",25);
     item.put("Paper",10);
     
     System.out.println(item);
    
    }
     
   

    public void  addItemOrdered(){ 
     
      
      
      //prosthetw ta proionta stin orderList
     
      System.out.println("The availiable products are: "+orderList);
      System.out.println("CHOOSE PRODUCT"); //epilegw pio proion thelw 
      while(more){
      Scanner selection = new Scanner(System.in);
      int choice = selection.nextInt();
       boolean more = true;
         
      
       
           
     
        switch(choice){
          case 1:
          System.out.println("You choose Pen");
          break;
         
           
          case 2:
          System.out.println("You choose Pencil");
          break;
          
          case 3:
          System.out.println("You choose Notebook");
          break;
          
          case 4:
          System.out.println("You choose Paper");
          break;
          
           
        }
        
           
        
        
      
       } 
       
       
       
      
    }
    public void parseInt(){ //methodos gia na allaksw apo string se int
        String epilogi;
       
    
    }
     
    
   public void removeItemOrdered(){
       
     
      
      System.out.println("Enter the item which you want to remove: ");
      Scanner decision = new Scanner(System.in);
      String epilogi = decision.nextLine();
      System.out.println("You remove the item");
      
       switch(epilogi){
        
        
        
        
        
        
        
        
        }
        
        
    }
    
   public void changeItemOrderedQuantity(){
       
       
    }
    
   public void showCart(){
       //apo tin placeOrder()
       System.out.println("You have order this items ");
       for (Item I : Item.orderList){
           System.out.println(I.getName());
        }
       
       
    }
    
   public void clearCart(){
       ArrayList <String> orderList = new ArrayList<>();
       decrease.removeItemOrdered(); //kalesma removeItemOrderd
       System.out.println("Clear the list");
       orderList.remove("Pen"); //i afairesi listas prepei na ginei apo ti removeItemOrdered()
       orderList.remove("Pencil");
       orderList.remove("Notebook");
       orderList.remove("Paper");
        //afairesi
    }
   
   public void checkout(){ 
       
       ArrayList<String> orderList = new ArrayList<>();//dilwsi listas
      int answer;
     
      
      System.out.println("Confirm? 1:Yes   2:No");
      Scanner confirm = new Scanner(System.in);
      answer = confirm.nextInt();
       switch(answer){
        case 1:
        aBuyer.awardBonus();
        break;
        case 2:
        System.out.println("No confirm");
        break;
        
        }
        //diagrafi periexomenwn apo tin lista
        orderList.remove("Pen");
        orderList.remove("Pencil");
        orderList.remove("Paper");
        orderList.remove("Notebook");
        double price=0;
       int pontoi = (int) price;
       pontoi += price * (10/100);
       System.out.println(pontoi);
    }
   
   public double calculateNet(){ 
       return price;
       
    }
    
   public  void calcluateCourierCost(){
     
        if(cost>3){
          cost = 0.02*price;
          System.out.println(cost);
        }
        transfer.setbuyerCategory(); //antistoixhsh ShoppingCart me Buyer
    }
}
