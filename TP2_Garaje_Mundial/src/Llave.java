import java.util.ArrayList;

public class Llave extends EtapaMundial {

	private ArrayList<Equipo> equiposQueAvanzan;

	public Llave() {
		super();
	}
	
	public Llave(String descripcionEtapa) {
        super();
        this.equiposQueAvanzan = new ArrayList<Equipo>();
    }

	@Override
	public ArrayList<Equipo> getEquiposQueAvanzan(){
		return super.getEquiposQueAvanzan();
	}

	@Override
	public String toString() {
		return "Llave [equiposQueAvanzan=" + equiposQueAvanzan + "]";
	}	
	

}