package ec.edu.epn.git.tutoria;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class SistemaTest {

    @Test
    public void given_menu_when_input_int_then_return_message()
    {
        Sistema sis = Mockito.mock(Sistema.class);
        Mockito.when(sis.menu(1)).thenReturn("------------Bienvenido----------\n Su examen iniciara pronto");
    }
}