package ar.edu.unlam.fuerzasarmadas;

public class Anfibio extends Vehiculo implements Terrestre,Acuatico {
	private Double profundidad;
	private Double velocidad;
	public Anfibio(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad=0.0;
		this.velocidad = 0.0; 
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

	@Override
	public Double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

}
