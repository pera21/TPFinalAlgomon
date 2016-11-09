package model;

public class VidaAlgomon implements CaracteristicaAlgomon {
	
	private int vidaAlgomon;
	
	public VidaAlgomon (int vida){
		this.vidaAlgomon = vida;
	}
	
	public int vidaDelAlgomon(){
		return this.vidaAlgomon;
	}
}
