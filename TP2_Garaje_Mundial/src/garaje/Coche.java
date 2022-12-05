package garaje;

public class Coche extends Vehiculo {
	
	private int numeroPuertas;

	public Coche(String marca, int kilometraje, int numeroRuedasACambiar) {
		super(marca, kilometraje, numeroRuedasACambiar);
		// TODO Auto-generated constructor stub
	}

	public Coche(String marca, int kilometraje, int numeroRuedasACambiar, int numeroPuertas) {
		super(marca, kilometraje, numeroRuedasACambiar);
		this.numeroPuertas = numeroPuertas;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	@Override
	public String toString() {
		return "Coche [numeroPuertas=" + numeroPuertas + "]";
	}

}