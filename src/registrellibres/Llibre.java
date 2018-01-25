/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrellibres;

/**
 *
 * @author Alexis
 */
public class Llibre {
    private String nombre;
    private Autor autor;
    private double precio;
    private int cantidad;
    
    public Llibre(String nombre, Autor autor, double precio, int cantidad) {
        this.setnombre(nombre);
        this.setautor(autor);
        this.setprecio(precio);
        this.setcantidad(cantidad);
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public String getnombre() {
        return this.nombre;
    }
    
    public void setautor(Autor autor){
        this.autor = autor;
    }
    public Autor getautor(){
        return this.autor;
    }
    
    public void setprecio(double precio){
        this.precio = precio;
    }
    public double getprecio(){
        return this.precio;
    }
    
    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getcantidad(){
        return this.cantidad;
    }
    
    @Override
    public String toString() {
        return "El libro se llama " + this.getnombre() + " y" + this.getautor();
    }
}
