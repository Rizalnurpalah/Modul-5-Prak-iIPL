/**
 * @(#)Point.java
 *
 *
 * @author M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/12/4
 */


public class Point
{
    private final int x, y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    @Override
    public boolean equals(Object other)
    {
        if (this == other)
          return true;

        if (!(other instanceof Point))
          return false;

        Point otherPoint = (Point) other;
        return otherPoint.x == x && otherPoint.y == y;
    }


    @Override
    public int hashCode()
    {
        return (Integer.toString(x) + "," + Integer.toString(y)).hashCode();
    }

}