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
        /*
        Es muss nicht geprueft werden, ob eine solche Bestellung schon existiert, da man mehrere Bestellungen für einen Kunden mit gleicher Pizza erlauben muss.
        Der Zeitpunkt reicht nicht aus, um "doppelte" Bestellungen zu finden, da der zeitpunkt auf Millisekunden genau ist
        und somit alleine durch kurze Laufzeiten des Programms nichtmehr übereinstimmt.
        
        Man koennte ein Feature einbauen, sodass ein Kunde innerhalb von X Sekunden nur einmal die gleiche Pizza bestellen kann,
        um Eingabefehler durch den Kunden (z.B. doppeltes Klicken auf Bestellen) abzufangen
        */
        Bestellung bestellung = new Bestellung(k,p);
        bestellung.setZeitpunkt(zeitpunkt);
        em.persist(bestellung);
         
    
}