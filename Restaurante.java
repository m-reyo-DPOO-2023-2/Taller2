package Modelo;

//Clase que maneja la lógica del restaurante

import java.util.*;

class Restaurante {

 private List<Producto> menu;

 private List<Pedido> pedidos;

 private int numeroPedidoActual;



 public Restaurante() {

     // Cargar información desde archivos de texto (puedes implementar esta parte)

     menu = new ArrayList<>();

     pedidos = new ArrayList<>();

     numeroPedidoActual = 1;

 }



 public void mostrarMenu() {

     System.out.println("Menú:");

     for (int i = 0; i < menu.size(); i++) {

         System.out.println((i + 1) + ". " + menu.get(i).getNombre() + " - $" + menu.get(i).getPrecio());

     }

 }



 public void iniciarNuevoPedido() {

     Pedido nuevoPedido = new Pedido(numeroPedidoActual++);

     pedidos.add(nuevoPedido);

     System.out.println("Se ha iniciado el pedido #" + nuevoPedido.getIdPedido());

 }



 public void agregarElementoPedido() {

     // Implementar la lógica para agregar elementos al pedido

 }



 public void cerrarPedido() {

     // Implementar la lógica para cerrar un pedido y guardar la factura

 }



 public void consultarPedido() {

     // Implementar la lógica para consultar la información de un pedido

 }

}