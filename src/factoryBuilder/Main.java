package factoryBuilder;

import java.util.ArrayList;
import java.util.List;

import factoryBuilder.builder.VehiculeBuilder;

import factoryBuilder.classes.Coffre;
import factoryBuilder.classes.Jouet;
import factoryBuilder.classes.Peluche;
import factoryBuilder.classes.Vehicule;
import factoryBuilder.enums.Enum_Moteur;
import factoryBuilder.enums.Enum_TypeJouet;
import factoryBuilder.factory.PelucheCreationException;
import factoryBuilder.factory.PelucheFactory;
import factoryBuilder.factory.VehiculeCreationException;
import factoryBuilder.factory.VehiculeFactory;

public class Main {

	public static void main(String[] args) throws PelucheCreationException, VehiculeCreationException {

		Coffre coffre = new Coffre();
		coffre.getNbJouets();
		
		List<Vehicule> LJouetVehicule = new ArrayList<Vehicule>();
		List<Peluche> LJouetPeluche = new ArrayList<Peluche>();
		
		new VehiculeFactory();
		
		Vehicule vehicule1 = VehiculeFactory.create("VOITURE BATMAN");
		vehicule1.setMoteur(Enum_Moteur.ELECTRO);
		vehicule1.setNbrRoues(4);
		vehicule1.setNom(Enum_TypeJouet.VOITURE_BATMAN);

		Vehicule vehicule2 = VehiculeFactory.create("VOITURE OUIOUI");
		vehicule2.setMoteur(Enum_Moteur.ESSENCE);
		vehicule2.setNbrRoues(4);
		vehicule2.setNom(Enum_TypeJouet.VOITURE_OUIOUI);
		
		Vehicule vehicule3 = VehiculeFactory.create("SCOOTER");
		vehicule3.setMoteur(Enum_Moteur.DIESEL);
		vehicule3.setNbrRoues(2);
		vehicule3.setNom(Enum_TypeJouet.SCOOTER);
		
		Vehicule vehicule4 = VehiculeFactory.create("CAMION");
		vehicule4.setMoteur(Enum_Moteur.ESSENCE);
		vehicule4.setNbrRoues(8);
		vehicule4.setNom(Enum_TypeJouet.CAMION);
		
		
		LJouetVehicule.add(vehicule1);
		LJouetVehicule.add(vehicule2);
		LJouetVehicule.add(vehicule3);
		LJouetVehicule.add(vehicule4);
	
		new PelucheFactory();
		
		Peluche peluche = PelucheFactory.create("PELUCHE CHAT");
		peluche.setNom(Enum_TypeJouet.PELUCHE_CHAT);
		
		Peluche peluche2 = PelucheFactory.create("PELUCHE LION");
		peluche2.setNom(Enum_TypeJouet.PELUCHE_LION);

		Peluche peluche3 = PelucheFactory.create("PELUCHE OBELIX");
		peluche3.setNom(Enum_TypeJouet.PELUCHE_OBELIX);
		
		Peluche peluche4 = PelucheFactory.create("PELUCHE OUIOUI");
		peluche4.setNom(Enum_TypeJouet.PELUCHE_OUIOUI);
		
		LJouetPeluche.add(peluche);
		LJouetPeluche.add(peluche2);
		LJouetPeluche.add(peluche3);
		LJouetPeluche.add(peluche4);
		
		System.out.println("Les vehicules instanciés sont : ");
		System.out.println("");
		
		for(int i = 0; i < LJouetVehicule.size(); i++)
		{
		    System.out.println("Nom : " + LJouetVehicule.get(i).getNom());
		    System.out.println("Nombre de roues : " + LJouetVehicule.get(i).getNbrRoues());
		    System.out.println("Moteur : " + LJouetVehicule.get(i).getMoteur());
		    System.out.println("");
		}
		
		System.out.println("Les peluches instanciées sont : ");
		System.out.println("");
		
		for(int i = 0; i < LJouetPeluche.size(); i++)
		{
		    System.out.println("Nom : " + LJouetPeluche.get(i).getNom());
		    System.out.println("");
		}

		
	}
}