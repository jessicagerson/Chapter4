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
    Scanner scan = new Scanner(System.in);
    
    
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
    }
    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter Parker's score for test1.");
        test1 = scan.nextInt();
        System.out.println("Enter Parker's score for test2.");
        test2 = scan.nextInt();

    }
    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------
    //add header for getAverage
    public void getAverage(){
        //add body of getAverage
    }
    //-----------------------------------------------
    //getName: return the student's name
    //-----------------------------------------------
    //add header for getName
    {
        //add body of getName
    }
    //-----------------------------------------------
    //printName: print the student's name
    //-----------------------------------------------
    //add header for printName
    {
        //add body of printName
    }
}
