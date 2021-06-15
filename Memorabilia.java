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
    
    
    
 

//METODOS
    public void reportes(){
        System.out.println("(✿◠‿◠) REPORTES\n");
        System.out.println("Categoría: infantil           Cantidad de películas: " + contadorInfantil);
        System.out.println("Categoría: suspenso           Cantidad de películas: " + contadorSuspenso);
        System.out.println("Categoría: anime              Cantidad de películas: " + contadorAnime);
        System.out.println("Categoría: cienciaFiccion     Cantidad de películas: " + contadorCF);
        System.out.println("Categoría: comedia            Cantidad de películas: " + contadorComedia);
        System.out.println("Categoría: Otro               Cantidad de películas: " + contadorOtroGenero);
        
        System.out.println("\nPELICULA MAS PRESTADA");
        System.out.println(peliNombre[0]);
        
        System.out.println("\nPELICULA MENOS PRESTADA");
        System.out.println(peliNombre[3]);
        
        System.out.println("\n(✿◠‿◠) CATEGORÍAS");
        for (int i = 0; i < peliCategoria.length; i++) {
            if (peliCategoria[i].equals("infantil")) {
                System.out.println("infantil: " +peliNombre[i]);
            }
            else if (peliCategoria[i].equals("suspenso")) {
                System.out.println("suspenso: "+peliNombre[i]);
            }
            else if (peliCategoria[i].equals("anime")) {
                System.out.println("anime: " + peliNombre[i]);
            }
            else if (peliCategoria[i].equals("cienciaFiccion")) {
                System.out.println("cienciaFiccion: " + peliNombre[i]);
            }
            else if (peliCategoria[i].equals("comedia")) {
                System.out.println("comedia: " + peliNombre[i]);
            }
            else    {
                System.out.println("otros: " + peliNombre[i]);
            }
            
        }
        
        
    }
    
    public void mostrarPeliculasOrdenadas(){
        for ( String a : peliNombre ){
            System.out.println(a);
        }
    }
    
    public void ordenarPeliculas(){
        for (int i = 0; i < peliNombre.length; i++) {
            for (int j = 0; j < peliNombre.length && i != j; j++) {
                if (peliNombre[i].compareToIgnoreCase(peliNombre[j]) < 0) {
                    String apoyo = peliNombre[i];
                    peliNombre[i] = peliNombre[j];
                    peliNombre[j] = apoyo;
                }
            }
        }  
    }

    public void insertarPeliculas(){
        int valorID;
        for (int i = 5; i < 10; i++) {
            System.out.print("\nIngrese el nombre de la pelicula: ");
            entrada.nextLine();
            peliNombre[i] = entrada.nextLine();
            
            System.out.print("Ingrese la categoria de la película (infantil, suspenso, anime, cienciaFiccion o comedia): ");
            peliCategoria[i] = entrada.nextLine();
                switch(peliCategoria[i]){
                    case "infantil":
                        ++contadorInfantil;
                    break;
                    
                    case "suspenso":
                        ++contadorSuspenso;
                    break;
                    
                    case "anime":
                        ++contadorAnime;
                    break;
                    
                    case "cienciaFiccion":
                        ++contadorCF;
                    break;
                    
                    case "comedia":
                        ++contadorComedia;
                    break;
                    
                    default: ++contadorOtroGenero;
                }
            
            do {                
                System.out.print("NO SE PUEDEN INGRESAR ID REPETIDOS: Ingrese el ID de la pelicula: ");
                valorID = entrada.nextInt();
                entrada.nextLine();
            } while (valorID == peliID[i]);
                peliID[i] = valorID;

            System.out.print("Ingrese el año en que se estrenó la película: ");
            peliAnio[i] = entrada.nextInt(); 
            
            peliDisponibilidad[i] = true;
        }
    }

       public void devolverPeliculaPrestada(){
        int devolverIDPeli, devolverIDCliente;
        buscarPrestamoPeliculas(idPelicula, idCliente);
        System.out.println("Ingrese el ID de la pelicula que desea devolver");
        devolverIDPeli = entrada.nextInt();
        
        System.out.println("Ingrese el ID del cliente que devuelve la película");
        devolverIDCliente = entrada.nextInt();
        
        for (int j = 0; j < peliID.length; j++) {
            if (peliID[j] == devolverIDPeli) {
                peliDisponibilidad[j] = true;
                System.out.println("\nCAMBIOS GUARDADOS: ESTADO DE DISPONIBILIDAD DE PELICULA\n");
            }        
        }
        
        for (int j = 0; j < clienteID.length; j++) {
            if (clienteID[j] == devolverIDCliente) {
                tienePeliculaPrestada[j] = false;
                System.out.println("\nCAMBIOS GUARDADOS: ESTADO DE DISPONIBILIDAD DE PELICULA\n");
            }        
        }
        
        mostrarClientes(clienteNombre, clienteID, clienteTel, tienePeliculaPrestada);
    }



//}