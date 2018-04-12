package com.alenasoft.urbanager.resources.numericalperation;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class NumericalOperationsResourceTest {

    private NumericalOperationsServiceImpl service;

    @Before
    public void setUp() {
        service = new NumericalOperationsServiceImpl();
    }

    @Test
    public void evalNumberIsPrime() {
        int number = 5;
        boolean expected = true;
        boolean isPrime = service.evalPrimo(number);
        assertEquals(expected, isPrime);
    }
}