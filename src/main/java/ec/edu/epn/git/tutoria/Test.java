package ec.edu.epn.git.tutoria;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        /*
        ArrayList<Estudiante> estudiantes = new ArrayList();
        Estudiante est = new Estudiante(0, "valeria", "24/12/1997", "valeria@epn","Estudios Sociales","001","val12");
        Estudiante est1 = new Estudiante(1, "brigitte", "24/02/1990", "brigitte@epn","Estudios Sociales","001","jose12");


        estudiantes.add(est);
        estudiantes.add(est1);

        if(menu()== 1)
        {
            if(usuarioRegistrado()) //si esta registrado
            {

                if(est.existeEstudiante(estudiantes, login()[0]) != -1)
                {
                    Examen ex = new Examen();
                    ex.completarExamen();
                    ex.obtenerNota();
                }
                else
                    System.out.println("Usuario no registrado");
            }
        }
        */
        ArrayList<Estudiante> estudiantes = new ArrayList();
        Estudiante est = new Estudiante(0, "valeria", "24/12/1997", "valeria@epn","Estudios Sociales","001","val12");
        Estudiante est1 = new Estudiante(1, "brigitte", "24/02/1990", "brigitte@epn","Estudios Sociales","001","jose12");

        Estudiante[] estArray = new Estudiante[2];
        estArray[0] = new Estudiante(001,"Valeria","1997/06/14", "valeria@epn","sociales","001","Elnombrees12");
        estArray[1] = new Estudiante(002,"Jose", "1997/11/09","jose@epn","sociales","001","pilajose97");

        String nombres [] = {"valeria", "brigitte","jose"};
        String opciones [] = {"a","b","c","d","a","a","b","d","b","a"};
        Cita cita = new Cita();
        Tutor tut = new Tutor();
        Pregunta preg = new Pregunta ();
        Examen examen = new Examen();

        System.out.println("--------Métodos primera funcionalidad--------");
        System.out.println("validaCurso(ICR222): "+cita.validaCurso("ICR222") );
        System.out.println("registroTutor(Sociales, Jose): "+cita.registroTutor("Sociales","Mateo"));
        System.out.println("validaingreso(sociales, valeria, 2021/01/29, 13:00)"+ cita.validaIngreso("sociales","valeria","2021/01/29","13:00"));
        System.out.println("existeCita(223)"+cita.existeCita("223"));

        System.out.println("existeEstudiante(Array<Estudiantes>,valeria): "+est.existeEstudiante(estudiantes,"valeria"));
        System.out.println("compararContraseñas(con1,con2): "+est.compararContraseñas("con1","con2"));
        System.out.println("matchEstudiante(): "+est.matchEstudiante("brigitte",nombres));
        System.out.println("consultaTutor(ICR222): "+tut.consultaTutor("ICR222"));

        System.out.println("--------Métodos segunda funcionalidad--------");
        System.out.println("validarNota(opciones[])"+preg.validarNota(opciones));
        System.out.println("completarExamen(opciones[])"+examen.completarExamen(opciones));



    }


    public static String[] login()
    {
        Scanner teclado = new Scanner(System.in);
        String[] valoresEntrada = new String[2];

        System.out.println("\t=================================");
        System.out.println("\t-------------Login---------------");
        System.out.println("Ingrese su nombre");
        valoresEntrada[0]=teclado.nextLine();
        System.out.println("Ingrese su email");
        valoresEntrada[1]=teclado.nextLine();

        return valoresEntrada;
    }

    public static int menu()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\t=================================");
        System.out.println("\t-----------TuAcademy!------------");
        System.out.println("\t------------ M e n u ------------");
        System.out.println("1)Rendir Examen");

        return Integer.parseInt(teclado.nextLine());
    }

    public static boolean usuarioRegistrado()
    {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\t=================================");
        System.out.println("¿Se encuentra usted registrado en TuAcademY?");
        System.out.println("0) Si\n1) No");

        return (teclado.nextInt()==0);
    }
}
