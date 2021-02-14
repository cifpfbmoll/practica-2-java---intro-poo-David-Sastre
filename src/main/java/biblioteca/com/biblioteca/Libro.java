/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.com.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class Libro {
    private int ISBN;
    private String Titulo;
    private String Autor;
    private String Editorial;
    private int Copias;
    private int CopiasDisponibles;
    private static Scanner lector = new Scanner(System.in);
    private static ArrayList<Libro>listaLibros = new ArrayList<Libro>();
    private static int librosTotal = 0;

    public  Libro(){
        librosTotal ++;
    /** Constructor Vacío 
     */
    }
    public Libro (int ISBN, String Título, String Autor, String Editorial, int Copias, int CopiasDisponibles){
        librosTotal ++;
        if (Copias<1){
            System.out.println("El libro debe tener almenos una copia.");
        }else{
            this.ISBN = ISBN;
            this.Titulo = Titulo;
            this.Autor = Autor;
            this.Editorial = Editorial;
            this.Copias = Copias;
            this.CopiasDisponibles = CopiasDisponibles;
        }
    }
    public Libro (Libro libro1){
        librosTotal ++;
        this.ISBN = libro1.getISBN();
        this.Titulo = libro1.getTitulo();
        this.Autor = libro1.getAutor();
        this.Editorial = libro1.getEditorial();
        this.Copias = libro1.getCopias();
        this.CopiasDisponibles = libro1.getCopiasDisponibles();
    }
    
    
    public static void añadirLibro(ArrayList<Libro>listaLibros){
        Libro libro1 = new Libro();
        libro1.setISBN(lector);
        libro1.setTitulo(lector);
        libro1.setAutor(lector);
        libro1.setEditorial(lector);
        libro1.setCopias(lector);
        libro1.setCopiasDisponibles(lector);
        listaLibros.add(libro1);
    }     
    public static void eliminarLibro(ArrayList<Libro>listaLibros){
        System.out.println("Escribe el ISBN del libro que desea eliminar: ");
        int ISBN = lector.nextInt();
        lector.nextLine();
        int i=0;
        for (i=0; i<listaLibros.size(); i++){
            if(listaLibros.get(i).getISBN()== ISBN){
                listaLibros.remove(i);
                System.out.println("El libro se ha borrado correctamente.");
            }else{
                System.out.println("No se ha encontrado el ISBN: "+ISBN);
            }
        }
    }
    public static void buscarLibroISBN(ArrayList<Libro>listaLibros){
        System.out.println("Escribe el ISBN del libro que desea encontrar: ");
        int ISBN = lector.nextInt();
        lector.nextLine();
        for (int i=0; i<listaLibros.size(); i++){
            if(listaLibros.get(i).getISBN()== ISBN){
                System.out.println(listaLibros.get(i).getISBN());
            }else{   
                System.out.println("No se ha encontrado el ISBN: "+ISBN);
            }
        }
    }
    public static void buscarLibroTitulo(ArrayList<Libro>listaLibros){
        System.out.println("Escribe el título del libro que desea encontrar: ");
        String Titulo = lector.nextLine();
        for (int i=0; i<listaLibros.size(); i++){
            if(listaLibros.get(i).getTitulo().contains(Titulo)){
                System.out.println(listaLibros.get(i).toString());
            }else{
                System.out.println("No se ha encontrado el título que busca");
            }
        }
    }

    public static int getLibrosTotal() {
        return librosTotal;
    }

    public static void setLibrosTotal(int librosTotal) {
        Libro.librosTotal = librosTotal;
    }
    
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(Scanner lector) {
        System.out.println("Escribe el ISBN del libro: ");
        int ISBN = lector.nextInt();
        lector.nextLine();
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(Scanner lector) {
        System.out.println("Escribe el título del libro: ");
        String Titulo = lector.nextLine();
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(Scanner lector) {
        System.out.println("Escribe el Autor o Autora del libro: ");
        String Autor = lector.nextLine();
        this.Autor = Autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(Scanner lector) {
        System.out.println("Escribe la Editorial del libro: ");
        String Editorial = lector.nextLine();
        this.Editorial = Editorial;
    }

    public int getCopias() {
        return Copias;
    }

    public void setCopias(Scanner lector) {
        System.out.println("Indica el número de copias del libro: ");
        int Copias = lector.nextInt();
        lector.nextLine();
        this.Copias = Copias;
    }

    public int getCopiasDisponibles() {
        return CopiasDisponibles;
    }

    public void setCopiasDisponibles(Scanner lector) {
        System.out.println("Cuantas copias hay disponibles: ");
        int CopiasDisponibles = lector.nextInt();
        lector.nextLine();
        if (CopiasDisponibles > this.Copias){
            System.out.println("No es posible tener más copias disponibles que las totales.");
        }else {
            this.CopiasDisponibles = CopiasDisponibles;
        }
    }

    @Override
    public String toString() {
        return "Libro" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Editorial=" + Editorial + ", Copias=" + Copias + ", CopiasDisponibles=" + CopiasDisponibles + '}';
    }
    
}   
