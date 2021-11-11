package tests;

import java.util.Scanner;

class tokens{
    public static void main(String[] args){
        System.out.println("Enter Stuff");
        Scanner Stuff = new Scanner(System.in);
       
        
        while(Stuff.hasNext()){
           if(Stuff.hasNextLine()){
            System.out.println(Stuff.nextLine());

           }
           else if(Stuff.hasNextInt()){
            System.out.println(Stuff.nextInt());
           }
        }
        
        
    }
}