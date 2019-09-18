package com.example.libmayuri;
import java.util.Scanner;

public class Foryou extends Fantastic implements Basanti{
    static int n;
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("I can do that");
        Foryou Foryou=new Foryou();


        Foryou.shock();
        Foryou.input(n);
        Foryou.disco(n);
        if(n!=0){
            Foryou.disco(n);
        }

    }


    public void shock(){
        System.out.println("Enter the value for n ");
        n = scanner.nextInt();
        System.out.println("The value of n"+n);
    }
}

