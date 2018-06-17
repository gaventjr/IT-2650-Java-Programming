/*
* IT--2650 Java Programming, Summer 2018
* Instructor: Martin P. Walsh
* Student Name: George Avent
* Homework Assignment: Chap 1, Problem 6
* Purpose of Assignment: To show students how to do calculations in Java
*
*/
package it2650homeworkassignmentproblem6;

/**
 *
 * @author Palad
 */
public class IT2650HomeworkAssignmentProblem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this header information will display at the beginning of the output when the Jar file is executed
System.out.println("IT--2650 Java Programming");
// replace John Doe with your student name
System.out.println("Student Name: George Avent");
// replace Chapter 1, Problem 1-99 with the homeword assignment you are submitting
System.out.println("Homework Assignment: Chapter 1, Problem 6");
System.out.println(" _________________________________ ");
System.out.println("");


// Varibles for cadence and gear size

double cadence = 90;
int gearSize = 100;
double speed = gearSize * Math.PI * (1.0/12.0) * (1.0/5280.0)* cadence * 60.0;
System.out.println(" The bike is going " +speed + "MPH");


    }
    
}
