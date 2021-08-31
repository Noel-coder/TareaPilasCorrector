package tareaPilasCorrector;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Noel
 */
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Editor editor = new Editor();
        ArrayList arraylist = new ArrayList<>();

        int opcion = 1;
        while (opcion > 0 && opcion < 7) {
            opcion = menu();
            switch (opcion) {
                case 1: {
                    arraylist = editor.getPila(arraylist);
                }
                break;
                case 2: {
                    editor.imprimir(arraylist);
                }
                break;
                case 3: {
                    editor.editarContenido(arraylist);
                }
                break;
                case 4: {
                    System.out.println("1) Lista inicio");
                    editor.imprimir(arraylist);
                    arraylist = editor.editarContenido(arraylist);
                    System.out.println("\n\n2) Lista final");
                    editor.imprimir(arraylist);
                }
                break;
                case 5: {
                     //Ingresamos los caracteres en duro solo para hacer el test de que
                     //si funciona
                    arraylist.add('a');
                    arraylist.add('2');
                    arraylist.add('n');
                    arraylist.add('#');
                    arraylist.add('d');
                    arraylist.add('#');
                    arraylist.add('#');
                    arraylist.add('<');
                    arraylist.add('b');
                    arraylist.add('c');
                    arraylist.add('x');
                    arraylist.add('z');
                    arraylist.add('[');
                    arraylist.add('#');
                    arraylist.add('@');
                    System.out.println("1) Lista inicial");
                    System.out.println("");
                    editor.imprimir(arraylist);
                    arraylist = editor.editarContenido(arraylist);
                    System.out.println("");
                    System.out.println("2) Lista Editada");
                    editor.imprimir(arraylist);

                }
                break;
                case 6: {
                    if (editor.getContenido(arraylist)) {
                        System.out.println("La lista esta vacia, no hay contenido a vaciar!");
                    } else {
                        arraylist = editor.getRemover(arraylist);
                        System.out.println("La lista ha sido vaciado exitosamente!");
                    }
                }
                break;
                case 7: {
                    System.out.println("Gracias por utilizar el programa!");
                }
                break;
            }
        }
    }

    public static int menu() {
        while(true){
        System.out.println("------------------------------");
        System.out.println("  Pilas Corrector Gramatical  ");
        System.out.println("------------------------------");
        System.out.println("1)Anadir a la lista");
        System.out.println("2)Imprimir la lista");
        System.out.println("3)Purgar dato");
        System.out.println("4)Editar la lista");
        System.out.println("5)Caso prueba");
        System.out.println("6)Vaciar la lista");
        System.out.println("7)Salir del programa");
        System.out.println("Elija una opcion: ");
        int valor;
        valor = sc.nextInt();
        if(valor > 0 && valor < 8)
                return valor;
        }
    }

}

