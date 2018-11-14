package com.company;

import java.util.Random;

public class Neuron {
    private double suma;
    private Integer[] x;
    private Double[] w;

    public Neuron(int size) {
        w = new Double[size];
        Random rn = new Random();
        for(int i=0; i<size; i++) {
            w[i] = rn.nextDouble();
        }
    }
    public int licz(int...x){
        double suma = 0;
        for (int i = 0; i<w.length;i++)
            suma+= w[i]*x[i];

        return fun(suma);
    }
    public int fun (double suma){
        if (suma >= 0.7)
            return 1;
        else
            return 0;
    }
}
