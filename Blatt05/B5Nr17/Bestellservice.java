import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

/** 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Bestellservice
{
    //...
    public interface BestellFassade
    {
        public void erstelleBestellung(Kunde k, Pizza p) throws Exception;
    }
    
    //...
    @PermitAll
    @Stateless
    public class Bestellverwaltung implements BestellFassade
    {
        @PersistenceContext
        private EntityManager em;
        
        @TransactionAttribute(TransactionAttributeType.REQUIRED)
        public void erstelleBestellung(Kunde k, Pizza p) throws Exception
        {
            Query q = em.createQuery("SELECT COUNT(*) FROM Kunde k WHERE k.name = :n");
            q.setParameter("n",name);
            if (((Long) q.getSingleResult()).intValue() == 0)
            {
                Bestellung bestellung = new Bestellung();
                bestellung.setKunde(k);
                bestellung.setPizza(p);
                em.persist(bestellung);
            }
            else
            {
                throw new Exception("Name bereits verwendet");
            }
        }
    }
}
