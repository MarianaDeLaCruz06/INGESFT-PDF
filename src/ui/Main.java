package ui;

import java.util.Scanner;



public class Main{
  public static Scanner reader = new Scanner(System.in);


    
    
    public static void main(String[] args){
        

        double a = 0;
        double b = 0;
        double epsilon = 0.001;
        
        boolean fin = false;

        while(!fin){


            System.out.println("MENU");
            System.out.println("Enter a number from 1 to 4 depending on the option to be used.");
            System.out.println("1. f(x) = 2cos(x^2)");
            System.out.println("2. g(x) = 3x^3 + 7x^2 + 5");
            System.out.println("3. h(x) = xcos(x)");
            System.out.println("4. Terminate operations");
            
            int decision = reader.nextInt();

            switch (decision) {
                case 1:
                    
                break;

                case 2:
                    
                break;

                case 3:
                    
                break;
            
                case 4:
                    System.out.println("Terminate operations");
                    fin = true;
                break;
            }

        }
    }


}
