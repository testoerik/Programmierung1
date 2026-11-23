/*
 * @author: Erik Hagmüller
 */
public class SudokuField {
	/*
	 * Die Attribute value und fixedValue sind beide auf private gesetzt. Damit
	 * willen wir den Zugriff von Dritten unterbinden.
	 */

	private int value;
	private boolean fixedValue;

	/*
	 * Beim Aufruf des Default-Konstruktor soll die eingetragene Zahl 0 und
	 * fixedValue = false sein. Da fixedValue=false, können wir die eingetragene
	 * Zahl über die setValue()-Methode beliebig oft ändern.
	 */
	public SudokuField() {
		this.value = 0;
		this.fixedValue = false;
	}

	/*
	 * Nun wird aber ein Feld mit einer festen Zahl erzeugt. Diese soll nicht mehr geändert werden können. Daher fixedValue=true.
	 */
	public SudokuField(int number) {
		this.value = number;
		this.fixedValue = true;
	}

	/*
	 * Der Benutzer kann über die getValue()-Mehtode die eingetragene Zahl abrufen.
	 */
	public int getValue() {
		return this.value;
	}
	
	/*
	 * Mit setValue() kann eine Zahl in das Feld eingetragen werden. Jedoch nur unter der Vorraussetzung, das dieses Feld keine fest-eingetragene Zahl hat.
	 */
	public void setValue(int number) {
		if (this.fixedValue) {
			return;
		} else {
			this.value = number;
		}
	}

	public void clear() {
		if (this.fixedValue) {
			return;
		} else {
			this.value = 0;
		}
	}

	public boolean isFixed() {
		return this.fixedValue;
	}

	public boolean isEmpty() {
		return this.value == 0;
	}
}
