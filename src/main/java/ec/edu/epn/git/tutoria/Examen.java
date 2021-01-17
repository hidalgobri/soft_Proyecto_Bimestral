package ec.edu.epn.git.tutoria;

import java.util.Scanner;

public class Examen {
    Pregunta pa;
    String selecciones [];
    public Examen() throws InterruptedException{
        pa = new Pregunta();
        this.selecciones= new String[10];
    }
    public boolean completarExamen(String[] opciones){
        String cadena="",opcion;

        System.out.println("\t=================================");
        System.out.println("\t-----Examen Estudios Sociales----");
        if(opciones.length<10 || opciones.length>10)
        {
            return false;
        }
        else {
            for (int i = 0; i < 10; i++) {
                System.out.println("--------------- Pregunta " + (i + 1) + " ---------------");
                cadena += pa.generarPregunta(i);
                System.out.println(cadena);
                cadena = "";
                if (pa.validarIngreso(opciones[i])) {
                    selecciones[i] = opciones[i];
                } else {
                    System.out.println("\nRespuesta ingresada invalida. Examen no registrado \n");
                    return false;
                }
            }
        }
        return true;
    }
    public void obtenerNota(){
        int nota;
        nota = pa.validarNota(selecciones);
        System.out.println("\nNota es: "+nota+"/10");
    }
}
