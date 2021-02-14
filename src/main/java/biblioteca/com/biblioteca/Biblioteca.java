/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.com.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author David
 */
public class Biblioteca {
    private String nombre;
    private ArrayList<Libro>listaLibros = new ArrayList<>();
    private ArrayList<Persona>listaPersonal = new ArrayList<>();
    private int librosTotal = 0;
    
    public Biblioteca () {
        //Constructor vacío
    }
    
    public Biblioteca (String nombre, ArrayList<Libro>listaLibros, ArrayList<Persona>listaPersonal){
        this.nombre= nombre;
        this.listaLibros = listaLibros;
        this.listaPersonal = listaPersonal;
    }
    
    public Biblioteca (Biblioteca biblio){
        this.nombre = biblio.nombre;
        this.listaLibros = biblio.listaLibros;
        this.listaPersonal = biblio.listaPersonal;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Persona> getListaPersonal() {
        return listaPersonal;
    }

    public void setListaPersonal(ArrayList<Persona> listaPersonal) {
        this.listaPersonal = listaPersonal;
    }

    public int getLibrosTotal() {
        return librosTotal;
    }

    public void setLibrosTotal(int librosTotal) {
        this.librosTotal = librosTotal;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "nombre=" + nombre + ", listaLibros=" + listaLibros + ", listaPersonal=" + listaPersonal + ", librosTotal=" + librosTotal + '}';
    }
    
    public void mostrarLibros(){
        //this.listaLibros = new ArrayList<>();
        //Libro.mostrarLista();
        /*this.getlistaLibros().forEach(libro1 -> {
            System.out.println(libro1.toString());
        });*/
        Iterator<Libro> iter = listaLibros.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
    public void mostrarLibrosDisponibles(){
        int librosDisponibles = 0;
        int librosNd =0;
        for (int i=0; i<this.listaLibros.size(); i++){
            if(this.listaLibros.get(i).getCopiasDisponibles()>0){
                System.out.println(this.listaLibros.get(i).toString());
                librosDisponibles ++;
            }else{
                librosNd ++;
            }
        }
        System.out.println("Hay " + librosDisponibles + " libros disponibles en total.");
        System.out.println("Hay un total de " + librosNd + " libro NO disponibles.");
    }
}
       
