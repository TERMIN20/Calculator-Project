package tests.calc;

import java.util.Scanner;

public class Components implements Buttons {
    public void startCalc(Scanner a){
        String b;
        int c;
        while(1 != 2){
            if(a.nextLine().trim().toLowerCase().equals("quit")){
                System.out.println("Thank you for Interacting with the IBCS Calculator");
                break;
            }

            else if(!a.nextLine().trim().toLowerCase().equals("quit")){
                System.out.println("ERROR");
                b = a.nextLine();
            }

            else{
                
            }

        }
    }
    
    public String calculate(String a){

    }
}
