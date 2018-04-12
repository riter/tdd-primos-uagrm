package com.alenasoft.urbanager.resources.numericalperation;


public class NumericalOperationsServiceImpl implements NumericalOperationsService {


    @Override
    public boolean evalPrimo(int number) {

        for(int cont = 2; cont <= number-1; cont++) {
            if(number % cont == 0)
                return false;
        }

        return true;
    }
}
