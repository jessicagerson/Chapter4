package lab;



// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student's info.
// ****************************************************************
import java.util.Scanner;
public class Student
{
    //declare instance data
    String name;
    int test1;
    int test2;
    int average;
    Scanner scan = new Scanner(System.in);
    
    
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        name = studentName;
        
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.

    public void inputGrades()
    {
        System.out.println("Enter "  + name + "'s" + " score for test1.");
        test1 = scan.nextInt();
        System.out.println("Enter " + name + "'s" + " score for test2.");
        test2 = scan.nextInt();
        

    }
    public String getAverage(){
        average = ((test1 + test2) / 2);
        return "" + average;
    }
    public String getName()
    {
        return this.name;
    }
    public void printName()
    {
        System.out.println(name);
    }
        public void summary(){
        System.out.println( "Student: " + this.name + " Test1: " + this.test1 + " Test2: " + this.test2 + " Average: " + this.average);
        
    }
}
