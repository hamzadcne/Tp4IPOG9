import java.util.ArrayList;

import Entities.*;

public class TP4 {

	public static void main(String[] args) {

		Villa v1 = new Villa();
		v1.setAdresse("Nouvelle ville");
		v1.setSuperficie(100);

		Villa v2 = new Villa();
		v2.setAdresse("Elkhroub");
		v2.setSuperficie(200);

		v1.afficherInfo();
		v2.afficherInfo();

		Logement l1 = new Villa();
		Logement l2 = new Appartement();

		Appartement a1 = new Appartement();
		a1.setAdresse("addresse apprt");
		a1.afficherInfo();

		Proprietaire prop1 = new Proprietaire();
		// prop1.setNom("nom");
		// prop1.setPreNom("prenom");
		// prop1.setAdresse("adresse");

		// int[] tab = new int[3];
		prop1.proprietes = new Logement[2];
		prop1.proprietes[0] = v1;
		prop1.proprietes[1] = a1;

		Locataire loc1 = new Locataire();
		loc1.locations = new ArrayList<Logement>();

		// pour ajouter un element
		loc1.locations.add(v2);
		// pour acceder a un element avec l'indice
		loc1.locations.get(0);
		// pour supprimer un element
		loc1.locations.remove(v2);

	}

}
