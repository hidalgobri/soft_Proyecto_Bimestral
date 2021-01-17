package ec.edu.epn.git.tutoria;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class EstudianteParameterTest {
    private String contraseñaIngresada;
    private String contraseñaReal;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"valeria", "valeria"});
        objects.add(new Object[]{"vbrillo", "vbriLlo"});
        objects.add(new Object[]{"contrase03", "contrase03"});
        objects.add(new Object[]{"fielEsJesus", "fielEsJesus"});
        objects.add(new Object[]{"holaRIA", "holaRIA"});
        return objects;

    }

    public EstudianteParameterTest(String input, String real) {
        this.contraseñaIngresada = input;
        this.contraseñaReal = real;
    }

    @Test
    public void given_pass_when_match_then_ok() {
        Estudiante e = new Estudiante();
        assertTrue(e.compararContraseñas(contraseñaIngresada, contraseñaIngresada));
    }
}