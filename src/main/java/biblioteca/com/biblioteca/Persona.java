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
public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String NIF;
    private String contraseña;
    private static Scanner lector = new Scanner(System.in);
    private static ArrayList<Persona>listaPersonal = new ArrayList<Persona>();
    
    public Persona (){
    //Constructor Vacio
    }

    public Persona(String nombre, String apellido1, String apellido2, String NIF, String contraseña) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.NIF = NIF;
        this.contraseña = contraseña;
    }
    public Persona (Persona pax){
        this.nombre = pax.nombre;
        this.apellido1 = pax.apellido1;
        this.apellido2 = pax.apellido2;
        this.NIF = pax.NIF;
        this.contraseña = pax.contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(Scanner Lector) {
        System.out.println("Escribe el nombre de la persona.");
        String nombre = lector.nextLine();
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(Scanner Lector) {
        System.out.println("Escribe el primer apellido.");
        String apellido1 = lector.nextLine();
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(Scanner Lector) {
        System.out.println("Escribe el segundo apellido.");
        String apellido2 = lector.nextLine();
        this.apellido2 = apellido2;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(Scanner Lector) {
        System.out.println("Escribe el NIF:");
        String NIF = lector.nextLine();
        while(NIF.length()!=9){
            System.out.println("Introduce un NIF VÁLIDO");
            NIF = lector.nextLine();
        }
        this.NIF = NIF;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(Scanner Lector) {
        System.out.println("Escribe la contraseña");
        String contraseña = lector.nextLine();
        while(contraseña.length()<8){
            System.out.println("La contraseña debe tener almenos 8 carácteres");
            contraseña = lector.nextLine();
        }
        this.contraseña = contraseña;
    }
     @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", NIF=" + NIF + ", contrase\u00f1a=" + contraseña + '}';
    }
    public static void añadirPersona(ArrayList<Persona>listaPersonal){
        Persona pax = new Persona();
        pax.setNombre(lector);
        pax.setApellido1(lector);
        pax.setApellido2(lector);
        pax.setNIF(lector);
        pax.setContraseña(lector);
        listaPersonal.add(pax);
    }
    public static void eliminarPersona(ArrayList<Persona>listaPersonal){
        System.out.println("Escribe el NIF del trabajador que deseas eliminar: ");
        String NIF = lector.nextLine();
        int i;
        for (i=0; i<listaPersonal.size(); i++){
            if(listaPersonal.get(i).getNIF().equals(NIF)){
                listaPersonal.remove(i);
                System.out.println("El trabajador se ha borrado correctamente.");
            }else{
                System.out.println("No se ha encontrado el NIF: "+NIF);
            }
        }
    }
    public static void mostrarPersonal(ArrayList<Persona>listaPersonal){
        Iterator<Persona> iter = listaPersonal.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
    }
}


