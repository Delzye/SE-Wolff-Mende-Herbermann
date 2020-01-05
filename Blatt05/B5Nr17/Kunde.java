import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

/** 
 * @author (Ihr Name) 
 * @version 5.1.20
 */
@Entity
public class Kunde implements java.io.Serializable
{   
    protected int kundenid;
    protected String name;
    protected Collection<Bestellung> buchung = new ArrayList<Bestellung>();
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    public int getKundenid(){ return kundenid;}
    public void setKundenid(int id){ kundenid = id;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="kunde")
    public Collection<Bestellung> getBuchung() {return buchung;}
    public void setBuchung(Collection<Bestellung> coll){buchung = coll;}
    public void addBuchung(Bestellung vorgang) {buchung.add(vorgang);}
    public void removeBuchung(Bestellung vorgang) {buchung.remove(vorgang);}
}
