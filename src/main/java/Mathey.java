public class Mathey {
    public static int max(int x, int y) {
        return Math.max(x, y);
    }
    public static double max(double x, double y) {
        return Math.max(x, y);
    }
    public static int max(int x, int y, int z) {
        return max(x, max(y, z));
    }
    public static double max(double x, double y, double z) {
        return max(x, max(y, z));
    }
    public static int min(int x, int y) {
        return Math.min(x, y);
    }
    public static double min(double x, double y) {
        return Math.min(x, y);
    }
    public static int min(int x, int y, int z) {
        return min(x, min(y, z));
    }
    public static double min(double x, double y, double z) {
        return min(x, min(y, z));
    }
    public static int randomInteger(int a, int b) {
        return (int) (Math.random() * (b - a + 1)) + a; 
    }
    public static int randomInteger(int a) {
        return (int) (Math.random() * (a + 1));
    }
    public static void main(String[] args) {
        System.out.println(randomInteger(1, 2));
        System.out.println(randomInteger(1));
    }
}