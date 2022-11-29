 

/**
 * 
 *
 * @author (John,Alex,Minas)
 * @version (1st)
 */
public class Notebook extends Item
{
    private int nunOfSections;
 
    public Notebook(String aname, double aprice, String adescription, int astock, int anid,int anunOfSections){
        super(aname, aprice , adescription, astock, anid);
        anunOfSections = nunOfSections;
    }
    
    public int getNunOfSections(){
        return nunOfSections;
    }
}