package be.vives.ti;

public class Main {

	public static void main(String[] args) {
		Auto auto1 = new Auto("1-DBE-402", "AUDI", "Zwart", 6, Brandstof.DIESEL);
		Auto auto2 = new Auto("1-ADP-068", "VW", "Rood", 4, Brandstof.ELEKTRISCH);
		Auto auto3 = new Auto("1-PDN-703", "AUDI", "Zwart", 1, Brandstof.BENZINE);
		Auto auto4 = new Auto("1-END-652", "BMW", "Blauw", 3, Brandstof.DIESEL);
		Auto auto5 = new Auto("1-MQE-743", "OPEL", "Wit", 2, Brandstof.BENZINE);
		Auto auto6 = new Auto("1-NDI-480", "VW", "Zwart", 4, Brandstof.DIESEL);
		Auto auto7 = new Auto("1-ANC-663", "FORD", "Blauw", 6, Brandstof.BENZINE);

		LezChecker lezChecker = new LezChecker();
		lezChecker.inschrijvenAuto(auto1);
		lezChecker.inschrijvenAuto(auto2);
		lezChecker.inschrijvenAuto(auto3);
		lezChecker.inschrijvenAuto(auto4);
		lezChecker.inschrijvenAuto(auto5);
		lezChecker.inschrijvenAuto(auto6);
		lezChecker.inschrijvenAuto(auto7);

		System.out.println(auto1.getNummerplaat() +  " " + lezChecker.controleerLezAntwerpen(auto1.getNummerplaat()).getOmschrijving());
		System.out.println(auto2.getNummerplaat() + " " +lezChecker.controleerLezAntwerpen(auto2.getNummerplaat()).getOmschrijving());
		System.out.println(auto3.getNummerplaat() + " " +lezChecker.controleerLezAntwerpen(auto3.getNummerplaat()).getOmschrijving());
		System.out.println(auto4.getNummerplaat() + " " +lezChecker.controleerLezAntwerpen(auto4.getNummerplaat()).getOmschrijving());
		System.out.println(auto5.getNummerplaat() + " " +lezChecker.controleerLezAntwerpen(auto5.getNummerplaat()).getOmschrijving());
		System.out.println(auto6.getNummerplaat() + " " +lezChecker.controleerLezAntwerpen(auto6.getNummerplaat()).getOmschrijving());
		System.out.println(auto7.getNummerplaat() + " " +lezChecker.controleerLezAntwerpen(auto7.getNummerplaat()).getOmschrijving());

		System.out.println("----");
		lezChecker.uitschrijvenAuto(auto4.getNummerplaat());
		System.out.println(lezChecker.controleerLezAntwerpen(auto4.getNummerplaat()).getOmschrijving());

		System.out.println("Methode name(): " + auto1.getBrandstof().name());
		System.out.println("----");

		System.out.println("van enum naar String (toString) ");
		System.out.println(auto1.getNummerplaat() +  " " + lezChecker.controleerLezAntwerpen(auto1.getNummerplaat()));
		System.out.println("----");

		System.out.println("Van String naar enum (valueOf)");
		Brandstof brandstofDiesel = Brandstof.valueOf("DIESEL");
		// gooit exception:
		//Brandstof brandstofWater = Brandstof.valueOf("WATER ");
		System.out.println("----");

		System.out.println("Alle waarden in enum");
		for (LezCode code : LezCode.values()) {
			System.out.println(code.name() + " - " + code.getOmschrijving());
		}
		System.out.println("----");

	}
}
