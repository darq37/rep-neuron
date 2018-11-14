package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* tablica wejść, tablica wag
        * wejscie x -  loswe wartosci  z przedzialu 0-1 (0 LUB 1)
        * wagi - od 0 do 1 (0.9, 0.7 itp)*/
        Neuron n = new Neuron(5);
       int temp = n.licz(1,0,1,1,0);
        System.out.println(temp);
    }
}
