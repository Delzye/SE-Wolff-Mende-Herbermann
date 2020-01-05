import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

/**
 * @author (Ihr Name) 
 * @version 5.1.20
 */
@Entity
public class Bestellung implements java.io.Serializable
{   
    protected int buchungsid;
    protected DateTime zeitpunkt;
    private Kunde kunde;
    private Pizza pizza;
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    public int getBuchungsid(){ return buchungsid;}
    public void setBuchungsid(int id){ buchungsid = id;}
    
    public DateTime getZeitpunkt() {return zeitpunkt;}
    public void setZeitpunkt(DateTime zeitpunkt) {this.zeitpunkt = zeitpunkt;}
    
    public int getKunde(){ return kunde;}
    public void setKunde(int k){ kunde = k;}
    
    public int getPizza(){ return pizza;}
    public void setPizza(int p){ pizza = p;}
    
    
    public Bestellung(Kunde k, Pizza p)
    {
        kunde = k;
        pizza = p;
    }
}
