package ec.edu.epn.git.tutoria;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EstudianteTest {
    Estudiante est [];
    @Before
    public void setUp()
    {
        est = new Estudiante[2];
        est[0] = new Estudiante(001,"Valeria","1997/06/14", "valeria@epn","sociales","001","Elnombrees12");
        est[1] = new Estudiante(002,"Jose", "1997/11/09","jose@epn","sociales","001","pilajose97");
    }

    @org.junit.Test
    public void give_name_when_match_then_true()
    {
        String nombres [] = {"valeria", "brigitte","jose"};
        assertTrue(est[1].matchEstudiante("brigitte",nombres ) );
    }

    @org.junit.Test
    public void given_name_user_when_find_pass_then_ok()
    {
        assertEquals("Elnombrees12",est[1].contraseñaEstudiante("Valeria",est));
    }

    @Test
    public void given_pass_when_match_then_ok()
    {
        assertTrue(est[1].compararContraseñas("contraseña1", "contraseña1"));
    }
}