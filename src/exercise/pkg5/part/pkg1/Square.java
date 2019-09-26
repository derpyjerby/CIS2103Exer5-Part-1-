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
public class Square extends Rectangle{
    
    double side;
    
    public Square (double side){
        super(side,side);
    }
       
    public double getSide (){
        return this.side;
    }
    
    public void setSide (double side){
        this.side = side;
    }
    
    public void setWidth (double side){
        this.width = side;
    }
    
    public void setLength (double side){
        this.length = side;
    }
    
    
    public String toString () {
        return String.format("A Square with side=%.2f, which is a subclass of %s", side, super.toString());
    }
}
