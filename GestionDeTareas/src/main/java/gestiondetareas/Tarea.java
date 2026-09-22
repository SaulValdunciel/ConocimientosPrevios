/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gestiondetareas;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author daw2
 */
public class Tarea {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int opcion =0;
        GestorTareas tareas = new GestorTareas();
        
        try{
            
            do {
            System.out.println("1. Registrar nueva tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Listar las tareas");
            System.out.println("4. Eliminar tareas");
            System.out.println("0. Salir");
            
            opcion = teclado.nextInt();
            String tarea= "";
            
            switch(opcion){
                case 1 -> {
                    System.out.println("Dime el nombre de la tarea para registrar:");
                    tarea = teclado.nextLine();
                    tareas.registrarTarea(tarea);
                }
                case 2 -> {
                    System.out.println("Dime el nombre de la tarea para completar:");
                    tarea = teclado.nextLine();
                    tareas.marcarTarea(tarea);
                }
                case 3 -> {
                    tareas.listarTareas();
                }
                case 4 -> {
                    System.out.println("Dime el nombre de la tarea que quieres eliminar:");
                    tarea = teclado.nextLine();
                    tareas.eliminarTareas(tarea);
                }
                case 0 -> {
                   System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Opcion no valida");
                }
            }
            
        } while (opcion!=0);
            
        } catch (NullPointerException e) {
            System.out.println("Erro");
        }
        
        
    }
}
