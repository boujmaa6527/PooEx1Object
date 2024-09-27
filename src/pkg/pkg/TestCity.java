package pkg;

public class TestCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercie 1.1 Exercice 1.2
		City toulouse = new City("Toulouse","France", 450000 );
		System.out.println(toulouse);
		toulouse.SetNbrPeople(toulouse.getNbrOfPeople() + 20000);
		System.out.println(toulouse);
		City evreux = new City("evreux","France", 50000 );
		System.out.println(evreux);
		City vernon = new City("vernon","France", 20000 );
		System.out.println("Nombre de population: " + evreux.getNbrOfPeople());
		// réduire la population de toulouse
		toulouse.SetNbrPeople(toulouse.getNbrOfPeople() - 20000);
		System.out.println(toulouse);
		
		//exercice 1.3
		City maroc = new City("Rabat", 570000);
		System.out.println("Ville: " + maroc.getName()+ " Pays : "+ maroc.getCountry()+ " Nombre d'habitant: "+ maroc.getNbrOfPeople());
		//exercice 1.4
		System.out.println(toulouse.display());
		//Exercice 1.7 nombre de ville instancié
		System.out.println(vernon.counter);
	}

}
