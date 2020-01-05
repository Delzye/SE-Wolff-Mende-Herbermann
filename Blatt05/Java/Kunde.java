import java.util.Collection;
import java.util.ArrayList;

@Entity
class Kunde {
    @Id
    @GeneratedValue
    protected String kundenId;
    protected String name;
    protected Collection<Bestellung> buchung = new ArrayList<Bestellung>();

    public String getKundenId(){return kundenId;}
    public void setKundenId(String kId){kundenId = kId;}

    public String getName(){return name;}
    public void setName(String newName) {name = newName;}

    public Collection<Bestellung> getBestellungen(){return bestellungen;}
    public void setBestellungen(Collection<Bestellung> coll){bestellungen = coll;}
    public void addBestellung(Bestellung vorgang){bestellungen.add(vorgang);}
    public void removeBestellung(Bestellung vorgang){bestellungen.remove(vorgang);}
}