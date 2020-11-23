package Clase;

/**
 *
 * @author Xavi
 */
public class Personaje 
{
    public static String[] v_raza = {"Humano", "Elfo", "Enano", "Orco", "Troll", "Mecha", 
            "Planta", "Insecto"};
        
    public static String[] v_elemento = {"Agua", "Fuego", "Aire", "Tierra", "Trueno", 
            "Metal", "Hielo", "Mineral", "Roca"};
        
    public static String[] v_estilo = {"Comic", "Académico", "Japonés", "Manga", "Cartoon", 
            "Estilizado", "Medieval", "Hip hop"};
        
    public static String[] v_cultura = {"Celta", "Japonesa", "China", "Nórdica", 
            "Precolombina", "Griega", "Romana", "Africana", "Rusa", "Europea"};
        
    public static String[] v_profesion = {"Mago", "Arquero", "Alquimista", "Ninja", 
            "Ladrón", "Mercader", "Espadachín", "Caballero", "Paladín", 
            "Asesino", "Sacerdote", "Sabio", "Herrero", "Cazador", "Bardo", 
            "Gladiador", "Mecánico", "Artista marcial", "Samurai", "Músico", 
            "Artista"};
    
    String Cultura, Elemento, Estilo, Profesion, Raza;

    public Personaje() 
    {
    
    }
    
    public static int generador_num(int tamaño)
    {
        System.out.println("paso 1 generar numero");
        int indice = (int)(Math.random() * tamaño);
        return indice;
    }
    
    public static String buscador(String[] arreglo, int tamaño)
    {
        System.out.println("paso 2 buscar caracteristica");
        String dato = arreglo[generador_num(tamaño)];
        return dato;
    }
    
    public void modificar_datos()
    {
        System.out.println("paso 3 modificar atributos");
        Raza = buscador(v_raza, v_raza.length );
        Elemento = buscador(v_elemento, v_elemento.length);
        Estilo = buscador(v_estilo, v_estilo.length);
        Cultura = buscador(v_cultura, v_cultura.length);
        Profesion = buscador(v_profesion, v_profesion.length);
    }
    
    public Object[] matriz()
    {
        System.out.println("paso 4 crear matriz");
        String[] matriz = new String[5];
        matriz[0] = Cultura;
        matriz[1] = Elemento;
        matriz[2] = Estilo;
        matriz[3] = Profesion;
        matriz[4] = Raza;
        return matriz;
    }
}
