package ec.edu.epn.git.tutoria;

public class Tutor {
    public String consultaTutor(String materia) {
        String tutor ="";
        if (materia.equals("ICR222")) {
            tutor = "Jaime Gonzales";
        }
        return tutor;
    }
}
