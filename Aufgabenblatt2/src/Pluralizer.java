
// Author: Erik Hagmüller

public class Pluralizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Benutzer nach Eingabe fragen.
		String eingabe = In.readString("Bitte geben Sie einen englischen Substantiv ein: ");

		// Überprüfung der Eingabe.
		if ((eingabe.endsWith("s")) || (eingabe.endsWith("sh")) || (eingabe.endsWith("ch")) || (eingabe.endsWith("x"))
				|| (eingabe.endsWith("z"))) {
			System.out.print("Der Plural von " + eingabe + " ist " + eingabe + "es.");
		} else if ((eingabe.endsWith("y")) && !((eingabe.endsWith("ay")) || (eingabe.endsWith("ey"))
				|| (eingabe.endsWith("oy")) || (eingabe.endsWith("uy")))) {
			System.out
					.print("Der Plural von " + eingabe + " ist " + eingabe.substring(0, eingabe.length() - 1) + "ies.");
		} else if ((eingabe.equals("man"))) {
			System.out.print("Der Plural von " + eingabe + " ist men.");
		} else if ((eingabe.equals("woman"))) {
			System.out.print("Der Plural von " + eingabe + " ist women.");
		} else if ((eingabe.equals("child"))) {
			System.out.print("Der Plural von " + eingabe + " ist children.");
		} else if ((eingabe.equals("foot"))) {
			System.out.print("Der Plural von " + eingabe + " ist feet.");
		} else if ((eingabe.equals("tooth"))) {
			System.out.print("Der Plural von " + eingabe + " ist teeth.");
		} else if ((eingabe.equals("sheep"))) {
			System.out.print("Der Plural von " + eingabe + " ist sheep.");
		} else if ((eingabe.equals("mouse"))) {
			System.out.print("Der Plural von " + eingabe + " ist mice.");
		} else if ((eingabe.equals("die"))) {
			System.out.print("Der Plural von " + eingabe + " ist dice.");
		} else {
			System.out.print("Der Plural von " + eingabe + " ist " + eingabe + "s.");
		}
	}

}
