package ec.edu.epn.git.tutoria;

import org.junit.Test;

import static org.junit.Assert.*;

public class PreguntaTest {

    @Test
    public void given_when_then()
    {
        Pregunta pr = new Pregunta();
        String opciones [] = {"a","b","c","d","a","a","b","d","b","a"};
        assertEquals(2,pr.validarNota(opciones));
    }
}