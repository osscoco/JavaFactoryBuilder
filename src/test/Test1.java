package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import factoryBuilder.classes.Peluche;
import factoryBuilder.classes.Vehicule;
import factoryBuilder.enums.Enum_Moteur;
import factoryBuilder.enums.Enum_TypeJouet;
import factoryBuilder.factory.PelucheCreationException;
import factoryBuilder.factory.PelucheFactory;
import factoryBuilder.factory.VehiculeCreationException;
import factoryBuilder.factory.VehiculeFactory;

class Test1 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() throws VehiculeCreationException, PelucheCreationException {
		
		Vehicule vehicule = VehiculeFactory.create("VOITURE BATMAN");
		vehicule.setNom(Enum_TypeJouet.VOITURE_BATMAN);
		assertEquals("VOITURE BATMAN", vehicule.getNom());
		vehicule.setNbrRoues(2);
		assertEquals(2, vehicule.getNbrRoues());
		vehicule.setMoteur(Enum_Moteur.ELECTRO);
		assertEquals("ELECTRO", vehicule.getMoteur().toString());
		
		Peluche peluche = PelucheFactory.create("PELUCHE LION");
		peluche.setNom(Enum_TypeJouet.PELUCHE_LION);
		assertEquals("PELUCHE LION", peluche.getNom());
		
	}

}
