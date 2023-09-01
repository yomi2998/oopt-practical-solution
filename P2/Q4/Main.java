package P2.Q4;

public class Main {
    public static void main(String[] args) {
        Average avg = new Average();
        int ix = 2, iy = 4, iz = 6;
        double dx = 8.0, dy = 10.0, dz = 12.0;
        System.out.println("calculateAverage(int x, int y): " + avg.calculateAverage(ix, iy));
        System.out.println("calculateAverage(int x, int y, int z): " + avg.calculateAverage(ix, iy, iz));
        System.out.println("calculateAverage(double x, double y): " + avg.calculateAverage(dx, dy));
        System.out.println("calculateAverage(double x, double y, double z): " + avg.calculateAverage(dx, dy, dz));
    }
}
