/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerclase;

/**
 *
 * @author Daniel
 */
public class cancion {
    //Atributos
    public String nombre;
    //Metodos
    public cancion(String titulo){ //Contructor
        this.nombre = titulo;      //Da el estado al objeto
    }
    public void sonar(){
    System.out.println("Sonado" + this.nombre);
    //Referencia al valor almacenado
    }
}
