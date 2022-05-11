package factoryBuilder.builder;

import factoryBuilder.enums.*;
import factoryBuilder.classes.*;

public class VoitureBuilder extends VehiculeBuilder {

	@Override
	protected void poserMoteur() {
		vehicule.setMoteur(Enum_Moteur.ESSENCE);		
	}

	@Override
	protected void poserRoues() {
		vehicule.setNbrRoues(Voiture.NBR_ROUES);
	}
}
