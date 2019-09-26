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
public class Rectangle extends Shape{
    
    double width;
    double length;
    
    public Rectangle (){
        this.width = 1.0;
        this.length = 1.0;
    }
    
    public Rectangle (double width, double length){
        this.width = width;
        this.length = length;
    }
    
    public Rectangle (double width, double length, String color, boolean filled){ 
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    
    public double getWidth (){
        return this.width;
    }
    
    public double getLength (){
        return this.length;
    }
    
    public void setWidth (double width){
        this.width = width;
    }
    
    public void setLength (double length){
        this.length = length;
    }
    
    public double getArea (){
        return this.length * this.width;
    }
    
    public double getPerimeter (){
        return 2 * (this.length + this.width);
    }
    
    public String toString () {
        return String.format("A Rectangle with width of=%.2f and length of =%.2f, which is a subclass of %s", width, length, super.toString());
    }
}
