package P2.Q2;

public class Main {
    public static double squareRoot(double x) {
        double l, u; // Lower and upper limits
        double m; // Midpoint
        double m2; // Midpoint squared

        if (x < 0) {
            System.out.print("Error: square root of negative number\n");
            System.exit(1);
        }
        if (x == 0)
            return 0;
        if (x < 1.0) {
            l = x;
            u = 1.0;
        } else if (x > 1.0) {
            l = 1.0;
            u = x;
        } else
            return 1.0;
        while (Math.abs((l - u) / l) >= 1.0e-8) {
            m = (l + u) / 2.0;
            m2 = m * m;
            if (m2 > x)
                u = m;
            else
                l = m;
        }
        return (l + u) / 2.0;
    }

    public static void main(String[] args) {
        double x; // The value to be square rooted

        for (x = 0.0; x < 20.0; x += 0.5)
            System.out.println("x = " + x + "  root = " + squareRoot(x));
    }
}
