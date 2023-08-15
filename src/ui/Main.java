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

    public static double pow(double base, double expo){

        double result= 1;

        if(expo>=0){
            for (int i=1; i<=expo; i++){
            result *= base;
            }
        }else{
            for (int i=1; i<=expo; i++){
                result /= base;
            }
        }
        return result;
    }

    public static double factorial(double fac){
        double result = 1;
        
        for (int i = 1; i <= fac; i++) {
          result *= i;
        }
        
        return result;
    }

    public static double cosine(double x){
        double result= 0;
        double numerator;
        double denominator;
        double term;

        for (int i=0; i<=50; i++){
            numerator = (pow(-1,i));
            denominator = factorial(2*i);
            term = pow(x,2*i);
            result += (numerator/denominator)*term;
        }
        return result;
    }

    public static double absoluteV(double numA){
		if (numA<0){
			numA = numA * (-1);
		}
		return numA;
	}

    public static double evaluate(String function, double x) {
        switch (function) {
            case "f":
                return 2 * cosine(x * x);
    
            case "g":
                return 3 * pow(x, 3) + 7 * pow(x, 2) + 5;
    
            case "h":
                return x * cosine(x);
    
            default:
                System.out.println("Invalid function");
                return Double.NaN;
        }
    }

    public static double metBis(String function, double a, double b, double epsilon){
        double fa = evaluate(function, a);
        double fb = evaluate(function, b);
        double c = 0;
        double fc = 0;
        int iterations = 0;
    
        while (absoluteV(b - a) > epsilon && iterations < 100) {
            c = (a + b) / 2;
            fc = evaluate(function, c);
    
            if (fa * fc < 0) {
                b = c;
                fb = fc;
            } else {
                a = c;
                fa = fc;
            }
    
            iterations++;
        }
    
        return c;

    }

}
