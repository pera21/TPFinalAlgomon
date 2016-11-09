package model;

import java.util.ArrayList;

public class AtaqueSimpleAlgomon implements AtaqueAlgomon {

	private ArrayList<CaracteristicaAtaqueAlgomon> caracteristicasAtaqueAlgomon;
	
	public AtaqueSimpleAlgomon(){
		this.caracteristicasAtaqueAlgomon = new ArrayList<CaracteristicaAtaqueAlgomon>();
	}
	
	public void agregarCaracteristicaAtaqueAlgomon(CaracteristicaAtaqueAlgomon caracteristica){
		this.caracteristicasAtaqueAlgomon.add(caracteristica);
	}
	
	public void asignarCaracteristicasAlAtaque(String nombreAtaque,int dañoAtaque,int cantidadAtaques,String tipoAtaque){
		NombreAtaqueAlgomon nombre = new NombreAtaqueAlgomon(nombreAtaque);
		DañoAtaqueAlgomon daño = new DañoAtaqueAlgomon(dañoAtaque);
		CantidadAtaquesAlgomon cantidad = new CantidadAtaquesAlgomon(cantidadAtaques);
		TipoAtaqueAlgomon tipo = null;
		if (tipoAtaque.equals("Agua")){
			tipo = new AtaqueTipoAgua();
		}else if (tipoAtaque.equals("Fuego")){
			tipo = new AtaqueTipoFuego();
		}else if (tipoAtaque.equals("Planta")){
			tipo = new AtaqueTipoPlanta();
		}else{
			tipo = new AtaqueTipoNormal();
		}
		this.agregarCaracteristicaAtaqueAlgomon(nombre);
		this.agregarCaracteristicaAtaqueAlgomon(tipo);
		this.agregarCaracteristicaAtaqueAlgomon(daño);
		this.agregarCaracteristicaAtaqueAlgomon(cantidad);
	}
}
