/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.com.biblioteca;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner (System.in);
        Biblioteca biblio = new Biblioteca ();
        boolean menuGeneral;
        boolean menuLibro;
        boolean menuPersona;
        int seleccionSubmenu;
        int seleccionMenu;
        int seleccionSubmenu2;
        menuGeneral = true;
        while(menuGeneral){
            System.out.println("=====================================");
            System.out.println("Bienvenido al gestor de la biblioteca");
            System.out.println("=====================================");
            System.out.println("¿Qué desea gestionar?");
            System.out.println("1. Gestionar Libros/Reservas.");
            System.out.println("2. Gestionar Personal.");
            System.out.println("3. Salir.");
            seleccionMenu = lector.nextInt();
            lector.nextLine();
            menuLibro = true;
            menuPersona = true;
            switch (seleccionMenu){
                case 1:
                    while (menuLibro){
                        System.out.println("==============================");
                        System.out.println("Bienvenido al gestor de Libros");
                        System.out.println("==============================");
                        System.out.println("¿Qué acción deseas realizar?");
                        System.out.println("1. Añadir Libro.");
                        System.out.println("2. Eliminar Libro.");
                        System.out.println("3. Buscar Libro por ISBN.");
                        System.out.println("4. Buscar Libro por título.");
                        System.out.println("5. Lista de Libros");
                        System.out.println("6. Lista de Libros Disponibles");
                        System.out.println("7. Consulta del Total de Libros en la Biblioteca");
                        System.out.println("8. Salir");
                        seleccionSubmenu = lector.nextInt ();
                        switch (seleccionSubmenu){
                            case 1 -> Libro.añadirLibro(biblio.getListaLibros());
                            case 2 -> Libro.eliminarLibro(biblio.getListaLibros());
                            case 3 -> Libro.buscarLibroISBN(biblio.getListaLibros());
                            case 4 -> Libro.buscarLibroTitulo(biblio.getListaLibros());
                            case 5 -> biblio.mostrarLibros();
                            case 6 -> biblio.mostrarLibrosDisponibles();
                            case 7 -> {
                                System.out.println("En total hay "+Libro.getLibrosTotal()+" Libros");
                            }
                            case 8 -> {
                                System.out.println("=========================================");
                                System.out.println("GRACIAS POR USAR EL GESTOR DE LIBROS");
                                System.out.println("=========================================");
                                menuLibro = false;
                                menuGeneral = true;
                                break;
                            }    
                        }
                    }
                    break;
                case 2:
                    while (menuPersona){
                        System.out.println("================================");
                        System.out.println("Bienvenido al gestor de Personal");
                        System.out.println("================================");
                        System.out.println("¿Qué acción deseas realizar?");
                        System.out.println("1. Añadir Trabajador.");
                        System.out.println("2. Eliminar Trabajador.");
                        System.out.println("3. Ver Personal.");
                        System.out.println("4. Salir.");
                        seleccionSubmenu2 = lector.nextInt();
                        lector.nextLine();
                        switch(seleccionSubmenu2){
                            case 1-> Persona.añadirPersona(biblio.getListaPersonal());
                            case 2-> Persona.eliminarPersona(biblio.getListaPersonal());
                            case 3-> Persona.mostrarPersonal(biblio.getListaPersonal());
                            case 4-> {
                                System.out.println("======================================");
                                System.out.println("GRACIAS POR USAR EL GESTOR DE PERSONAL");
                                System.out.println("======================================");
                                menuPersona=false;
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("==============================");
                    System.out.println("MUCHAS GRACIAS, VUELVA PRONTO!");
                    System.out.println("==============================");
                    menuGeneral = false;
                    break;
                default:
                    System.out.println("Introduce el número correcto, por favor.");
                    break;
                }
            }
        }
}
