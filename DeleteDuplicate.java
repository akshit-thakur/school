class DeleteDuplicate{
    String[] delete(String[] arr){
        int limit=arr.length;
        for(int i=0;i<limit-1;i++){
            for(int j=i+1;j<limit;j++){
                if(arr[i].equals(arr[j])){
                    limit-=1;
                    for(int k=j;k<limit;k++)
                    arr[k]=arr[k+1];
                    j-=1;
                }
            }
        }
        return arr;
    }    
    int[] delete(int[] arr){
        int limit=arr.length,j=0,k=1;
        for(int i=0;i<limit;i++){
            if(arr[i+1]==arr[i]){
                if(i+j<=arr.length&&i+k<=arr.length){
                    arr[i+j]=arr[i+k];  
                    j++;k++;
                }
            }
        }
        return arr;
    }
}