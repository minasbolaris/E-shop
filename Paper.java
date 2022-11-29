 

/**
 * 
 *
 * @author (John,Alex,Minas)
 * @version (1st)
 */
public class Paper extends Item
{
    private int weight;
    private int pages;
    
    public Paper(String aname, double aprice, String adescription, int astock, int anid, int aweight, int apages){
        super(aname, aprice , adescription, astock, anid);
        aweight = weight; //prepei na paei anapoda(!)
        apages = pages;
    }
    
    public int getWeight(){
        return weight;
        
        
    }
    
    public int getPages(){
        return pages;
    }
}


