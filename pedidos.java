package Modelo;

//Clase para representar un pedido

import java.util.*;

class Pedido {

 private int idPedido;

 private List<Producto> elementos;



 public Pedido(int idPedido) {

     this.idPedido = idPedido;

     elementos = new ArrayList<>();

 }



 public int getIdPedido() {

     return idPedido;

 }



 public void agregarElemento(Producto producto) {

     elementos.add(producto);

 }



 public double calcularTotal() {

     double total = 0;

     for (Producto producto : elementos) {

         total += producto.getPrecio();

     }

     return total;

 }

}