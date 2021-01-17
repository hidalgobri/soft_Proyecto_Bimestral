package ec.edu.epn.git.tutoria;

public class Pregunta {
    public static String[] preguntas=
            {"1. En Ecuador, durante el período presidencial de Juan José Flores, ¿qué es lo que generalmente se considera como lo más positivo de su gobierno?",
                    "2. En Ecuador, el Concordato Garciano trajo consigo que: ",
                    "3. En Ecuador, la presidencia de Vicente Rocafuerte merece ser reconocida por su afán civilizador y progresista. Esto se refiere a que:",
                    "4. La conquista de los europeos en América produjo cambios en los aspectos: social, económico, cultural y religioso que "+
                            "incidieron en nuestro país. De las siguientes afirmaciones, la correcta es: ",
                    "5. El estrecho y el canal artificial que separan al continente africano de Europa y Asia son: ",
                    "6. De las siguientes actividades, ¿cuál corresponde a la persona que laboraba en una mina?",
                    "7. En Ecuador, un personaje ilustre de la Colonia que fue médico, escritor y precursor de la independencia, se llamó",
                    "8. A partir de 1809, a Quito comenzó a llamársele Luz de América, porque: ",
                    "9. Cívica es:",
                    "10.De los siguientes titulares del periódico, ¿cuál pertenece a un país que vive en democracia?"};
    public static String[][] opciones={{"A. Gestionó para obtener un pago justo de la deuda inglesa.",
            "B. Entrenó a los soldados venezolanos","C. Se preocupó por la educación de la juventud y de los adultos.",
            "D. El Ecuador tomó posesión oficial de las Islas Galápagos."},
            {"A. La educación era laica, estatal y gratuita, sin distinción de clase social.",
                    "B. Los ecuatorianos, para acceder a la educación, podían profesar cualquier religión.",
                    "C. La educación primaria, secundaria y universitaria quedaba bajo control exclusivo de la Iglesia Católica.",
                    "D. A la Iglesia Católica se le negaba la injerencia en la vida política y educativa del país."},
            {"A. Logró el pago total de la deuda inglesa, adquirida para lograr la Independencia",
                    "B. Reprimió a la delincuencia con rigor y todo intento de la alteración del orden público.",
                    "C. Dentro de la Asamblea Constituyente fue un representante de Cuenca.",
                    "D. Mejoró la educación de la niñez y juventud, fortaleció la economía y las relaciones internacionales."},
            {"A. Se estableció un régimen político y económico militar",
                    "B. Los misioneros enseñaron la lengua española e impusieron la religión católica a los nativos.",
                    "C. América se convirtió en el continente más tecnologizado del mundo.",
                    "D. La potencia inglesa al llegar al Nuevo Continente aniquiló a todos los nativos americanos"},
            {"A. Estrecho de los Dardanelos y canal de Kiel.", "B. Estrecho de Bósforo y canal de Corinto.", "C. Estrecho de Ormuz y canal de Mozambique.",
                    "D. Estrecho de Gibraltar y canal de Suez."},
            {"A. Juan todas las mañanas cultivaba hortalizas en su granja.",
                    "B. Luis trabajaba más de 15 horas, extraía oro y otros minerales.",
                    "C. Pablo laboraba horas extras en una fábrica textil.",
                    "D. Angelita realizaba jornadas de 8 horas diarias en un almacén."},
            {"A. Joaquín Tobar", "B. Manuel Rodríguez Quirola.", "C. Eugenio Espejo","D. Juan Pío Montúfar"},
            {"A. Comenzaron a generarse las primeras ideas libertarias de criollos y autoridades españolas.",
                    "B. Fue la primera revuelta que vivió América contra el colonialismo de Portugal.",
                    "C. En el cuartel Real de Lima fueron asesinados los próceres de la gesta Libertaria.",
                    "D. Fue el inicio del proceso libertario de Latinoamérica contra España; luego toda la región siguió su ejemplo"},
            {"A. Un conjunto de símbolos patrios: Bandera, Escudo e Himno Nacional del Ecuador.",
                    "B. El conocimiento que debe tener una persona para cumplir los deberes y ejercitar los derechos.",
                    "C. Es una disciplina que informa a las autoridades sobre las obligaciones que tienen con la patria.",
                    "D. Un conjunto de medios tecnológicos que ayudan a defender el patrimonio nacional."},
            {"A. Autoridades se niegan a recibir a miembros de un grupo ecologista que fueron reprimidos con violencia.",
                    "B. Las imitaciones burlescas de las autoridades provoca el cierre de señal de las radiodifusoras a nivel nacional.",
                    "C. La ciudadanía de nuestro país se prepara para sufragar en las próximas elecciones,",
                    "D. Las federaciones estudiantiles universitarias que tengan un criterio distinto al del gobierno serán exiliadas."}};
    public static String[] respuestas={"D","C","D","B","D","B","C","D","B","C"};

    public String generarPregunta(int fila){
        String cadena= "\n"+preguntas[fila];
        for(int i=0;i<4;i++)
        {
            cadena+="\n"+opciones[fila][i];
        }
        return cadena;
    }
    public boolean validarIngreso(String letra){
        if(letra.equalsIgnoreCase("a")|| letra.equalsIgnoreCase("b")||letra.equalsIgnoreCase("c")||letra.equalsIgnoreCase("d"))
            return true;
        else
            return false;
    }
    public int validarNota(String respuesta[]){
        int puntaje=0;
        for(int i=0;i<respuesta.length;i++){
            if(respuesta[i].equalsIgnoreCase(respuestas[i])){
                puntaje++;
            }
        }
        return puntaje;
    }
}
