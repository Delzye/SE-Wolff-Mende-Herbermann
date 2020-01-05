import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Aufgabe 17a
 * 
 * @author Antonius Mende - 461 328
 * @author Anika Herbermann - 461 655
 * @author Matthias Wolff - 458 766
 * 
 * @author "Gruppe_A"
 */
 
 
 
/**
Kunden-Klasse
*/

@Entity
public class Kunde implements java.io.Serializable{
    //Primaerschluessel
    protected String kundenId;
    protected String name;
    protected Collection<Bestellung> bestellungen = new ArrayList<Bestellung>();
    
    public Kunde(String name){
        this.name = name;
    }
    
    //eindeutige KundenIDs sollen automatisch generiert werden
    @Id @ GeneratedValue(stragtegy=GenerationType.AUTO)
    public String getKundenId(){return this.kundenId;}
    public void setKundenId(String kundenId){this.kundenId=kundenId;}
    
    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}
    
    //Ein Kunde ist mit mehreren Bestellungen verbunden
    @OneToMany
    public Collection<Bestellung> getBestellungen(){return this.bestellungen;}
    public void setBestellungen(Collection<Bestellung> bestellungen){this.bestellungen = bestellungen}
    public void addBuchung(Bestellung buchung){this.bestellungen.add(buchung);}
    public void removeBuchung(Bestellung buchung){this.bestellungen.remove(buchung);}
        
}
/**
Bestellungs-Klasse
*/

@Entity
public class Bestellung implements java.io.Serializable{
    //Primaerschluessel
    protected int bestellungsId;
    protected Date zeitpunkt;
    protected Kunde kunde;
    protected Pizza pizza;
    
    public Bestellung(Kunde k, Pizza p){
        this.kunde = k;
        this.pizza = p;
    }
    
    //eindeutige BestellungsIDs sollen automatisch generiert werden
    @Id @ GeneratedValue(stragtegy=GenerationType.AUTO)
    public int getBestellungsId(){return this.bestellungsId;}
    public void setBestellungsId(int bestellungsId){this.bestellungsId=bestellungsId;}
    
    public Date getZeitpunkt(){return this.zeitpunkt;}
    public void setZeitpunkt(Date zeitpunkt){this.zeitpunkt = zeitpunkt;}
    
    //Mehrere Bestellungen sind mit einer Pizza verbunden
    @ManyToOne
    public Pizza getPizza(){return this.pizza;}
    public void setPizza(Pizza pizza){this.pizza = pizza;}
    //Mehrere Bestellungen sind mit einem Kunden verbunden
    @ManyToOne
    public Kunde getKunde(){return this.kunde;}
    public void setKunde(Kunde kunde){this.kunde = kunde;}
        
}

/**
Pizza-Klasse
*/

@Entity
public class Pizza implements java.io.Serializable{
    //Primaerschluessel
    protected int pizzaId;
    protected double preis;
    protected String name;
    protected Collection<Bestellung> bestellungen = new ArrayList<Bestellung>();
    
    public Pizza(String name, double preis){
        this.name = name;
        this.preis = preis;
    }
    
    //eindeutige PizzaIDs sollen automatisch generiert werden
    @Id @ GeneratedValue(stragtegy=GenerationType.AUTO)
    public int getPizzaId(){return this.pizzaId;}
    public void setPizzaId(int pizzaId){this.pizzaId=pizzaId;}
    
    public String getName(){return this.name;}
    public void setName(String name){this.name=name;}
    
    //Eine Pizza ist mit mehreren Bestellungen verbunden
    @OneToMany
    public Collection<Bestellung> getBestellungen(){return this.bestellungen;}
    public void setBestellungen(Collection<Bestellung> bestellungen){this.bestellungen = bestellungen}
    public void addBestellung(bestellung){this.bestellungen.add(bestellung);}
    public void removeBestellung(bestellung){this.bestellungen.remove(bestellung);}
        
}