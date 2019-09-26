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

public class Shape {
    private String color;
    private boolean filled;
    
    public Shape() {
        this.color = "green";
        this.filled = true;
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor() {        
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return this.filled; 
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString () {
        return String.format("A Shape with color of %s and %b", color, filled);
    }
}
