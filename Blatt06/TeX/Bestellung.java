import java.time.LocalDateTime;
class Bestellung{
    protected int buchungsId;
    protected LocalDateTime zeitpunkt;
    protected Kunde kunde;
    protected Pizza pizza;

    Bestellung(LocalDateTime z, int bId, Kunde k, Pizza p){
        zeitpunkt = z;
        buchungsId = bId;
        kunde=k;
        pizza=p;
    }
    
    public int getBuchungsId(){return buchungsId;}
    public void setBuchungsId(int bId){buchungsId =bId;}

    public LocalDateTime getZeitpunkt(){return zeitpunkt;}
    public void setZeitpunkt(LocalDateTime zp){zeitpunkt = zp;}

    public Kunde getKunde(){ return kunde;}
    public void setKunde(Kunde k){kunde = k;}

    public Pizza getPizza(){return pizza;}
    public void setPizza(Pizza p){pizza =p;}
}