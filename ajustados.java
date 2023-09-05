package Modelo;

import java.util.*;

//Clase para representar productos ajustados con ingredientes
class ProductoAjustado implements Producto {
 private Producto base;
 private List<Ingrediente> ingredientesExtras;
 private List<Ingrediente> ingredientesEliminados;

 public ProductoAjustado(Producto base) {
     this.base = base;
     ingredientesExtras = new ArrayList<>();
     ingredientesEliminados = new ArrayList<>();
 }

 public String getNombre() {
     return base.getNombre();
 }

 public double getPrecio() {
     double precioTotal = base.getPrecio();
     for (Ingrediente ingrediente : ingredientesExtras) {
         precioTotal += ingrediente.getCosto();
     }
     for (Ingrediente ingrediente : ingredientesEliminados) {
         precioTotal -= ingrediente.getCosto();
     }
     return precioTotal;
 }

 public String obtenerDescripcion() {
     return base.obtenerDescripcion() + " con ajustes";
 }

 public void agregarIngrediente(Ingrediente ingrediente) {
     ingredientesExtras.add(ingrediente);
 }

 public void eliminarIngrediente(Ingrediente ingrediente) {
     ingredientesEliminados.add(ingrediente);
 }
}