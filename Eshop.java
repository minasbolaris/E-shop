import java.util.ArrayList;
import java.util.*;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class Eshop
{   
    private String eshopName;
    private Owner owner;
    private Item[] items = new Item[4];
    private int counter=0;
    
    public ArrayList <Eshop> itemsList = new ArrayList <Eshop>(); //isws kai na prepei na afairethei 
    ArrayList <Eshop> buyersList = new ArrayList <Eshop>();
    
    public Eshop(String aName){
      eshopName = aName;
      
    }
    public String getEshop(){
      return eshopName;
    }
    
    
    
   //ftiaxnw ti methodo wste na prosthesw stin itemsList  ta diathesima proionta 
   public void Prod(){
       
      ArrayList <String> itemsList = new ArrayList <String>();

      itemsList.add(new String("Pen"));
      itemsList.add(new String("Pencil"));
      itemsList.add(new String("Notebook"));
      itemsList.add(new String("Paper"));
      System.out.println("The availiable products are: "+itemsList);
      
    }
      //i methodos auth einai gia na prosthesw tous pelates tou katastimatos sthn buyersLIst
   public void Customers(){ //apo arxeio
     
    ArrayList <String> buyersList = new ArrayList <String>();
    
    
    buyersList.add(new String ("Minas Bolaris"));  //prepei na einai ta idia me auta sti User 
    buyersList.add(new String ("Yannis Siourtos")); 
    buyersList.add(new String("Alexis Tsampas"));
    buyersList.add(new String ("Michael Papadopoulos"));
    buyersList.add(new String ("Ilias Papanikolos"));
    System.out.println("We have " +buyersList.size()+ " clients");
    }
   
    public void addItem(Item anItem){
        try{
         if(counter<4){
            items[counter]= anItem;
            counter++;
            }else{
              System.out.println("No more items");
            }
        } 
        catch(InputMismatchException e){
           System.out.println("It already exists");
        }
    }
    
    public void getItemByld(){
        
        
        
    }
    
    public void removeItem(){  //αλλαγη JOptionPane
        Scanner bucky = new Scanner(System.in);
        System.out.println(bucky.nextLine());
        String selection = JOptionPane.showInputDialog("1:Pen, 2:Pencil, 3:Notebook,4:Paper");
        String pieces = JOptionPane.showInputDialog("Enter the item which you want to remove: ");
         int choice = Integer.parseInt(selection);
        
        switch(choice){
          case 1:
          itemsList.remove("Pen");
          break;
          case 2: 
          itemsList.remove("Pencil");
          break;
          case 3:
          itemsList.remove("Notebook");
          break;
          case 4:
          itemsList.remove("Paper");
          break;
            
            
        
        }
        
    }
    
    public void addBuyer(Buyer aBuyer){ //apo arxeio
     
        
        
    }
    
    public void removeBuyer(){ //apo arxeio
        
        
    }
    
   
      public void updateItemstock(){ //na ftiaksoume to stock
        
        
    }
    
    public void showCategories(){ 
        
        
    }
    
    public void showProductsInCategory(){
        
        
    }
    
    public void showProduct(){
        
        
        
    }
    
    public void checkStatus(){
        
        
    }
    
}
