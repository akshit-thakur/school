class CubesAndSquaresList {
    public static void main(String args[]) {
        for (int i = 1; i <= 20; i++) {
            int square = i * i;
            int cube = i * i * i;
            System.out.println("The square of " + i + " is " + square + " and cube is " + cube);
        }
    }
}