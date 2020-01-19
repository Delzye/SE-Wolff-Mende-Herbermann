import java.util.ArrayList;
import java.util.Collection;
class Pizza {
    protected int pizzaId;
    protected double preis;
    protected String name;
    protected Collection<Bestellung> bestellungen = new ArrayList<Bestellung>();

    public int getPizzaId(){return pizzaId;}
    public void setPizzaId(int pId){pizzaId=pId;}

    public double getPreis(){return preis;}
    public void setPreis(dpuble p) {preis=p;}

    public String getName(){return name;}
    public void setName(String n){name=n;}

    public Collection<Bestellung> getBestellungen(){return bestellungen;}
    public void setBestellungen(Collection<Bestellung> coll){bestellungen = coll;}
    public void addBestellung(Bestellung vorgang){bestellungen.add(vorgang);}
    public void removeBestellung(Bestellung vorgang){bestellungen.remove(vorgang);}
}