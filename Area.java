//class X program,class overload 
class Area {

    public static double area(int x, int y, int z) {
        double s = (x + y + z) / 2, i = s * (s - x) * (s - y) * (s - z);
        return Math.sqrt(i);
    }

    public static int area(int l, int b) {
        return (l * b);
    }

    public static double area(int r) {
        return (3.14 * (r * r));
    }

    public static void main(String args[]) {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Program to find area.");
        System.out.println("1.Triangle\n2.Square\n3.Rectangle\nEnter choice:");
        int c = Integer.parseInt(input.readLine());
        switch (c) {
        case 1:
            System.out.println("Enter the side of square: ");
            int x = Integer.parseInt(input.readLine());
            int y = Integer.parseInt(input.readLine());
            int z = Integer.parseInt(input.readLine());
            System.out.println("Area of Triangle is: " + area(x, y, z) + "square units.");
            break;
        case 2:
            System.out.println("Enter the radius of the circle: ");
            int r = Integer.parseInt(input.readLine());
            System.out.println("Area of Circle is: " + area(r) + "square units.");
            break;
        case 3:
            System.out.println("Enter the length and breadth of rectangle: ");
            int l = Integer.parseInt(input.readLine());
            int b = Integer.parseInt(input.readLine());
            System.out.println("Area of Rectangle is: " + area(l, b) + " square units");
            break;
        default:
            System.out.println("Invalid Input.");
        }
    }

}
// 18th April 2013
// revisited on 18th December 2019. Formatted in VS Code and merged another Area
// class in this