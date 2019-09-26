/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise.pkg5.part.pkg1;

/**
 *
 * @author pardoje_cis21035
 */
import java.util.Scanner;

public class Exercise5Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle lal = new Circle(10);
        Circle lol = new Circle();
        Circle lel = new Circle (10, "blue", true);
        System.out.print(lal);
        System.out.print(lol);
        System.out.print(lel);
    }
    
}
