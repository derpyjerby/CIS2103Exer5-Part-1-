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
public class Circle extends Shape{
    
    double radius;
    
    public Circle (){
        this.radius = 1.0;
    }
    
    public Circle (double radius){
        this.radius = radius;
    }
    
    public Circle (double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    
    public double getRadius() {        
        return this.radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return (Math.PI * Math.pow(radius, 2)); 
    }
    
    public double getPerimeter() {
        return (Math.PI * radius * 2); 
    }
    
    public String toString () {
        return String.format("A Circle with radius=%.2f, which is a subclass of %s", radius, super.toString());
    }
}
