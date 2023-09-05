package Modelo;
//Clase para representar combos de productos

import java.util.*;

class Combo {

 private List<Producto> productos;

 private double descuento;



 public Combo() {

     productos = new ArrayList<>();

     descuento = 0.1; // Descuento del 10%

 }



 public void agregarProducto(Producto producto) {

     productos.add(producto);

 }



 public double getPrecio() {

     double precioTotal = 0;

     for (Producto producto : productos) {

         precioTotal += producto.getPrecio();

     }

     return precioTotal * (1 - descuento); // Aplicar el descuento

 }

}
