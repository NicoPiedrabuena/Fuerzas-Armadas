package ar.edu.unlam.fuerzasarmadas;

public class Submarino extends Vehiculo implements Acuatico{

	public Submarino(Integer id, String nombre) {
		super(id, nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
