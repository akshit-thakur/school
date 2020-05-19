class SearchDemo {
    public static void main(String args[]) {
        BinarySearchPkg obj = new BinarySearchPkg();
        int[] arr = { 1, 2, 2, 3, 4, 5, 6, 7, 7 };
        char[] arr1 = { 'e', 'e', 'f', 'g', 'w', 'z' };
        java.lang.String[] arr2 = { "Agartala", "Ambala", "Ambala", "Zimbabwe", "Zurich" };
        System.out.println("2 was found : " + obj.search(arr, 2));
        System.out.println("e was found : " + obj.search(arr1, 'e'));
        System.out.println("Ambala was found : " + obj.search(arr2, "Ambala"));
    }
}