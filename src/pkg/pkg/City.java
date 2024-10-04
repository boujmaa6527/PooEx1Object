package pkg;

public class City {
	//Exercie 1.1 Exercice 1.2
	//exercie 1.7
	//Variable d'instance pour compter le nbr de city
	static int counter = 0;
	private String name;
	private String country;
	private double nbrOfPeople;
//	
	
	public City(String name, String country, double nbr) {
		this.name =  name;
		this.country = country; 
		this.nbrOfPeople =  nbr; 
		counter++;
	}
	//exercice 1.3
	public City(String name, double nbrPeople) {
		this.name = name;
		this.nbrOfPeople = nbrPeople;
		this.country = "Inconnue"; 
	}
	public City(String name, String country) {
		this.country = country;
		this.name = name;
		
	}
	public City(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name; 
	}
	public void SetName(String name) {
		this.name = name; 
	}
	public String getCountry() {
		return country;
	}
	public void SetCountry(String country) {
		this.country =  country; 
	}
	public double getNbrOfPeople() {
		return nbrOfPeople; 
	}
	public void SetNbrPeople(Double nbrOfPeople) {
		if(nbrOfPeople < 0) {
			throw new RuntimeException("Erreur : nombre négatif non autorisé"); 
		}
		this.nbrOfPeople = nbrOfPeople; 
	}
	//Exercice 1.4
	public String display() {
		return "ville de "+ getName() + " en " +getCountry()+ " ayant " + getNbrOfPeople();
	}
	//exercice 1.6
	public String toString() {
		return "Nom: "+ getName() +"\t"+
				"Ville: "+ getCountry()+ "\t"+
				"Nombre de population: " + getNbrOfPeople();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
