package tests;

import java.util.Scanner;

public class DaLimit {
    public static void main(String[] args){
        String input = "1 fish 2 fish red fish blue fish";
        Scanner sc = new Scanner(input).useDelimiter("*fish");   
        sc.tokens();  
        System.out.println(sc.nextInt());    
       System.out.println(sc.nextInt());   
       System.out.println(sc.next());       
       System.out.println(sc.next());   
    }
}
