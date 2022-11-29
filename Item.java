public class Item 
{
    protected String name;
    protected  double price;
    protected String description;
    protected int stock;
    protected int id;
     
    public  Item(String aname, double aprice, String adescription, int astock, int anid){
        aname = name;
        aprice = price;
        adescription = description;
        astock = stock;
        anid = id;
    }
    public String getName(String[] args){
        
        return name;
        
    }
    public String getDescription(){
        return description;
    }
        
    public double getPrice(){
        return price;
    }
    public int getStock(){
        return stock;
        
        
    }
    public int getId(){
        return id;
    }
    public  String[] getDetails1(String name, String description){
        String[] table1 = new String[2];
        table1[1] = name;
        table1[2] = description;
        return table1;
        
    }
    public double[] getDetails2(double price){
    double[] table2 = new double[1];
        table2[1] = price;
        return table2;
    }      
    public int[] getDetails3(int stock, int id){
        int[] table3 = new int[2];
        table3[1] = stock;
        table3[2] = id;
        return table3;
    }

   public String toString(){
       return String.format("%d/%d/%d/%d/%d",name, price, description, stock, id);
    }
} 