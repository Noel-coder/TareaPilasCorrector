package tareaPilasCorrector;

import java.util.ArrayList;

/**
 *
 * @author Noel
 */
public class Editor {

    Pila pila = new Pila();

    public void imprimir(ArrayList lista) {
        pila.imprimirPila(lista);
    }

    public ArrayList getPila(ArrayList lista) {
        lista = pila.insertarPila();
        return lista;
    }

    public boolean getContenido(ArrayList lista) {
        boolean ying;//ying verdadero yang falso haha
        ying = pila.validarContenido(lista);
        return ying;
    }

    public ArrayList editarContenido(ArrayList lista) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals('#')) {
                lista.remove(i);
                lista.remove(i - 1);
                i = i - 2;
            } else if (lista.get(i).equals('@')) {
                lista = getRemover(lista);
            }
        }
        return lista;
    }

    public ArrayList getRemover(ArrayList lista) {
        pila.remover(lista);
        return lista;
    }
}
