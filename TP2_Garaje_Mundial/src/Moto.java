

public class Moto extends Vehiculo {
	
	private int cilindrada;

	public Moto(String marca, int kilometraje, int numeroRuedasACambiar) {
		super(marca, kilometraje, numeroRuedasACambiar);
		// TODO Auto-generated constructor stub
	}

	public Moto(String marca, int kilometraje, int numeroRuedasACambiar, int cilindrada) {
		super(marca, kilometraje, numeroRuedasACambiar);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + "]";
	}


}