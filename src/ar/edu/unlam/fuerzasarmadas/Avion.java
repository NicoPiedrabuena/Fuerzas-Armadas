package ar.edu.unlam.fuerzasarmadas;

public class Avion extends Vehiculo implements Volador{

	public Avion(Integer id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getAltura() {
		return 0.0;
	}

}
