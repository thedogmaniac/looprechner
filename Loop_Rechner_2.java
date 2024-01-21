package random;

import java.util.Scanner;

public class Loop_Rechner_2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// TO-DO:
		// - INPUT-CHECK ob Buchstaben statt Zahlen genutzt werden und dementsprechend
		// einen Error werfen
		// - Menü nach jeder Rechnung ob mit selber Zahl weiter gerechnet werden soll
		// (mit der Frage für die gewünschte Rechenart),
		// oder ob von vorne Angefangen werden soll | Bei jeder Selektion wird die
		// momentane Zahl automatisch angezeigt

		// Anfang des Programmes, hier wird dem User gefragt eine beliebige Zahl
		// einzugeben
		Scanner sc = new Scanner(System.in);
		System.out.printf(" This is a simple self-made calculator. What number do you choose? ");
		float zahl = sc.nextFloat();
		System.out.printf(" Here it is: %.6f%n", zahl);
		// Initiierung der input variable
		String input;
		System.out.printf(" What do you wish to do with this number? %n ---------------- %n");
		System.out.printf(
				" P for Product %n S for Sum %n D for Difference %n Q for Quotient %n E for Exit %n ---------------- %n");

		input = sc.next();
		// Die Initiierung vom while-loop
		int i = 1;
		@SuppressWarnings("unused")
		boolean alldone = false;
		while (i <= 6) {
			// Der Inkrement
			i++;
			String choice = input;
			switch (choice) { // Ein switch um beim Code die if-klauseln zu reduzieren
			case "P":
				if (input.equalsIgnoreCase("P")) {
					System.out.printf(" What number do you want to multiply by? ");
					float uin1 = sc.nextFloat();
					System.out.printf(" Your calculation: %.6f * %.6f%n", zahl, uin1);
					float ergebnisM = zahl * uin1;
					System.out.printf(" Your result is: %.6f%n%n", ergebnisM);
				}

			case "S":
				if (input.equalsIgnoreCase("S")) {
					System.out.printf(" What number do you want to add? ");
					float uin1 = sc.nextFloat();
					System.out.printf(" Your calculation: %.6f + %.6f%n", zahl, uin1);
					float ergebnisA = zahl + uin1;
					System.out.printf(" Your result is: %.6f%n%n", ergebnisA);
					break;
				}

			case "D":
				if (input.equalsIgnoreCase("D")) {
					System.out.printf(" What number do you want to subtract? ");
					float uin1 = sc.nextFloat();
					System.out.printf(" Your calculation: %.6f - %.0f%n", zahl, uin1);
					float ergebnisS = zahl - uin1;
					System.out.printf(" Your result is: %.6f%n%n", ergebnisS);
					break;
				}

			case "Q":
				if (input.equalsIgnoreCase("Q")) {
					System.out.printf(" What number do you want to divide by? ");
					float uin1 = sc.nextFloat();
					System.out.printf(" Your calculation: %.6f / %.6f%n", zahl, uin1);
					float ergebnisD = zahl / uin1;
					System.out.printf(" Your result is: %.6f%n%n", ergebnisD);
					break;
				}

			case "E":
				if (input.equalsIgnoreCase("E")) {
					System.out.printf("You terminated the Program. Please start again.%n");
					alldone = true;
					return;
				}

			}

			// Eine kleine Information für den Nutzer dass der Loop zu Ende gegangen ist
			System.out.printf(" Thank you for supporting maths! See you next time. %n");
		}
	}
}