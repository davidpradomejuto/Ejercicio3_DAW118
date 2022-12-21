/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicio3.ejercicio3;

/**
 *
 * @author DAW118
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        String frase = "me llamo david prado";
        
        int conEspacios = frase.length();
        System.out.println("La longitud de la frase con espacios : "+conEspacios);
        int sinEspacios = frase.replace(" ","").length();
        System.out.println("La frase tieen : "+sinEspacios+ " letras");
                
    }
}
