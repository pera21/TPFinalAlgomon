package model;

import java.util.ArrayList;

public class Algomon {
	
	private ArrayList<CaracteristicaAlgomon> caracteristicasAlgomon;
	private ArrayList<AtaqueAlgomon> ataquesAlgomon;
	
	public Algomon(){
		this.caracteristicasAlgomon = new ArrayList<CaracteristicaAlgomon>();
		this.ataquesAlgomon = new ArrayList<AtaqueAlgomon>();
	}

	public void agregarCaracteristicaAlgomon(CaracteristicaAlgomon caracteristica){
		this.caracteristicasAlgomon.add(caracteristica);
	}
	
	public void agregarAtaqueAlgomon(AtaqueAlgomon ataque){
		this.ataquesAlgomon.add(ataque);
	}
	
	public void squirtle(){
		NombreAlgomon nombre = new NombreAlgomon("Squirtle");
		VidaAlgomon vida = new VidaAlgomon(150);
		TipoAgua tipo = new TipoAgua();
		AtaqueSimpleAlgomon ataque1 = new AtaqueSimpleAlgomon();
		ataque1.asignarCaracteristicasAlAtaque("Burbuja",10,15,"Agua");
		AtaqueSimpleAlgomon ataque2 = new AtaqueSimpleAlgomon();
		ataque2.asignarCaracteristicasAlAtaque("Cañon de agua",20,8,"Agua");
		AtaqueSimpleAlgomon ataque3 = new AtaqueSimpleAlgomon();
		ataque3.asignarCaracteristicasAlAtaque("Ataque rapido",10,16,"Normal");
		this.agregarCaracteristicaAlgomon(nombre);
		this.agregarCaracteristicaAlgomon(tipo);
		this.agregarCaracteristicaAlgomon(vida);
		this.agregarAtaqueAlgomon(ataque1);
		this.agregarAtaqueAlgomon(ataque2);
		this.agregarAtaqueAlgomon(ataque3);
	}
	
	public void charmander(){
		NombreAlgomon nombre = new NombreAlgomon("Charmander");
		VidaAlgomon vida = new VidaAlgomon(170);
		TipoFuego tipo = new TipoFuego();
		AtaqueSimpleAlgomon ataque1 = new AtaqueSimpleAlgomon();
		ataque1.asignarCaracteristicasAlAtaque("Brasas",16,10,"Fuego");
		AtaqueEspecialAlgomon ataque2 = new AtaqueEspecialAlgomon();
		ataque2.asignarCaracteristicasAlAtaque("Fogonazo",2,4,"Fuego");
		AtaqueSimpleAlgomon ataque3 = new AtaqueSimpleAlgomon();
		ataque3.asignarCaracteristicasAlAtaque("Ataque rapido",10,16,"Normal");
		this.agregarCaracteristicaAlgomon(nombre);
		this.agregarCaracteristicaAlgomon(tipo);
		this.agregarCaracteristicaAlgomon(vida);
		this.agregarAtaqueAlgomon(ataque1);
		this.agregarAtaqueAlgomon(ataque2);
		this.agregarAtaqueAlgomon(ataque3);
	}
	
	public void bulbasaur(){
		NombreAlgomon nombre = new NombreAlgomon("Bulbasaur");
		VidaAlgomon vida = new VidaAlgomon(140);
		TipoPlanta tipo = new TipoPlanta();
		AtaqueEspecialAlgomon ataque1 = new AtaqueEspecialAlgomon();
		ataque1.asignarCaracteristicasAlAtaque("Chupavidas",15,8,"Planta");
		AtaqueSimpleAlgomon ataque2 = new AtaqueSimpleAlgomon();
		ataque2.asignarCaracteristicasAlAtaque("Latigo cepa",15,10,"Planta");
		AtaqueSimpleAlgomon ataque3 = new AtaqueSimpleAlgomon();
		ataque3.asignarCaracteristicasAlAtaque("Ataque rapido",10,16,"Normal");
		this.agregarCaracteristicaAlgomon(nombre);
		this.agregarCaracteristicaAlgomon(tipo);
		this.agregarCaracteristicaAlgomon(vida);
		this.agregarAtaqueAlgomon(ataque1);
		this.agregarAtaqueAlgomon(ataque2);
		this.agregarAtaqueAlgomon(ataque3);
	}
	
	public void jigglypuff(){
		NombreAlgomon nombre = new NombreAlgomon("Jigglypuff");
		VidaAlgomon vida = new VidaAlgomon(130);
		TipoNormal tipo = new TipoNormal();
		AtaqueEspecialAlgomon ataque1 = new AtaqueEspecialAlgomon();
		ataque1.asignarCaracteristicasAlAtaque("Canto",0,6,"Normal");
		AtaqueSimpleAlgomon ataque2 = new AtaqueSimpleAlgomon();
		ataque2.asignarCaracteristicasAlAtaque("Burbuja",10,15,"Agua");
		AtaqueSimpleAlgomon ataque3 = new AtaqueSimpleAlgomon();
		ataque3.asignarCaracteristicasAlAtaque("Ataque rapido",10,16,"Normal");
		this.agregarCaracteristicaAlgomon(nombre);
		this.agregarCaracteristicaAlgomon(tipo);
		this.agregarCaracteristicaAlgomon(vida);
		this.agregarAtaqueAlgomon(ataque1);
		this.agregarAtaqueAlgomon(ataque2);
		this.agregarAtaqueAlgomon(ataque3);
	}
	
	public void chansey(){
		NombreAlgomon nombre = new NombreAlgomon("Chansey");
		VidaAlgomon vida = new VidaAlgomon(130);
		TipoNormal tipo = new TipoNormal();
		AtaqueEspecialAlgomon ataque1 = new AtaqueEspecialAlgomon();
		ataque1.asignarCaracteristicasAlAtaque("Canto",0,6,"Normal");
		AtaqueSimpleAlgomon ataque2 = new AtaqueSimpleAlgomon();
		ataque2.asignarCaracteristicasAlAtaque("Latigo cepa",15,10,"Planta");
		AtaqueSimpleAlgomon ataque3 = new AtaqueSimpleAlgomon();
		ataque3.asignarCaracteristicasAlAtaque("Ataque rapido",10,16,"Normal");
		this.agregarCaracteristicaAlgomon(nombre);
		this.agregarCaracteristicaAlgomon(tipo);
		this.agregarCaracteristicaAlgomon(vida);
		this.agregarAtaqueAlgomon(ataque1);
		this.agregarAtaqueAlgomon(ataque2);
		this.agregarAtaqueAlgomon(ataque3);
	}
	
	public void rattata(){
		NombreAlgomon nombre = new NombreAlgomon("Rattata");
		VidaAlgomon vida = new VidaAlgomon(170);
		TipoNormal tipo = new TipoNormal();
		AtaqueEspecialAlgomon ataque1 = new AtaqueEspecialAlgomon();
		ataque1.asignarCaracteristicasAlAtaque("Fogonazo",2,4,"Fuego");
		AtaqueSimpleAlgomon ataque2 = new AtaqueSimpleAlgomon();
		ataque2.asignarCaracteristicasAlAtaque("Burbuja",10,15,"Agua");
		AtaqueSimpleAlgomon ataque3 = new AtaqueSimpleAlgomon();
		ataque3.asignarCaracteristicasAlAtaque("Ataque rapido",10,16,"Normal");
		this.agregarCaracteristicaAlgomon(nombre);
		this.agregarCaracteristicaAlgomon(tipo);
		this.agregarCaracteristicaAlgomon(vida);
		this.agregarAtaqueAlgomon(ataque1);
		this.agregarAtaqueAlgomon(ataque2);
		this.agregarAtaqueAlgomon(ataque3);
	}
}
