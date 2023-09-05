package Modelo;

//Clase principal que maneja la interacción con el usuario

import java.util.*;

public class Aplicacion {

 public static void main(String[] args) {

     Restaurante restaurante = new Restaurante();

     Scanner scanner = new Scanner(System.in);



     int opcion;

     do {

         System.out.println("Bienvenido al restaurante. Elija una opción:");

         System.out.println("1. Mostrar el menú");

         System.out.println("2. Iniciar un nuevo pedido");

         System.out.println("3. Agregar un elemento a un pedido");

         System.out.println("4. Cerrar un pedido y guardar la factura");

         System.out.println("5. Consultar la información de un pedido dado su ID");

         System.out.println("0. Salir");

         opcion = scanner.nextInt();

         scanner.nextLine(); // Limpiar el salto de línea



         switch (opcion) {

             case 1:

                 // Mostrar el menú

                 restaurante.mostrarMenu();

                 break;

             case 2:

                 // Iniciar un nuevo pedido

                 restaurante.iniciarNuevoPedido();

                 break;

             case 3:

                 // Agregar un elemento a un pedido

                 restaurante.agregarElementoPedido();

                 break;

             case 4:

                 // Cerrar un pedido y guardar la factura

                 restaurante.cerrarPedido();

                 break;

             case 5:

                 // Consultar la información de un pedido

                 restaurante.consultarPedido();

                 break;

             case 0:

                 System.out.println("¡Gracias por visitar nuestro restaurante!");

                 break;

             default:

                 System.out.println("Opción no válida. Por favor, seleccione una opción válida.");

         }

     } while (opcion != 0);



     scanner.close();

 }

}