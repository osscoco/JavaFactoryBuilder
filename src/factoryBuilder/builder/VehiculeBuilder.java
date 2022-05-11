package factoryBuilder.builder;

import factoryBuilder.classes.Vehicule;

public abstract class VehiculeBuilder {

	protected Vehicule vehicule;
	
	public Vehicule getVehicule() { return vehicule; }
	
	public void createNewVehicule() { vehicule = new Vehicule() {}; }

	protected abstract void poserMoteur();
	protected abstract void poserRoues();
}