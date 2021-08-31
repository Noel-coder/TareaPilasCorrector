package tareaPilasCorrector;

import java.util.ArrayList;

/**
 *
 * @author Noel
 */
public class Pila extends Lista {

    public void imprimirPila(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("[" + lista.get(i) + "]");
        }
        System.out.println("");
    }

    public ArrayList remover(ArrayList lista) {
        lista.removeAll(lista);
        return lista;
    }

    public char tope(ArrayList lista) {
        System.out.println(lista);
        int size = lista.size();
        char caracter;
        caracter = (char) lista.get(size);
        return caracter;
    }

    public ArrayList insertarPila() {
        char resp = 's';
        char caracter;
        while (resp == 's' || resp == 'S') {
            System.out.println("Ingrese un caracter: ");
            caracter = entrada.next().charAt(0);
            arraylist.add(caracter);
            System.out.println("Desea ingresar otro caracter? [s=Si] [n=No]");
            resp = entrada.next().charAt(0);
        }
        return arraylist;
    }

    public boolean validarContenido(ArrayList lista) {
        boolean bandera;
        if (lista.isEmpty()) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }
}
