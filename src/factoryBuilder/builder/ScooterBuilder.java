package factoryBuilder.builder;

import factoryBuilder.enums.*;
import factoryBuilder.classes.*;

public class ScooterBuilder extends VehiculeBuilder {

	@Override
	protected void poserMoteur() {
		vehicule.setMoteur(Enum_Moteur.ELECTRO);		
	}
	@Override
	protected void poserRoues() {
		vehicule.setNbrRoues(Camion.NBR_ROUES);
	}
	
}