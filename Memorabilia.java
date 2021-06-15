//package src;
import java.util.Scanner;

public class Memorabilia {
    //clase main
    public static void main(String[] args) {
        Memorabilia obj = new Memorabilia();
 
    }

//Globales
    Scanner entrada = new Scanner(System.in);
    int seleccionMenu;
    
    //peliculas
    String[] peliNombre = new String[10];
    String[] peliCategoria = new String[10];
    int[] peliID = new int[10];
    int[] peliAnio = new int[10];
    boolean[] peliDisponibilidad = new boolean[10];
    int contadorInfantil = 1, contadorSuspenso = 1, contadorAnime = 1, contadorCF = 1, contadorComedia = 1, contadorOtroGenero = 0;
    
    //clientes
    String[] clienteNombre = new String[5];
    int[] clienteID = new int[5];
    int[] clienteTel = new int[5];
    boolean[] tienePeliculaPrestada = new boolean[5];
    
    //prestamo peliculas
    int[] idPelicula = new int[5];
    int[] idCliente = new int[5];
    int[] diasPrestamo = new int[5];




}