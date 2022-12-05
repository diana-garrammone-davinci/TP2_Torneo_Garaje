import java.util.ArrayList;

public class Garaje {
	
	private boolean apertura;
	private int precioCambioRuedaCoche;
	private int precioCambioRuedaMoto;
	private int capacidadCoches;
	private int capacidadMotos;
	private ArrayList<Vehiculo> vehiculo;
	private int contadorCoche;
	private int contadorMoto;
	
	public Garaje(boolean apertura, int precioCambioRuedaCoche, int precioCambioRuedaMoto) {
		super();
		this.apertura = apertura;
		this.precioCambioRuedaCoche = precioCambioRuedaCoche;
		this.precioCambioRuedaMoto = precioCambioRuedaMoto;
		this.capacidadCoches = 0;
		this.capacidadMotos = 0;
		this.vehiculo = new ArrayList<Vehiculo>();
	}

	public boolean isApertura() {
		return apertura;
	}

	public void setApertura(boolean apertura) {
		this.apertura = apertura;
	}

	public int getPrecioCambioRuedaCoche() {
		return precioCambioRuedaCoche;
	}

	public void setPrecioCambioRuedaCoche(int precioCambioRuedaCoche) {
		this.precioCambioRuedaCoche = precioCambioRuedaCoche;
	}

	public int getPrecioCambioRuedaMoto() {
		return precioCambioRuedaMoto;
	}

	public void setPrecioCambioRuedaMoto(int precioCambioRuedaMoto) {
		this.precioCambioRuedaMoto = precioCambioRuedaMoto;
	}

	public int getCapacidadCoches() {
		return capacidadCoches;
	}

	public void setCapacidadCoches(int capacidadCoches) {
		this.capacidadCoches = capacidadCoches;
	}

	public int getCapacidadMotos() {
		return capacidadMotos;
	}

	public void setCapacidadMotos(int capacidadMotos) {
		this.capacidadMotos = capacidadMotos;
	}

	public ArrayList<Vehiculo> getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(ArrayList<Vehiculo> vehiculo) {
		this.vehiculo = vehiculo;
	}

	@Override
	public String toString() {
		return "Garaje [apertura=" + apertura + ", precioCambioRuedaCoche=" + precioCambioRuedaCoche
				+ ", precioCambioRuedaMoto=" + precioCambioRuedaMoto + ", capacidadCoches=" + capacidadCoches
				+ ", capacidadMotos=" + capacidadMotos + ", vehiculo=" + vehiculo + "]";
	}
	
	public String consultaCapacidadCoches(int capacidadCoches) {
		String mensaje = "";
		if (this.capacidadCoches >= 200) {
			mensaje = "Capacidad llena";
		} else if(this.capacidadCoches < 200) {
			mensaje = "Hay capadicad, puede ingresar auto";
		}else {
			mensaje = "Hubo un error";
		}
		return mensaje;
	}
	
	public String consultaCapacidadMotod(int capacidadMotos) {
		String mensaje = "";
		if (this.capacidadMotos >= 200) {
			mensaje = "Capacidad llena";
		} else if(this.capacidadMotos < 200) {
			mensaje = "Hay capadicad, puede ingresar moto";
		}else {
			mensaje = "Hubo un error";
		}
		return mensaje;
	}
	
	public void ingresarCoche(Coche coche) {
		this.setCapacidadCoches(capacidadCoches +1);		
	}
	
	public void ingresarMoto(Moto moto) {
		this.setCapacidadMotos(capacidadMotos +1);		
	}
	
	public void egresarCoche(Coche coche) {
		this.setCapacidadCoches(capacidadCoches -1);		
	}
	
	public void egresarMoto(Moto moto) {
		this.setCapacidadMotos(capacidadMotos -1);		
	}
	
	public double calcularPromedioKilometraje(Moto moto, Coche coche) {
		double promedio=0;
		double kilometrajeCoche = coche.getKilometraje();
		double kilometrajeMoto = moto.getKilometraje();
		// promedio = (kilometrajeCoche + kilometrajeMoto) / (numero de motos + numero de coches). No se cómo hacerlo.
		return promedio; 
	}
	
	public int cambiarRuedaCoche(Coche coche) {
		contadorCoche = + coche.getNumeroRuedasACambiar();
		return contadorCoche;
	}
	
	public int cambiarRuedaMoto(Moto moto) {
		this.contadorMoto = + moto.getNumeroRuedasACambiar();
		return this.contadorMoto;
	}
	
	public int calcularPrecioTodasLasRuedasCambiadas() {
		
		int precioTotal = this.getPrecioCambioRuedaCoche() * contadorCoche + this.getPrecioCambioRuedaMoto() * contadorMoto;
		
		return precioTotal;
	}
	
	

}