package com.alenasoft.urbanager.resources.numericalperation;


import java.util.ArrayList;

public class NumericalOperationsServiceImpl implements NumericalOperationsService {

    private final String IS_PRIME = "OK";
    private final String FAIL_PRIME = "FAIL";

    @Override
    public boolean evalPrimo(int number) {

        if(number <= 0)
            return false;

        for(int cont = 2; cont <= number-1; cont++) {
            if(number % cont == 0)
                return false;
        }

        return true;
    }

    @Override
    public String isPrime(int number) {
        if (evalPrimo(number))
            return IS_PRIME;
        else
            return FAIL_PRIME;
    }

    @Override
    public int[] loadTheFirstPrime(int limit) {

        int[] listPrime = new int[limit];
        int contPrime = 0;

        int cont = 0;
        while (contPrime < limit) {

            if (evalPrimo(cont)){
                listPrime[contPrime] = cont;
                contPrime++;
            }

            cont++;
        }

        return listPrime;
    }
}
