import java.io.*;
class SelectionSortRec{
    public static void main(String args[]) throws IOException{
        SelectionSortRec obj=new SelectionSortRec();
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no. of elements.");
        int n=Integer.parseInt(input.readLine());
        System.out.println("Enter the "+n+" element array:");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(input.readLine());
        obj.sorting(a,0,n);
        System.out.println("The Sorted Array: ");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
    void sorting(int arr[],int size,int limit){
        if(size>=limit-1)
        return;
        int pos=size;
        for(int j=size+1;j<limit;j++){
            if(arr[j]<arr[pos])
            pos=j;
        }
        int temp=arr[size];
        arr[size]=arr[pos];
        arr[pos]=temp;
        sorting(arr,size+1,limit);
    }
}