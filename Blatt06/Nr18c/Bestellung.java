import java.util.ArrayList;
import java.util.Collection;
import java.time.LocalDate;

/**
 * @author Antonius Mende 461 328, Anika Herbermann 461 655, Matthias Wolff 458 766
 * @version 5.1.20
 */
public class Bestellung implements java.io.Serializable
{   
    protected int buchungsid;
    protected LocalDate buchungsZeitpunkt;
    private Kunde kunde;
    private Pizza pizza;
    
    public int getBuchungsid(){ return buchungsid;}
    public void setBuchungsid(int id){ buchungsid = id;}
    
    public LocalDate getZeitpunkt() {return buchungsZeitpunkt;}
    public void setZeitpunkt(LocalDate zeitpunkt) {this.buchungsZeitpunkt = zeitpunkt;}
    
    public Kunde getKunde(){ return kunde;}
    public void setKunde(Kunde k){ kunde = k;}
    
    public Pizza getPizza(){ return pizza;}
    public void setPizza(Pizza p){ pizza = p;}
    
    
    public Bestellung(Kunde k, Pizza p)
    {
        kunde = k;
        pizza = p;
    }
}
