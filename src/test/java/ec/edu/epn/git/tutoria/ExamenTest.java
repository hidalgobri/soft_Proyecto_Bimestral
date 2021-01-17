package ec.edu.epn.git.tutoria;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExamenTest {

    @Test
    public void given_exam_when_options_then_register() throws InterruptedException {
        Examen ex = new Examen();
        String opciones[] ={"a","b","c","a","b","b","a","b","c","d"};
        assertTrue(ex.completarExamen(opciones));
    }
}