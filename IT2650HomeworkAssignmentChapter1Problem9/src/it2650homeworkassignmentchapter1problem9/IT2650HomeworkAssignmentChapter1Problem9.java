/*
* IT--2650 Java Programming, Summer 2018
* Instructor: Martin P. Walsh
* Student Name: George Avent
* Homework Assignment: Chap 1, Problem 9
* Purpose of Assignment: To show students how to do calculations in Java
*
*/
package it2650homeworkassignmentchapter1problem9;

/**
 *
 * @author Palad
 */
public class IT2650HomeworkAssignmentChapter1Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("IT--2650 Java Programming");
System.out.println("Student Name: George Avent");
System.out.println("Homework Assignment: Chapter 1, Problem 9");
System.out.println(" _________________________________ ");
System.out.println("");


int height;
int inches;
int addedWeight = 110;
double idealWeight;

System.out.println("IDEAL WEIGHT ANALAYSIS");

height=6;
inches=3;
idealWeight=addedWeight+(height-5)*12*5+inches*5;

System.out.println("Your Ideal Weight");
System.out.println("height: "+height);
System.out.println("Inches:" +inches);
System.out.println("Ideal Weight:" +idealWeight);

    }
    
}
