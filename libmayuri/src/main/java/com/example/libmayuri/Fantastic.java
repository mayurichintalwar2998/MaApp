package com.example.libmayuri;
public class Fantastic extends Taste {
    void disco(int y){
        int fact=1;
        for (int i=1;i<=y;i++){
            fact=fact*i;
        }
        System.out.println("Factorial = "+fact);
    }
}

class Taste{
    void input(int x){
        if(x==0){
        System.out.println("Factorial = 1");
    }
        else
        {
            System.out.println("operation begins");
        }
    }
}
class Namkin extends Taste {
    int p = 10, r = 50, t = 60;
        int si = (p * r * t) / 100;
        //System.out.println("Simple Interest is=" +si);



}