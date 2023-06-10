/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_carmencastillo;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author casti
 */
//el get retorna / 
public class Lab8P1_CarmenCastillo {

    static Scanner leer = new Scanner(System.in);
    static Random rand = new Random();
    static int fila;
    static int column;
    static Libro[][] num;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;
        boolean seguir = true;
        while (seguir) {
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1. Crear biblioteca.");
            System.out.println("2. Modificar librero.");
            System.out.println("3. Salir.");
            System.out.println("Advertencia: Primero cree su biblioteca.");
            System.out.print("Ingrese una opcion: ");
            int opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de filas para el librero: ");
                    int filas = leer.nextInt();
                    System.out.print("Ingrese la cantidad de columnas para el librero: ");
                    int columnas = leer.nextInt();

                    while (filas < 1 || columnas < 1) {
                        System.out.print("Re-ingrese la cantidad de filas para el librero: ");
                        filas = leer.nextInt();
                        System.out.print("Re-ingrese la cantidad de columnas para el librero: ");
                        columnas = leer.nextInt();

                    }

                    num = new Libro[filas][columnas];

                    num = llenarLibrero(filas, columnas);

                    System.out.println("");
                    System.out.println("El librero completo es:");
                    Imprimir(num);

                    contador++;

                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("Primero cree su librero.");
                    } else {
                        System.out.print("Ingrese el título del libro: ");
                        leer.nextLine();
                        String titulo2 = leer.nextLine();
                        System.out.print("Ingrese el escritor: ");
                        String escritor2 = leer.nextLine();
                        System.out.print("Ingrese el año de publicación: ");
                        int anio2 = leer.nextInt();

                        Libro[][] librito = ModificarLibro(titulo2, escritor2, anio2, num);

                        Imprimir(librito);

                    }

                    break;

                default:
                    seguir = false;

            }

        }
    }

    public static Libro[][] llenarLibrero(int x, int y) {
        Libro[][] librero = new Libro[x][y];

        for (int i = 0; i < librero.length; i++) {
            for (int j = 0; j < librero[i].length; j++) {
                System.out.println("");
                System.out.print("Ingrese el título del libro: ");
                leer.nextLine();
                String titulo = leer.nextLine();
                System.out.print("Ingrese el escritor: ");
                String escritor = leer.nextLine();
                System.out.print("Ingrese el año de publicación: ");
                int anio = leer.nextInt();

                Libro book = new Libro(titulo, escritor, anio);
                librero[i][j] = book;

                System.out.print("El libro fue agregado exitosamente.");
                System.out.println("");
            }
        }
        return librero;
    }

    public static void Imprimir(Libro[][] librito) {
        for (int i = 0; i < librito.length; i++) {
            for (int j = 0; j < librito[i].length; j++) {
                System.out.print("[" + librito[i][j].getTitulo() + "]");
            }
            System.out.println("");
        }

    }

    public static Libro[][] ModificarLibro(String titulo, String nombre, int anyo, Libro[][] librito) {
        boolean validac = true;
        for (int i = 0; i < librito.length; i++) {
            for (int j = 0; j < librito[i].length; j++) {
                Libro librero = librito[i][j];
                if (titulo.equals(librito[i][j].getTitulo()) && nombre.equals(librito[i][j].getNombre()) && anyo == librito[i][j].getPublicacion()) {

                    System.out.println("El libro fue encontrado en la fila " + (i + 1) + " y columna " + (j + 1));
                    fila = i;
                    column = j;
                    
                    System.out.println("");
                    System.out.print("Ingrese el título del libro: ");
                    leer.nextLine();
                    String tituloN = leer.nextLine();
                    System.out.print("Ingrese el escritor: ");
                    String escritorN = leer.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int anioN = leer.nextInt();

                    librito[i][j].setTitulo(tituloN);
                    librito[i][j].setNombre(escritorN);
                    librito[i][j].setPublicacion(anioN);

                    System.out.println("El libro fue modificado exitosamente.");
                    validac = false;

                }

            }

        }

        if (validac == true) {

            System.out.println("El libro no fue encontrado.");

        }

        return librito;
    }

}
