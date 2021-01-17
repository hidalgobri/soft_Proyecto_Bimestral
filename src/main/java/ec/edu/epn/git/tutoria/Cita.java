package ec.edu.epn.git.tutoria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cita {

    public String codigo;
    public Cita (){
        this.codigo = "223";
    }

    public boolean validaCurso(String materia) {
       /* if(materia.equalsIgnoreCase("ICR222"))
           return true;
        else{
            return false;
        }*/
        return(materia.equalsIgnoreCase("ICR222"));
    }

    public boolean registroTutor(String materia, String nombre) {
        String tutor;
        Curso cu = new Curso();
        tutor = cu.consultaTutor(materia);
     /*   if(tutor.equalsIgnoreCase(nombre))
            return true;
        else
            return false;*/
        return(tutor.equalsIgnoreCase(nombre));
    }

    public boolean validaIngreso(String Curso, String Nombre, String fecha, String hora) {
        boolean valor=false;
        Pattern p;
        Matcher m;
        p= Pattern.compile("[ICCR][0-9]{3}");
        m=p.matcher(Curso);
        valor =m.matches();
        p=Pattern.compile("[A-Za-z]*");
        m=p.matcher(Nombre);
        p= Pattern.compile("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}");
        m=p.matcher(fecha);
        valor =m.matches();
        p= Pattern.compile("[0-9]{2}[:]{1}[0-9]{2}");
        m=p.matcher(hora);
        valor =m.matches();
        return valor;
    }

    public boolean existeCita(String id) {
        /*if(id.equalsIgnoreCase(codigo)){
            return true;
        }else{
            return false;
        }*/
        return (id.equalsIgnoreCase(codigo));
    }
}
