package ar.edu.unlam.fuerzasarmadas;

import java.util.HashSet;
import java.util.Set;


public class Batalla {
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	Set<Vehiculo> vehiculosEnLaBatalla;
	private String nombre;
	
	public Batalla(String nombre,TipoDeBatalla tipoBatalla, double latitud2, double longitud2) {
		this.tipo = tipoBatalla;
		this.latitud = latitud2;
		this.longitud = longitud2;
		this.nombre = nombre;
		vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(Set<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}

	public Boolean agregarVehiculoALaBatalla(Vehiculo nuevo)throws VehiculoIncompatible {
		switch (tipo) {
		case TERRESTRE: {
			if(nuevo instanceof Terrestre) {
				vehiculosEnLaBatalla.add(nuevo);
				return true;
			}else {
				throw new VehiculoIncompatible("la batalla es en tierra");
				}
		}
		case NAVAL:
			if(nuevo instanceof Acuatico) {
				vehiculosEnLaBatalla.add(nuevo);
				return true;
			}else {
				throw new VehiculoIncompatible("la batalla es acuatica");
			}
		case AEREA:
			if(nuevo instanceof Volador) {
				vehiculosEnLaBatalla.add(nuevo);
				return true;
			}else {
				throw new VehiculoIncompatible("la batalla es AERA");
			}
			
		}return false;
	}
}