package pkg;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person zidane = new Person("zidane", "zinedine", 45, "paris", new City("madrid", "Espagne"), null);
			Person benYedder = new Person("wissam", "benyedder", 38, "monaco", new City("bondy", "France"), null);
			Person papin = new Person("jean pierre", "papin", 45, "aix en provence");
			Person wadle = new Person("wadle", "chris", 38, "liverpool", new City("liverpool", "uk"), null);
			Person mbappe = new Person("mbappe", "killyan", 38, "paris", new City("madrid", "france"), null);
			Person chirac = new Person("chirac", "jacques", 38, "correz", new City("paris", "france"), null);
			
			System.out.println(papin.toString());
			System.out.println("**************");
			System.out.println(benYedder.toString());
			System.out.println("**************");
			trierPerson(zidane);
			System.out.println("**************");
			trierPerson(benYedder);
			System.out.println("**************");
			trierPerson(mbappe);
			System.out.println("**************");
			trierPerson(chirac);
			System.out.println("**************");
			
			
	}
	//exercice 2.0

	public static void trierPerson(Person p) {
		
		City c = new City("paris");
		if(p.getAdresse().equals("paris") || p.getVilleNaissance().equals(c)) {
			System.out.println(p.toString());
		}
		
	}
}
