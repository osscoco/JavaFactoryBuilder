package factoryBuilder.builder;

import factoryBuilder.enums.*;
import factoryBuilder.classes.*;

public class CamionBuilder extends VehiculeBuilder {

	@Override
	protected void poserMoteur() {
		vehicule.setMoteur(Enum_Moteur.DIESEL);		
	}

	@Override
	protected void poserRoues() {
		vehicule.setNbrRoues(Camion.NBR_ROUES);
	}
}