 

/**
 * 
 *
 * @author (John,Alex,Minas)
 * @version (1st)
 */
public class Pencil extends Item
{
    private double tipSize;//H,B,HB,
    private double H;
    private double B;
    private double HB;
    
    public Pencil(String aname, double aprice, String adescription, int astock, int anid, double atipSize, double aH,double aB, double aHB){
        super(aname, aprice , adescription, astock, anid);
        atipSize = tipSize;
        aH = H;
        aB = B;
        aHB = HB;
    }
    public double getTipSize(){
        return tipSize;
    }
   
    public double getH(){
        return H;
        
    }
    
    public double getB(){
        return B;
    }
    
    public double getHB(){
        return HB;
    }
    
     
}