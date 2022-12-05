package torneo;
import java.util.Date;
import java.util.ArrayList;

public class Partido {

    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

    public Partido(Date fecha, Equipo local, Equipo visitante) {
        super();
        this.fecha = fecha;
        this.local = local;
        this.visitante = visitante;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante){
        this.visitante = visitante;
    }

    public Resultado getResultado(){
        return resultado;
    }

    public void setResultado(Resultado resultado){
        this.resultado = resultado;
        this.local.addPartidoJugado(this); // De estas dos lineas no estamos seguros
        this.visitante.addPartidoJugado(this); // esta es la otra. Lo que queremos hacer es que una vez q un partido tenga fecha, equipos y resultado, se agrege al array partidosJugados de la clase Equipo

        if(this.getResultado().ganoLocal()){
            this.local.ganaPartido();
        }
        else if(this.getResultado().empate()){
            this.local.empataPartido();
            this.visitante.empataPartido();
        }
        else{
            this.visitante.ganaPartido();
        }

    }

    @Override
    public String toString() {
        return "Partido [fecha=" + fecha + ", local=" + local + ", visitante=" + visitante + ", resultado=" + resultado
                + "]";
    }



}