class ArrayInheritance {
    char type;
    int size;
}

// ArrayInheritance(int caller) { // 0 for sort,1 for search
// defineValues(caller);
// switch (Character.toLowerCase(type)) {
// case 'c':
// char[] arr = new char[size];
// break;
// case 'd':
// double[] arr1 = new double[size];
// break;
// case 'f':
// float[] arr2 = new float[size];
// break;
// case 'i':
// int[] arr3 = new int[size];
// break;
// case 's':
// java.lang.String[] arr4 = new java.lang.String[size];
// break;
// }
// }

// void defineValues(int caller) {
// Scanner read = new Scanner(System.in);
// System.out.println("Enter the size: ");
// int size = read.nextInt();
// System.out.println("Enter c for char,d for double, f for float, i for int,s
// for string");
// char type = read.next().charAt(0);
// if (caller == 1) {
// switch (Character.toLowerCase(type)) {
// case 'c':
// char search5 = read.next().charAt(0);
// break;
// case 'd':
// double search4 = read.nextDouble();
// break;
// case 'f':
// float search3 = read.nextFloat();
// break;
// case 'i':
// int search2 = read.nextInt();
// break;
// case 's':
// java.lang.String search1 = read.next();
// break;
// }
// }
// read.close();
// }
// }

// class LinearSearch extends ArrayInheritance {
// LinearSearch() {
// super(0);
// }
// }

// class BinarySearch extends ArrayInheritance {
// BinarySearch() {
// super(0);
// }
// }

// class BubbleSort extends ArrayInheritance {
// BubbleSort() {
// super(1);
// }

// void sort(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// }

// void sort(float arr[]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// float temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// }

// void sort(double arr[]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// double temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// }

// void sort(char arr[]) {
// for (int i = 0; i < arr.length; i++) {
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// char temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// }
// }

// class SelectionSort extends ArrayInheritance {
// SelectionSort() {
// super(1);
// }
// }
