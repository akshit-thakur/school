class DeleteElement{
    int[] delete(int[] arr,int del){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==del){
                while(i<arr.length-1){
                    arr[i]=arr[i+1];
                    i++;
                }
            }          
        }
        return arr;
    }
    float[] delete(float[] arr,float del){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==del){
                while(i<arr.length-1){
                    arr[i]=arr[i+1];
                    i++;
                }
            }          
        }
        return arr;
    }
    double[] delete(double[] arr,double del){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==del){
                while(i<arr.length-1){
                    arr[i]=arr[i+1];
                    i++;
                }
            }          
        }
        return arr;
    }
    char[] delete(char[] arr,char del){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==del){
                while(i<arr.length-1){
                    arr[i]=arr[i+1];
                    i++;
                }
            }          
        }
        return arr;
    }
    String[] delete(String[] arr,String del){         
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].equals(del)){
                while(i<arr.length-1){
                    arr[i]=arr[i+1];
                    i++;
                }
            }          
        }
        return arr;
    }
}