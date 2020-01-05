
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

/**
 * @author (Ihr Name) 
 * @version 5.1.20
 */
@Entity
public class Pizza implements java.io.Serializable
{   
    protected int pizzaid;
    protected String name;
    protected double preis;
    protected Collection<Bestellung> pizza = new ArrayList<Bestellung>();
    
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    public int getPizzaid(){ return pizzaid;}
    public void setPizzaid(int id){ pizzaid = id;}
    
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    public double getPreis(){ return preis;}
    public void setPreis(double preis){ this.preis = preis;}
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="pizza")
    public Collection<Bestellung> getPizza() {return pizza;}
    public void setPizza(Collection<Bestellung> coll){pizza = coll;}
    public void addPizza(Bestellung vorgang) {pizza.add(vorgang);}
    public void removePizza(Bestellung vorgang) {pizza.remove(vorgang);}
}
