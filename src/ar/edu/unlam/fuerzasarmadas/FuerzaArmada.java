package ar.edu.unlam.fuerzasarmadas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	
	public FuerzaArmada () {
		convoy = new HashSet<Vehiculo>();
		batallas = new HashMap<String,Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo nuevo) {
		convoy.add(nuevo);
	} 
	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void crearBatalla(String string, TipoDeBatalla tipoBatalla, double latitud, double longitud) {
		batallas.put(string, new Batalla(string,tipoBatalla,latitud,longitud));
		
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public Batalla getBatalla(String batalla) {
		return batallas.get(batalla);
	}

	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
	}

	public Boolean enviarALaBatalla(String batalla,Integer vehiculo) throws VehiculoInexistente, VehiculoIncompatible{
		return batallas.get(batalla).agregarVehiculoALaBatalla(buscarVehiculo(vehiculo));
	}
	public Vehiculo buscarVehiculo(Integer codigo) throws VehiculoInexistente{
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getId().equals(codigo)) {
				return vehiculo;
			}
		}
		throw new VehiculoInexistente("no existe este vehiculo en el convio");
	}
	

}
