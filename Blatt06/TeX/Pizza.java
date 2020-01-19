import java.util.ArrayList;
import java.util.Collection;

class Pizza {
    protected int pizzaId;
    protected double preis;
    protected String name;
    protected Collection<Bestellung> buchung = new ArrayList<Bestellung>();

    public Pizza(int pId, double p, String n){
        pizzaId = pId;
        preis = p;
        name = n;
    }

    public int getPizzaId(){return pizzaId;}
    public void setPizzaId(int pId){pizzaId=pId;}

    public double getPreis(){return preis;}
    public void setPreis(double p) {preis=p;}

    public String getName(){return name;}
    public void setName(String n){name=n;}

    public Collection<Bestellung> getBuchung() {
        return buchung;
    }
    public void setBuchung(Collection<Bestellung> coll) {
        buchung = coll;
    }
    public void addBuchung(Bestellung vorgang) {
        buchung.add(vorgang);
    }
    public void removeBuchung(Bestellung vorgang) {
        buchung.remove(vorgang);
    }
}