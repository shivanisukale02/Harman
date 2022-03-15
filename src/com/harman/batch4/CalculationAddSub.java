package com.harman.batch4;

import java.util.Scanner;

public class CalculationAddSub {

    public static void main(String[] args) {

        Addition adCalc = new Addition();
        Substraction subCalc = new Substraction();
        Scanner input= new Scanner(System.in);
        int n1,n2,result1,result2;
        System.out.println("Enter num1");
        n1=input.nextInt();
        System.out.println("Enter num2");
        n2=input.nextInt();
        result1= adCalc.AdditionOperation(n1,n2);
        result2= subCalc.Suboperation(n1, n2);
        System.out.println(result1);
        System.out.println(result2);

    }

}
