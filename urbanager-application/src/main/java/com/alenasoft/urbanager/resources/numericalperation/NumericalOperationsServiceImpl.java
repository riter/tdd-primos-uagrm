package com.alenasoft.urbanager.resources.numericalperation;


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
}
