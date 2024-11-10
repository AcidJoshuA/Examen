/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author jcplo
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);    
    System.out.print("números a ingresar: ");
    int n = Scanner.nextInt();      
    if (n <= 0){
    System.out.println("La cantidad de números debe ser mayor que 0.");
    } 
    int mayor, menor; 
    for (int i = 1; i <= n; i++){
    System.out.print("Ingresar el número " + i + ": ");
    int numero = scanner.nextInt(); 
    if (numero > mayor){
    mayor = numero; 
    }
    if (numero < menor){
    menor = numero;  
    }
   }
    System.out.println("El número más grande ingresado es: " + mayor);
    System.out.println("El número más pequeño ingresado es: " + menor);
   }
}
