package Modelo;

//Clase para representar productos del menú
class ProductoMenu implements Producto {
 private String nombre;
 private double precio;

 public ProductoMenu(String nombre, double precio) {
     this.nombre = nombre;
     this.precio = precio;
 }

 public String getNombre() {
     return nombre;
 }

 public double getPrecio() {
     return precio;
 }

 public String obtenerDescripcion() {
     return "Producto del menú: " + nombre;
 }
}