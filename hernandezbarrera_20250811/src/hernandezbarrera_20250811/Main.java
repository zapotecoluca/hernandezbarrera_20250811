/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezbarrera_20250811;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    //VARIABLES
    
    public static int horasEnUnDia=24;
    public static int segundosEnUnaHora=3600;
    public static int segundosEnUnMinuto= 60;
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int segundosTotales= 91111;
        int dias=calcularDias(segundosTotales);
        int segundosRestantesDespuesDeExtraerDias= obtenerSegundosRestantesDespuesDeExtraerDias(segundosTotales);
        int horas = calcularHoras(segundosRestantesDespuesDeExtraerDias);
        int segundosRestantesDespuesDeExtraerHoras = obtenerSegundosRestantesDespuesDeExtraerHoras(segundosRestantesDespuesDeExtraerDias);
        int minutos = calcularMinutos(segundosRestantesDespuesDeExtraerHoras);
        int segundosFinales= obtenerSegundosRestantesDespuesDeExtraerMinutos(segundosRestantesDespuesDeExtraerHoras);
        
        System.out.println("Usted ha solicitado calcular los días, horas, minutos y segundos a partir de un número mayor a 86400");
        System.out.println("Usted ha indicado el valor actual de segundos como: "+segundosTotales);
        System.out.println("Días: " + dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+segundosFinales);


    }
    
    
    public static int calcularDias(int segundosTotales) {
        return segundosTotales/(Main.horasEnUnDia*Main.segundosEnUnaHora);
    }
    
    public static int obtenerSegundosRestantesDespuesDeExtraerDias(int segundosTotales){
            return segundosTotales % (Main.horasEnUnDia *Main.segundosEnUnaHora);
            }
    
    public static int calcularHoras(int segundosRestantes) {
        return segundosRestantes/Main.segundosEnUnaHora;
    }
    
    public static int obtenerSegundosRestantesDespuesDeExtraerHoras(int segundosRestantes){
        return segundosRestantes % Main.segundosEnUnaHora;
    }
    
    public static int calcularMinutos(int segundosRestantes){
        return segundosRestantes/Main.segundosEnUnMinuto;
    }
    
    public static int obtenerSegundosRestantesDespuesDeExtraerMinutos(int segundosRestantes){
       return segundosRestantes%Main.segundosEnUnMinuto; 
    }
    
    

    }

