
public class ZinsDemo {

	public static void main(String[] args) {

		// Beispiel 3a

		double kontostand = 1_000;
		double zinsen = 2.25;

		System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + (zinsen * kontostand / 100));

		// Besipiel 3b
		kontostand = 500;
		zinsen = 0.75;
		double ergebnis = berechneZinsen(kontostand, zinsen);

		System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + ergebnis);

		kontostand = 23_900;
		zinsen = 1.5;
		ergebnis = berechneZinsen(kontostand, zinsen);

		System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + ergebnis);

		kontostand = 7_800;
		zinsen = 2.0;
		ergebnis = berechneZinsen(kontostand, zinsen);

		System.out.println("Zinsen = " + zinsen + " % von " + kontostand + " = " + ergebnis);

	}

	public static double berechneZinsen(double kontostand, double zinsen) {
		return kontostand * zinsen / 100;
	}
}
