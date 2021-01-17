package ec.edu.epn.git.tutoria;

import java.util.ArrayList;

public class Estudiante {
    private int codigo;
    private String usuario;
    private String fechaNacimiento;
    private String correo;
    private Curso curso;
    private String contraseñaUsuario;

    public String getUsuario() {
        return usuario;
    }
    public String getContraseñaUsuario()
    {
        return this.contraseñaUsuario;
    }

    public Estudiante(int codigo, String nombre, String fecha, String correo, String materia, String codigoMateria, String contraseñaUsuario)
    {
        registrarEstudiante(codigo, nombre, fecha, correo, contraseñaUsuario);
        curso = new Curso(materia, codigoMateria);

    }
    public Estudiante()
    {


    }

    public int existeEstudiante(ArrayList<Estudiante> est, String nombre)
    {
        for (int i =0; i<est.size(); i++)
        {
            if(est.get(i).getUsuario().equalsIgnoreCase(nombre))
                return i;
        }
        return -1;
    }
    /*
    public void formularioEstudiante()
    {
        String valores[] = new String[4];
        Scanner teclado = new Scanner(System.in);

        System.out.println("----------------------------------\n");
        System.out.println("-----Registro Estudiante-----------\n");
        System.out.println("1) Ingrese codigo");
        valores[0]=teclado.nextLine();
        System.out.println("2) Ingrese nombre");
        valores[1]=teclado.nextLine();
        System.out.println("3) Ingrese fecha");
        valores[2]=teclado.nextLine();
        System.out.println("4) Ingrese correo");
        valores[3]=teclado.nextLine();

        registrarEstudiante(Integer.parseInt(valores[0]),valores[1],valores[2],valores[3]);
        System.out.println("\t Estudiante registrado con éxito");
    }
    */
    public void registrarEstudiante(int codigo, String nombre, String fecha, String correo, String contraseña)
    {
        this.codigo = codigo;
        this.usuario = nombre;
        this.fechaNacimiento = fecha;
        this.correo = correo;
        this.contraseñaUsuario = contraseña;
    }

    public boolean matchEstudiante(String nombre, String[] nombres) {
        for(int i = 0; i<nombres.length; i++)
            if(nombres[i].equalsIgnoreCase(nombre))
                return true;
        return false;
    }


    public String contraseñaEstudiante(String usuario, Estudiante[] est) {
        for(int i=0; i< est.length; i++)
            if(est[i].usuario.equalsIgnoreCase(usuario))
                return est[i].contraseñaUsuario;
        return "a";
    }

    public boolean compararContraseñas(String contraseñaInput, String contraseñaReal) {
        return contraseñaReal.equals(contraseñaInput);
    }
}
