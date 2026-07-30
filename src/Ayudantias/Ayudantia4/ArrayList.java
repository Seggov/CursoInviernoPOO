package Ayudantias.Ayudantia4;

import java.util.Iterator;

/* Plantilla para ArrayList
 * Tienes que rellenar todos los metodos
 * No puedes cambiar sus parametros.
 *
 * Recordar hacer control de errores para indices fuera del rango
 */

public class ArrayList {

    private double[] elementos;
    private int size;
    private static int CAPACIDAD = 8;

    ArrayList() {
        size = 0;
        elementos = new double[CAPACIDAD];
    }

    // Agrega un valor al final de la lista. Si está llena, redimensiona.
    public void add(double valor) {
    	ensureCapacity();
    	elementos[size] = valor;
    	size++;
    	
    	
    }

    // Retorna el valor en la posición dada.
    public double get(int indice) {
    	if ((indice < 0) || (indice >= size)) {
    		throw new IndexOutOfBoundsException();
    	}
        return elementos[indice];
    }

    // Reemplaza el valor en la posición dada.
    public void set(int indice, double valor) {

    }

    // Retorna la cantidad de elementos en la lista.
    public int size() {
        return 0;
    }

    // Retorna true si la lista está vacía, false en caso contrario.
    public boolean isEmpty() {
        return false;
    }

    // Elimina el elemento en la posición dada, desplaza los siguientes y lo
    // retorna.
    public double remove(int indice) {
        return 0;
    }

    // Elimina todos los elementos de la lista.
    public void clear() {
    	
    }

    // Retorna true si el valor existe en la lista, false en caso contrario.
    public boolean contains(double valor) {
        return false;
    }

    // Retorna el índice del valor, o -1 si no existe.
    public int indexOf(double valor) {
        return 0;
    }

    // Redimensiona el arreglo duplicando su capacidad cuando se llene.
    private void ensureCapacity() {
    	if (size == CAPACIDAD) {
    		CAPACIDAD = CAPACIDAD * 2;
    		double[] nuevaLista = new double[CAPACIDAD];
    		
    		for (int i = 0; i < size; i++) {
    			nuevaLista[i] = this.elementos[i];
    		}
    		this.elementos = nuevaLista;
    	}
    }
}

