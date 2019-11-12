package com.emilioaraos;

public class Main {

    public static void main(String[] args) {
        System.out.println("10.000 at 2% interest= "+ calculateInterest(10000.0, 2.0));
//        for (int i=2; i<9; i++ ){
//            System.out.println(calculateInterest(10000.0, i));
//        }
        for (int i=8; i>0; i-- ){
            System.out.println(String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int countPrimeNUmbers= 0;
        for(int i= 2; i<21; i++){
            boolean result= isPrime(i);
            if (result){
                countPrimeNUmbers++;
                System.out.println(i);
                if (countPrimeNUmbers == 6){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
//            System.out.println(result);
        }

    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for (int i = 2; i<= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate){


        return (amount * (interestRate/100));
    }

}
