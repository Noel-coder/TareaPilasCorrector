package tareaPilasCorrector;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Noel
 */
public class Lista {
    static Scanner entrada = new Scanner(System.in);
    ArrayList arraylist = new ArrayList<>();
    
    public void imprimirLista(ArrayList lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("[" + lista.get(i) + "]");
        }
        System.out.println("");
    }

    public ArrayList PurgaDato(ArrayList lista) {
        ArrayList temporal = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            int contador = 0;
            for (int j = 0; j < temporal.size(); j++) {
                if (lista.get(i) == temporal.get(j)) {
                     contador++;
                }
            }
            if(contador == 0){
                temporal.add(lista.get(i));
            }
        }
        System.out.println("El Dato ha sido eliminado exitosamente!");
        return temporal;
    }
    
    public ArrayList AgregarData(){
        char resp ='s';
        char caracter ;
        while (resp == 's' || resp == 'S') {
            System.out.println("Ingrese el caracter: ");
            caracter = entrada.next().charAt(0);
            arraylist.add(caracter);
            System.out.println("Desea ingresar otro caracter? [s=Si] [n=No]");
            
            resp = entrada.next().charAt(0);
        }
        return arraylist;
    }
}
