package DziałaniaMatematyczne;

public class Math {
    boolean isEven (int a)
        {
            return a%2 == 0;
        }
    boolean isOdd (int a)
        {
            return !(a%2 == 0);
        }
    double circleField (double r)
        {
            return java.lang.Math.PI * java.lang.Math.pow(r, 2);
        }
    int power (int a)
        {
            return a * a;
        }
}
