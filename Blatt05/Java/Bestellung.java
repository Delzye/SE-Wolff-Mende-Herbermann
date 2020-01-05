class Bestellung{
    @Id @GeneratedValue
    protected int bestellungsId;
    protected DateTime zeitpunkt;
    protected Kunde kunde;
    protected Pizza pizza;

    public int getBestellungsId(){return bestellungsId;}
    public void setBestellungsId(int bId){bestellungsId =bId;}

    public DateTime getZeitpunkt(){return zeitpunkt;}
    public void setZeitpunkt(DateTime zp){zeitpunkt = zp;}

    Bestellung(Kunde k, Pizza p){
        kunde=k;
        pizza=p;
    }
}