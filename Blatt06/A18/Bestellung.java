package a18;

import java.util.Date;

/**
 * 
 * @author Antonius Mende - 461 328
 * @author Anika Herbermann - 461 655
 * @author Matthias Wolff - 458 766
 * 
 * @author "Gruppe_A"
 */
public class Bestellung {
	protected Kunde besteller;
	protected Pizza pizza;
	protected int buchungsId;
	protected Date buchungsZeitpunkt;
	
	
	public Bestellung(int buchungsId, Kunde besteller, Pizza pizza) {
		this.besteller = besteller;
		this.pizza = pizza;
		this.buchungsId = buchungsId;
		this.buchungsZeitpunkt = new Date();

	}


	public Kunde getBesteller() {
		return besteller;
	}


	public void setBesteller(Kunde besteller) {
		this.besteller = besteller;
	}


	public Pizza getPizza() {
		return pizza;
	}


	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}


	public int getBuchungsId() {
		return buchungsId;
	}


	public void setBuchungsId(int buchungsId) {
		this.buchungsId = buchungsId;
	}


	public Date getBuchungsZeitpunkt() {
		return buchungsZeitpunkt;
	}


	public void setBuchungsZeitpunkt(Date buchungsZeitpunkt) {
		this.buchungsZeitpunkt = buchungsZeitpunkt;
	}

}
