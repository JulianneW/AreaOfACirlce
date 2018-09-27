/*
 * Julianne Wojdak
 * 18/09/18
 * Calculate the are of a circle
 */

package areaofcircle;

/**
 *
 * @author JuWoj8013
 */
public class AreaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius= 15.0;
        double pi = 3.14;
        double area = 0.0;
        // algorithm for area calc
        area = pi * radius * radius;
        System.out.println("The area is " + area + " cm squared");

        // TODO code application logic here
    }
    
}
