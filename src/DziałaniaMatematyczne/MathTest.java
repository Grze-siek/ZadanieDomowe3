package DziałaniaMatematyczne;

public class MathTest {
    public static void main(String[] args) {
        Math m = new Math();
        System.out.println( m.circleField(2));
        System.out.println(m.isEven(5));
        System.out.println(m.isEven(2));
        System.out.println(m.isOdd(1));
        System.out.println(m.isOdd(2));
        System.out.println(m.power(10));
    }
}
