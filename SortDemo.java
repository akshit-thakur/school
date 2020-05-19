class SortDemo {
    public static void main(String args[]) {
        int[] a = { 1, 6, 7, 8, 5, 5 };
        int[] a1 = { 5, 2, 3, 4, 9, 10 };
        BubbleSortPkg obj = new BubbleSortPkg();
        SelectionSortPkg obj1 = new SelectionSortPkg();
        System.out.println("Array 1 before Bubble Sort ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        obj.sort(a);
        System.out.println("\nArray 1 after Bubble Sort ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println("\nArray 2 before Selection Sort ");
        for (int i = 0; i < a1.length; i++)
            System.out.print(a1[i] + " ");
        obj1.selSort(a1, 0);
        System.out.println("\nArray 2 after Selection Sort ");
        for (int i = 0; i < a1.length; i++)
            System.out.print(a1[i] + " ");
    }
}