package model;

public class CantidadAtaquesAlgomon implements CaracteristicaAtaqueAlgomon {
	
	private int cantidadAtaquesIniciales;
	private int cantidadAtaquesRestantes;
	
	public CantidadAtaquesAlgomon(int cantidadAtaquesInicial){
		this.cantidadAtaquesIniciales = cantidadAtaquesInicial;
		this.cantidadAtaquesRestantes = cantidadAtaquesInicial;
	}
}
