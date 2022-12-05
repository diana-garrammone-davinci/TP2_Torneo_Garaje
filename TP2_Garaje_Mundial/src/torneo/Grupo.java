package torneo;
import java.util.ArrayList;


public class Grupo extends EtapaMundial{

	private ArrayList<Equipo> equiposQueAvanzan;   
  
    public Grupo() {
        super();
        
    }
    
    
	public Grupo(String descripcionEtapa) {
		super();
		setDescripcionEtapa(descripcionEtapa);
		this.equiposQueAvanzan = new ArrayList<Equipo>();
	}
	

    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan(){
      
        return super.getEquiposQueAvanzan();
    }


	@Override
	public String toString() {
		return "Grupo [equiposQueAvanzan=" + equiposQueAvanzan + "]";
	}   

}