import java.util.ArrayList;
import java.util.Collection;

/** 
 * @author Antonius Mende 461 328, Anika Herbermann 461 655, Matthias Wolff 458 766
 * @version 5.1.20
 */
public class Kunde implements java.io.Serializable
{   
    protected int kundenid;
    protected String name;
    protected Collection<Bestellung> buchung = new ArrayList<Bestellung>();
    
    public int getKundenid(){ return kundenid;}
    public void setKundenid(int id){ kundenid = id;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public Collection<Bestellung> getBuchung() {return buchung;}
    public void setBuchung(Collection<Bestellung> coll){buchung = coll;}
    public void addBuchung(Bestellung vorgang) {buchung.add(vorgang);}
    public void removeBuchung(Bestellung vorgang) {buchung.remove(vorgang);}
}
