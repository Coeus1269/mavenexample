package org.jetbrains.demo.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SquareTest
    {
    @Test
    void shouldHaveFourSides()
        {
        Square squareTest = new Square();
        int numberOfSides = squareTest.getNumberOfSides();

        Assertions.assertEquals(4, numberOfSides);
        }

    }
