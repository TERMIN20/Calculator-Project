/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ParkerC
 */
public class Main
{    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        
        // add a welcome message here
        
				// comment out either startCalc() or testCalc() (just the method call below) 
				// based on how you want to run the project:
				// uncomment startCalc() to call your method for an interactive calculator
        // uncomment testCalc() to try out a bunch of 
				
        //startCalc();   // you have to write this method below
                        // it should ask the user for input and print
                        // results until the user enters "quit" to stop
        

        // use this to validate your project (the calculator part, anyways)
        testCalc();     // testCalc will call a calculate(String s) method that you create
                        // as part of your overall project. This method will take the user's
                        // input, and return a String with the appropriate output.
        
        // add a goodbye message here
        
    }
		
    public static void startCalc()
    {
        System.out.println("Welcome to our calculator!");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while(!s.equalsIgnoreCase("quit"))
        {
            System.out.println(calculate(s));
            System.out.println("Enter expression: ");
            s = sc.nextLine();
        }
        System.out.println("Thanks for using our calculator :)");
    }
    
    public static String calculate(String s){
        // you add code here to take a String as a parameter, and return a String with the result
        Scanner inputScanner = new Scanner(s);
        String result = "";
        if (inputScanner.hasNextDouble())
        {
            double num1 = 0.0;
            String operation = null;
            double num2 = 0.0;
            if (inputScanner.hasNextDouble())
            {
                num1 = inputScanner.nextDouble();
            }
            else
            {
                return "ERROR";
            }
            if (inputScanner.hasNext())
            {
                operation = inputScanner.next();
            }
            else
            {
                return "ERROR";
            }
            if (inputScanner.hasNextDouble())
            {
                num2 = inputScanner.nextDouble();
            }
            else
            {
                return "ERROR";
            }

            if (operation.equals("+"))
            {
                return Double.toString(num1 + num2);
            }
            if (operation.equals("-"))
            {
                return Double.toString(num1 - num2);
            }
            if (operation.equals("*"))
            {
                return Double.toString(num1 * num2);
            }
            if (operation.equals("/"))
            {
                return Double.toString(num1 / num2);
            }
            if (operation.equals("%"))
            {
                return Double.toString(num1 % num2);
            }
            if (operation.equals("^"))
            {
                return Double.toString(Math.pow(num1, num2));
            }
        }
        else if(inputScanner.hasNext())
        {
            String operation = "";
            double number = 0.0;
            if (inputScanner.hasNext())
            {
                operation = inputScanner.next();
                if (operation.equalsIgnoreCase("quit"))
                {
                    return "quit";
                }
            }
            else
            {
                return "ERROR";
            }
            if (inputScanner.hasNextDouble())
            {
                number = inputScanner.nextDouble();
            }
            else
            {
                return "ERROR";
            }


            if (operation.equals("|"))
            {
                return Double.toString(Math.abs(number));
            }
            else if (operation.equals("v"))
            {
                return Double.toString(Math.sqrt(number));
            }
            else if (operation.equals("~"))
            {
                return Double.toString(Math.round(number));
            }
            else if (operation.equals("s"))
            {
                return Double.toString(Math.sin(number));
            }
            else if (operation.equals("c"))
            {
                return Double.toString(Math.cos(number));
            }
            else if (operation.equals("t"))
            {
                return Double.toString(Math.tan(number));
            }



        }



        // you'll probably call other methods (that you write) here to do work,
        // like deciding if it's a 2-part or 3-part expression, or calculating the result of a
        // 2-part expression or a 3-part expression
        System.out.println();
        return "ERROR";

    }
    

    public static void testCalc() throws FileNotFoundException
    {
        ArrayList<String> problems = new ArrayList<>();
        ArrayList<String> results = new ArrayList<>();
        // load problems from a file
        File fProblems = new File("problems.txt");
        Scanner sc = new Scanner(fProblems);        
        int count = 0;
        String line = "";
        int problemCount = 0;
        int resultCount = 0;
        while (sc.hasNextLine())
        {
            line = sc.nextLine();
            if (!line.startsWith("//") && !line.trim().equals(""))
            {        // ignore comments at the beginning
                problems.add(line.substring(3).trim());
                problemCount++;
                if (sc.hasNextLine())
                {
                    line = sc.nextLine();
                    if (!line.startsWith("//") && !line.trim().equals(""))
                    {
                        results.add(line.substring(3).trim());
                        resultCount++;
                    }
                } 
                count++;
            }
        }
        if (problemCount == resultCount)
        {
            // now run the tests
            for (int i=0; i<problemCount; i++)
            {
                String prob = problems.get(i);
                String result = calculate(prob);
                if (result == null)
                {
                    System.out.println("FAILED test " + i);
                    System.out.println("Expression: " + problems.get(i));
                    System.out.println("Expected result: " + results.get(i));
                    System.out.println("Actual: null String returned from calculate()");
                }
                else
                {
                    if (result.equals(results.get(i)))
                    {
                        System.out.println("PASSED test " + i);
                    }
                    else
                    {
                        System.out.println("FAILED test " + i);
                        System.out.println("Expression: " + problems.get(i));
                        System.out.println("Expected result: " + results.get(i));
                        System.out.println("Actual: " + result);
                    }
                }
                    
            }
        }
        else
        {
            System.out.println("problem file error");
        }    
            
    }
    
    
    
    
}
