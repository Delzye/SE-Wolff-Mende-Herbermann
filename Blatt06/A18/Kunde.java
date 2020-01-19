package a18;

import java.util.LinkedList;

/**
 * 
 * @author Antonius Mende - 461 328
 * @author Anika Herbermann - 461 655
 * @author Matthias Wolff - 458 766
 * 
 * @author "Gruppe_A"
 */
public class Kunde {
	protected int kundenId;
	protected String name;
	//Name buchung vorgegeben aus Diagramm
	protected LinkedList<Bestellung> buchung;
	
	public Kunde(int kundenId, String name) {
		this.kundenId = kundenId;
		this.name = name;
		this.buchung = new LinkedList<Bestellung>();
	}

	public int getKundenId() {
		return kundenId;
	}

	public void setKundenId(int kundenId) {
		this.kundenId = kundenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Bestellung> getBuchung() {
		return buchung;
	}

	public void setBuchung(LinkedList<Bestellung> buchung) {
		this.buchung = buchung;
	}
	
	

}
