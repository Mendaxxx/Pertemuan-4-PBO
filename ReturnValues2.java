public class ReturnValues2 {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(7, 7);
        System.out.println(z);
    }
}
