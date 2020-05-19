class ArrayOpDemo {
    public static void main(String args[]){
        ArrayDisplay obj=new ArrayDisplay(); 
        ArrayOperation obj1=new ArrayOperation();
        int[] arr={5,6,7,4,2,1,10,8,7};
        char[] arr1={'e','Z','w','f','G','2'};
        java.lang.String[] arr2={"Abu Dhabi","Zimbabwe","Ambala","Amsterdam","Zurich"};
        System.out.println("The first array: ");
        obj.display(arr);
        System.out.println("The second array: ");
        obj.display(arr1);
        System.out.println("The third array: ");
        obj.display(arr2);
        System.out.println("The max in the first array is "+obj1.findMax(arr)+" and the min is "+obj1.findMin(arr));
        System.out.println("The max in the second array is "+obj1.findMax(arr1)+" and the min is "+obj1.findMin(arr1));
        System.out.println("The max in the third array is "+obj1.findMax(arr2)+" and the min is "+obj1.findMin(arr2));
    }
}