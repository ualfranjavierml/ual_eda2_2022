package org.eda2.practica2;

import java.util.ArrayList;

public class Grafo {

	private ArrayList<Nodo> nodos;
	private ArrayList<Arista> aristas;
	private int[][] matrizAdy;
	public Grafo() {
	
		this.nodos = new ArrayList<Nodo>();
		this.aristas = new ArrayList<Arista>();
	}

public int[][] crearMatrizAdy() {
		
        matrizAdy = new int[nodos.size()][nodos.size()];
    
        for(int i=0; i< this.getnNodos(); i++){
        	for(int j=0; j< this.getnNodos(); j++){
        		//Inicializamos los valores de la matriz a 0
        		matrizAdy[i][j] = 0;
        	}            
        }
        
        for(int i=0; i< this.getnNodos(); i++){
        	for(int j=0; j< this.getnNodos(); j++){
        		
        		Arista aux = new Arista(this.nodos.get(i),this.nodos.get(j),0);
        		
        		//Vamos dando valores a la matriz de adyacencia en funcion
        		//de los nodos conectados mediante aristas
        		if(this.contieneAristaND(aux)){
        			matrizAdy[i][j] ++;
        		}
        	}            
        }
     
        return matrizAdy;
    }
	public String printMatrizAdy(){
		String salida = "";
	    for(int i=0; i<nodos.size(); i++){
	        for(int j=0; j< nodos.size(); j++){
	            salida += (matrizAdy[i][j] + " " );        
	        }
	        salida += "\n";
	    }  
	    return salida;
	}
	public ArrayList<Arista> getAristas() {
		return aristas;
	}

	public void setAristas(ArrayList<Arista> aristas) {
		this.aristas = aristas;
	}

	public void addNodo(Nodo nodo) {
		nodos.add(nodo);
	}

	public ArrayList<Nodo> getNodos() {
		return nodos;
	}
	
	public Nodo getNodo(int indice) {
		return this.getNodos().get(indice);
	}

	public void setNodos(ArrayList<Nodo> nodos) {
		this.nodos = nodos;
	}
	public int getnNodos() {
		return nodos.size();
	}

	public void addArista(Arista arista) {
		aristas.add(arista);
	}

	public int getnAristas() {
		return aristas.size();
	}
	
	public boolean contieneAristaND(Arista arista) {
		
		boolean contiene = false;
		for (Arista ar : this.getAristas()) {
			if ((ar.getDestino() == arista.getDestino() && ar.getOrigen() == arista.getOrigen()) ||
				(ar.getDestino() == arista.getOrigen() && ar.getOrigen() == arista.getDestino())) {
				contiene = true;
			}
		}
		return contiene;
	}
	
	
	
	  public String toString() {
	        return  nodos + "\n";
	    }
}
