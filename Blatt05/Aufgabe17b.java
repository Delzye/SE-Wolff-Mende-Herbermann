import java.util.Date;

/**
 * Aufgabe 17b
 * 
 * @author Antonius Mende - 461 328
 * @author Anika Herbermann - 461 655
 * @author Matthias Wolff - 458 766
 * 
 * @author "Gruppe_A"
 */
 
//Man moechte von aussen auf das Objekt Bestellservice zugreifen, um z.B. neue Bestellungen anzulegen
@Remote
public interface BestellFassade{
    public static void erstelleBestellung(Kunde k, Pizza p) throws Exception;    
}


//Wir brauchen keine Session-uebergreifende Speicherung von Zustaenden
@Stateless
//Jeder darf eine Bestellung aufgeben, egal welche Rolle sie im System haben
@PermitAll
public class Bestellservice implements BestellFassade{
    //injiziere EntityManager
    @PersistenceContext
    private EntityManager em;
    

    //Transaktionen sollen vom System verwaltet werden
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public static void erstelleBestellung(Kunde k, Pizza p) throws Exception{
        //Erstelle jetzigen Zeitpunkt als Date
        Date zeitpunkt = new Date();
        //Pruefe ob eine Bestellung von Kunde k fuer Pizza p mit jetzigem Zeitpunkt bereits existiert
        Query q = em.createQuery("SELECT COUNT(*) FROM Bestellung b WHERE b.kunde.kundenId = :k AND b.pizza.pizzaId = :p AND b.zeitpunkt = :z");
        q.setParameter("k",kunde.getKundenID());
        q.setParameter("p",pizza.getPizzaId());
        //Zeitpunkt muss auch geprueft werden, da ein Kunde mehrmals die gleiche Pizza bestellen kann, aber nicht zur gleichen Zeit
        q.setParameter("z", zeitpunkt);
        //Falls Bestellung noch nicht existiert
        if((Long) q.getSingleResult()).intValue() == 0{
            Bestellung bestellung = new Bestellung(k,p);
            bestellung.setZeitpunkt(zeitpunkt);
            em.persist(bestellung);
        }
        //Falls Bestellung bereits vorhanden
        else{
            throw new Exception("Bestellung existiert bereits!");
        }            
    
}