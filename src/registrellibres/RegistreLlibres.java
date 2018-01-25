/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrellibres;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexis
 */
public class RegistreLlibres {
    private static final Scanner teclado = new Scanner(System.in);
    private static final Random aleatorio = new Random();

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**Autor aut1 = new Autor("Alejandro", "alejandro@gmail.com", 'M');
        Autor aut2 = new Autor("Juanma", "juanma@gmail.com", 'M');
        Autor aut3 = new Autor("Laura", "laura@gmail.com", 'F');
        System.out.println(aut2);
        
        Llibre llibr = new Llibre("'La era de la desinformación'", aut1, 15.99, 17);
        System.out.println(llibr);
        
        */
        
        
        Autor[] arrayautores = new Autor[5];  
        Llibre[] arraylibro = new Llibre[5];
        int i;
        int j;
        arrayautores[0] = new Autor("Alexis", "email1@gmail.com", 'M');
        arrayautores[1] = new Autor("Ana", "email2@gmail.com", 'F');
        arrayautores[2] = new Autor("Alejandra", "email3@gmail.com ", 'F');
        arrayautores[3] = new Autor("Pascual", "email4@gmail.com", 'M');
        arrayautores[4] = new Autor("Elian", "email5@gmail.com", 'F');
        
        arraylibro[0] = new Llibre("La miséria de la filosofía.", arrayautores[0], 18, 7);
        arraylibro[1] = new Llibre("En un mundo pequeño.", arrayautores[1], 17, 10);
        arraylibro[2] = new Llibre("Nueva Era.", arrayautores[2], 15, 12);
        arraylibro[3] = new Llibre("La ausencia de la nada.", arrayautores[4], 21, 8);
        arraylibro[4] = new Llibre("Nuevos Mares.", arrayautores[3], 8, 3);
        
        for (i = 0; i < arrayautores.length; i++)
        {
            for(j = 0; j < arraylibro.length; j++)
            {
               if(arrayautores[i].getname().equals(arraylibro[j].getautor().getname()))
                {
                    System.out.println("El autor " + arrayautores[i].getname() + 
                    " ha escrito el libro " + arraylibro[j].getnombre());
                }
            }
        }
    }
}