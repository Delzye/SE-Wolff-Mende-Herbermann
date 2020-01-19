import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Antonius Mende 461 328, Anika Herbermann 461 655, Matthias Wolff 458 766
 * @version 5.1.20
 */
public class Pizza implements java.io.Serializable
{   
    protected int pizzaid;
    protected String name;
    protected double preis;
    protected Collection<Bestellung> liste = new ArrayList<Bestellung>();
    
    public int getPizzaid(){ return pizzaid;}
    public void setPizzaid(int id){ pizzaid = id;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public double getPreis(){ return preis;}
    public void setPreis(double preis){ this.preis = preis;}
    
    public Collection<Bestellung> getListe() {return liste;}
    public void setListe(Collection<Bestellung> coll){liste = coll;}
    public void addListe(Bestellung vorgang) {liste.add(vorgang);}
    public void removeListe(Bestellung vorgang) {liste.remove(vorgang);}
}
