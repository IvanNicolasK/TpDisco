package ar.edu_subasta;

public class Subasta {

	private double valor;
	private boolean condicion;


public Subasta(double valor , boolean condicion)

{
	this.valor=valor;
	this.condicion=true;
}

//opcion 1
public double hacerNuevaOferta(double oferta)
{ 
	
   	if(this.valor<oferta)
   	{
   		this.valor =oferta;	
   	
   	}
   	return this.valor;
}

//como hacer get y set



//opcion 2
public void nuevaOferta(double nuevaOferta) {
	
	if(condicion) {
	
	if(nuevaOferta>this.valor)
		this.valor=nuevaOferta;
		
	}
	}

public double getValor() {
	return valor;
}

public void setValor(double valor) {
	this.valor = valor;
}

public boolean isCondicion() {
	return condicion;
}

public void setCondicion(boolean condicion) {
	this.condicion = condicion;
}
	
	




/*
 MAL
public boolean condicionSubasta(Integer oferta,boolean condicion) {
	
	if(oferta==0)
   	{
		condicion=false;
   return condicion;
  
   	}else {
   		condicion=true;
   			return condicion;
   		}
   	
 /bebi/  	}

*/



}
