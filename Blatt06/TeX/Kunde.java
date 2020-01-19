import java.util.Collection;
import java.util.ArrayList;

class Kunde {
    protected String kundenId;
    protected String name;
    protected Collection<Bestellung> buchung = new ArrayList<Bestellung>();

    public Kunde(String kId, String n){
        kundenId = kId;
        name = n;
    }

    public String getKundenId(){return kundenId;}
    public void setKundenId(String kId){kundenId = kId;}

    public String getName(){return name;}
    public void setName(String newName) {name = newName;}

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