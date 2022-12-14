/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.frankie.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.frankie.entidades.Ingrediente;
import mx.itson.frankie.entidades.Paso;
import mx.itson.frankie.entidades.Receta;
import mx.itson.frankie.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Main {
    public static void main(String[] args) {
        
        Receta receta = new Receta();
        receta.setNombre("Frankie Brownie");
        receta.setDescrpcion("Hornea una receta de FRANKIE BROWNIES con Leche Condensada LA LECHERA® para este Halloween y ofrécelas en tu reunión, con amigos, o con tu familia.");
        receta.setNumeroPorciones(6);
        receta.setDuracion(62);
        
        List<Ingrediente> ingredientes = new ArrayList<>();
        
        Ingrediente ingrediente1 = new Ingrediente();
        ingrediente1.setNombre("1 Caja de Harina para brownies chocolate Fudge de Betty Crocker® (519 g)");
        Ingrediente ingrediente2 = new Ingrediente();
        ingrediente2.setNombre("3 Cucharadas de Agua");
        
        ingredientes.add(ingrediente1);
        ingredientes.add(ingrediente2);
        
        receta.setIngredientes(ingredientes);
        
        //Agregar pasos https://www.recetasnestle.com.mx/recetas/frankie-brownie-halloween-postre-horno
        
        receta.setDificultad(Dificultad.INTERMEDIO);
        
        // No lo hice xd
        
        List<Paso> pasos = new ArrayList<>();
        Paso paso1 = new Paso();
        paso1.setOrden(1);
        paso1.setDescripcion("Bla bla bla bla");
        
        
        
        
        
    }
}
