package pkg;

public class Person {

	//exercice 1.8
	
			public  String nom;
			public String prenom;
			public  double age;
			public String adresse; 
			public City villeNaissance; 
			public City country; 
			
		
		//Exercice 1.9
		public Person(String nom, String prenom, double age, String adresse ) {
			
			this.nom = nom;
			this.prenom = prenom; 
			this.age = age;
			this.adresse = adresse; 
			
			
		}
		//Exercice 1.9
		public Person(String nom, String prenom, double age, String adresse, City villeNaissance, City country ) {
			this.nom = nom;
			this.prenom = prenom; 
			this.age = age;
			this.adresse = adresse; 
			this.villeNaissance = villeNaissance; 
		}
		
		
		//Exercice 1.9
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public double getAge() {
			return age;
		}
		public void setAge(double age) {
			this.age = age;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public City getVilleNaissance() {
			return villeNaissance; 
		}
		
		public String toString() {
			
			return  "Person : lastName=" +getNom() + 
					", firstName=" + getPrenom() +", "
					+ "age=" +getAge() + ", adresse=" 
					+ getAdresse() + " Ville de naissance " + getVilleNaissance();
		}
		
	
}
