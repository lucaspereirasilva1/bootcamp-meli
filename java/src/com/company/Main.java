package com.company;

public class Main {

    public static void main(String[] args) {

        if ( 1 != 1 ){
            System.out.println("primeiro if");
        }else {
            if ( 1 != 1 ){
                System.out.println("primeiro if do else");
            }
            else {
                System.out.println("else dentro do else");

            }
        }
    }
}
