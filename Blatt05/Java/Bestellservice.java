@Stateless
public class Bestellservice{
    @PersistenceContext
private static EntityManager em;

public static void erstelleBestellung(Kunde k, Pizza p){
    Betellung b = new Bestellung(k,p);
    em.persist(b);
    }
}