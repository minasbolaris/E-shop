import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.NumberFormat;

public class Buyer extends Item {
    private ArrayList <Buyer> Orders = new ArrayList <Buyer>();
    boolean order = true;
    protected int bonus ;
    protected Item[] cart;
    protected int itemCount;
    protected double totalPrice;
    protected int capacity;
    protected int basket;
    protected  String Order;
      Buyer(){
        
        
        }
    

    public void Welcome(){
        System.out.println("Welcome to our Eshop");
    
    }
   
    
    public void  awardBonus(){
           
             
            System.out.println("MEAN OF PAYMENT"); //tropos pliromis
            System.out.println(" 1: Cash " + " 2: Prepaid Card ");
            Scanner wayofPayment = new Scanner(System.in);
             Integer payment = wayofPayment.nextInt();
             
             bonus=0;
             
           
           while(order==true){
            
            
            
            switch(payment){
                
                
               case 1:
               bonus+=30; //random timi
               System.out.println(bonus);
               break;
               case 2:
               bonus+=50; //random timi
               System.out.println(bonus);
               break;
               
            }
             Scanner decision = new Scanner(System.in);
             System.out.println("DO YOU WANT OTHER ORDER?");
             System.out.println(" 1: Yes " + " 2 : No ");
             Integer order = decision.nextInt();
                switch(order){
                case 1:
                System.out.println(); //prepei na ksanagirizei panw
                case 2:
                break;
                
                
                
                
             
               }
             
           }
            
            
         
          
    }
    
    public void setbuyerCategory(){
        
        if(bonus>100 && bonus<200){
          System.out.println("buyerCategory:SILVER");
          System.out.println("You have 50% discount of your shipping");
        }
        if(bonus>200){
          System.out.println("buyerCategory:GOLD");
          System.out.println("You have free shipping");
        }
        if(bonus<100){
          System.out.println("buyerCategory:BRONZE");
        }
        
    }  
    public void placeOrder(){
              capacity = 5;
              Order = new Item[capacity];
              itemCount = 0;
              totalPrice = 0.0;
    }
    public void addToBasket(String name, double price, int quantity){
      Item temp = new Item(name, price , quantity);
      totalPrice += (price * quantity);
      itemCount += quantity;
      basket[itemCount] = temp;
      if (itemCount == capacity)
      {     
            increaseSize();
        }
    }

}


