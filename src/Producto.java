/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Producto {
    
    private int id;
    private String nombre;
    private String tipoDeProducto;
    private float precio;
    private int cantidadStock;
    
    
    public Producto(int idInicial, String nombreInicial, String productoInicial, float precioInicial, int stockInicial){
    
        this.id = idInicial;
        this.nombre = nombreInicial;
        this.tipoDeProducto = productoInicial;
        this.precio = precioInicial;
        this.cantidadStock = stockInicial;
    
    }
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;

    }
    
    public String getTipoDeProducto() {
        return tipoDeProducto;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float nuevoPrecio) {
        this.precio = nuevoPrecio;    
    }
    
    public int getCantidadStock(){
        return cantidadStock;
    }
    
    public void setCantidadStock(int nuevoStock){
        this.cantidadStock = nuevoStock;
       
    }
    
    public String toString(){
        return ("Id: " + id + " - Nombre: " + nombre + " - Tipo de producto: " + tipoDeProducto + " - Precio: " + precio + " - Cantidad de Stock: " + cantidadStock);
        }

}
