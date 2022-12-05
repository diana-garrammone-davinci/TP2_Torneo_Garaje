package garaje;


public abstract class Vehiculo {
	
	private String marca;
	private int kilometraje;
	private int numeroRuedasACambiar;
	
	public Vehiculo(String marca, int kilometraje, int numeroRuedasACambiar) {
		super();
		this.marca = marca;
		this.kilometraje = kilometraje;
		this.numeroRuedasACambiar = numeroRuedasACambiar;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getNumeroRuedasACambiar() {
		return numeroRuedasACambiar;
	}

	public void setNumeroRuedasACambiar(int numeroRuedasACambiar) {
		this.numeroRuedasACambiar = numeroRuedasACambiar;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", kilometraje=" + kilometraje + ", numeroRuedasACambiar="
				+ numeroRuedasACambiar + "]";
	}
	
}