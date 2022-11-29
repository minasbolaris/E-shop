 

/**
 * 
 *
 * @author (John,Alex,Minas)
 * @version (1st)
 */

public class Pen extends Item
{
    private String color;
    private double tipSize;
    
    public Pen( String aname, double aprice, String adescription, int astock, int anid,String acolor, double atipSize){
        super(aname, aprice , adescription, astock, anid);
        acolor = color;
        atipSize = tipSize;
    }
    
    
    public String getColor(){
            return color;
        
        
    }
    
    public double getTipSize(){
        return tipSize;
    }
 }