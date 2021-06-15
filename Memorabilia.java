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
    
    
    
//CONSTRUCTOR
    public Memorabilia(){
      //clientes  
        clienteNombre[0] = "Ana";
        clienteNombre[1] = "Mario";
        clienteNombre[2] = "Edwin";
        
        clienteID[0] = 123;
        clienteID[1] = 234;
        clienteID[2] = 345;
        
        clienteTel[0] = 15795235;
        clienteTel[1] = 23654782;
        clienteTel[2] = 36512548;
        
        tienePeliculaPrestada[0] = false;
        tienePeliculaPrestada[1] = true;
        tienePeliculaPrestada[2] = false;

      //peliculas  
        peliNombre[0] = "cars";
        peliNombre[1] = "parasitos";
        peliNombre[2] = "yourName";
        peliNombre[3] = "matrix";
        peliNombre[4] = "shrek";

        peliCategoria[0] = "infantil";
        peliCategoria[1] = "suspenso";
        peliCategoria[2] = "anime";
        peliCategoria[3] = "cienciaFiccion";
        peliCategoria[4] = "comedia";
 
        peliID[0] = 1;
        peliID[1] = 2;
        peliID[2] = 3;
        peliID[3] = 4;
        peliID[4] = 5;

        peliAnio[0] = 2006;
        peliAnio[1] = 2020;
        peliAnio[2] = 2019;
        peliAnio[3] = 1999;
        peliAnio[4] = 2001;
        
        peliDisponibilidad[0] = false;
        peliDisponibilidad[1] = true;
        peliDisponibilidad[2] = true;
        peliDisponibilidad[3] = true;
        peliDisponibilidad[4] = true;
  
      //menu
        System.out.println("║(O)║♫ ♪ ♫ ♪║(O)║♫ ♪ ♫ ♪║(O)║♫ ♪ ♫ ♪║(O)║♫ ♪ ♫ ♪║(O)║♫ ♪ ♫ ♪║(O)║♫ ♪ ♫ ♪║(O)║♫ ♪ ♫ ♪");
        System.out.println("\n                 (✿◠‿◠) BIENVENIDO AL CONTROLADOR DE DATOS DE:");
        System.out.println("\n ▄ █ ▄ █ ▄ ▄ █ ▄ 𝔸𝕃ℚ𝕌𝕀𝕃𝔼ℝ 𝔻𝔼 ℙ𝔼𝕃𝕀ℂ𝕌𝕃𝔸𝕊 ❜❜𝕄𝔼𝕄𝕆ℝ𝔸𝔹𝕀𝕃𝕀𝔸❜❜ ▄ █ ▄ █ ▄ ▄ █ ▄ ");
        
        System.out.println("                    ⢀⡴⠑⡄⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠸⡇⠀⠿⡀⠀⠀⠀⣀⡴⢿⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⠀⠑⢄⣠⠾⠁⣀⣄⡈⠙⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⠀⢀⡀⠁⠀⠀⠈⠙⠛⠂⠈⣿⣿⣿⣿⣿⠿⡿⢿⣆⠀⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⢀⡾⣁⣀⠀⠴⠂⠙⣗⡀⠀⢻⣿⣿⠭⢤⣴⣦⣤⣹⠀⠀⠀⢀⢴⣶⣆ \n" +
"                   ⠀⠀⢀⣾⣿⣿⣿⣷⣮⣽⣾⣿⣥⣴⣿⣿⡿⢂⠔⢚⡿⢿⣿⣦⣴⣾⠁⠸⣼⡿ \n" +
"                   ⠀⢀⡞⠁⠙⠻⠿⠟⠉⠀⠛⢹⣿⣿⣿⣿⣿⣌⢤⣼⣿⣾⣿⡟⠉⠀⠀⠀⠀⠀ \n" +
"                   ⠀⣾⣷⣶⠇⠀⠀⣤⣄⣀⡀⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠉⠈⠉⠀⠀⢦⡈⢻⣿⣿⣿⣶⣶⣶⣶⣤⣽⡹⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⠀⠀⠀⠀⠉⠲⣽⡻⢿⣿⣿⣿⣿⣿⣿⣷⣜⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣷⣶⣮⣭⣽⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⠀⠀⠀⣀⣀⣈⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⠀⠀⠀⠀⠹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀ \n" +
"                   ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⠿⠿⠿⠿⠛⠉");
        
        System.out.println("\n▄ ▄ █ ▄ █ ▄ ▄ █ ▄▄ █ ▄ █ ▄ ▄ █ ▄▄ █ ▄ █ ▄ ▄ █ ▄▄ █ ▄ █ ▄ ▄ █ ▄\n");
        
        mostrarMenuPrincipal();
        
        
    }
    
    
    
 



//}