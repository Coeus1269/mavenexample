package org.jetbrains.demo.shape;


public class Square
    {

    private final int[] sidelengths;
    private int numberOfSides;

    public Square()
        {
        this.numberOfSides = 4;
        sidelengths = new int[0];
        }

    public int getNumberOfSides()
        {return numberOfSides;
        }

    public int getLongestSideLength()
        {
        int LongestSide= 0;
        for (int sidelength : sidelengths)
            {
            if(sidelength>LongestSide)
                LongestSide = sidelength;
            }

        return LongestSide;
        }



    @Override
    public boolean equals(Object o)
        {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return numberOfSides == square.numberOfSides;
        }

    @Override
    public String toString()
        {
        return "Square{" +
                "numberOfSides=" + numberOfSides +
                '}';
        }
    }
