class ArrayOperation{
    int findMax(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i])
            max=i;
        }
        return arr[max];
    }
    float findMax(float[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i])
            max=i;
        }
        return arr[max];
    }
    double findMax(double[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i])
            max=i;
        }
        return arr[max];
    }
    char findMax(char[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i])
            max=i;
        }
        return arr[max];
    }
    java.lang.String findMax(java.lang.String[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[max].compareTo(arr[i])<0)
            max=i;
        }
        return arr[max];
    }  
    int findMin(int[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[min]>arr[i])
            min=i;
        }
        return arr[min];
    }
    float findMin(float[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[min]>arr[i])
            min=i;
        }
        return arr[min];
    }
    double findMin(double[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[min]>arr[i])
            min=i;
        }
        return arr[min];
    }
    char findMin(char[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[min]>arr[i])
            min=i;
        }
        return arr[min];
    }
    java.lang.String findMin(java.lang.String[] arr){
        int min=0;
        for(int i=0;i<arr.length;i++){
            if(arr[min].compareTo(arr[i])>0)
            min=i;
        }
        return arr[min];
    }  
}