package com.harman.batch4;

import java.util.Scanner;

public class Calculator1 extends ParentClass {

    public static void main(String[] args) {

        Calculator1 ob = new Calculator1();
        Scanner input= new Scanner(System.in);
        int n1,n2,result1,result2;
        System.out.println("Enter num1");
        n1=input.nextInt();
        System.out.println("Enter num2");
        n2=input.nextInt();
        result1= ob.AddOperation(n1,n2);
        result2= ob.SubOperation(n1,n2);
        System.out.println(result1);
        System.out.println(result2);

        }

    }


