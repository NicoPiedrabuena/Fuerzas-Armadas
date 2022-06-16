package ar.edu.unlam.fuerzasarmadas;

public class HidroAvion extends Vehiculo implements Volador,Acuatico{
	private Double profundidad;
	private Double altura;
	public HidroAvion(Integer id, String nombre) {
		super(id, nombre);
		this.profundidad = 0.0;
		this.altura = 0.0;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return 0.0;
	}

}
