package ec.edu.epn.git.tutoria;

import java.util.Scanner;

public class Curso {
    public String tipo[][];

    public Curso()
    {
        registrarCurso();
    }

    public String[][] getTipo() {
        return tipo;
    }

    public Curso(String materia, String codigo) {
        this.tipo = new String[1][2];
        this.tipo[0][0]= materia;
        this.tipo[0][1]= codigo;
    }


    public void registrarCurso()
    {
        this.tipo = new String[1][2];
        this.tipo[0][0]= "Estudios Sociales";
        this.tipo[0][1]= "001";

    }
    public String consultaTutor(String materia) {
        String tutor ="";
        if (materia.equals("ICR222")) {
            tutor = "Jaime Gonzales";
        }
        return tutor;
    }
}
