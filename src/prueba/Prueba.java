/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author lucas
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

lista.add(1);

lista.add(2);

lista.add(3);

Iterator<Integer> iterador = lista.iterator();

iterador.next();

iterador.remove();

iterador.next();

System.out.println(lista);
    }
    
}
