package factoryBuilder.enums;

public enum Enum_TypeJouet {
	PELUCHE_OUIOUI, PELUCHE_OBELIX, PELUCHE_CHAT, PELUCHE_LION, SCOOTER, CAMION, VOITURE_BATMAN, VOITURE_OUIOUI;
	
	public String toString(){
        switch(this){
        case PELUCHE_OUIOUI :
            return "PELUCHE OUIOUI";
        case PELUCHE_OBELIX :
            return "PELUCHE OBELIX";
        case PELUCHE_CHAT :
            return "PELUCHE CHAT";
        case PELUCHE_LION :
            return "PELUCHE LION";
        case SCOOTER :
            return "SCOOTER";
        case CAMION :
            return "CAMION";
        case VOITURE_BATMAN :
            return "VOITURE BATMAN";
        case VOITURE_OUIOUI :
            return "VOITURE OUIOUI";
        }
        return null;
    }

	public static double size() {
		// TODO Auto-generated method stub
		return 8;
	}
}