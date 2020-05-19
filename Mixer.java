/**To do Merge two sorted int arrays in ascending order(ISC 2014)*/
import java.io.*;
class Mixer{
    int arr[]; /*to store the unsorted dupllicate-containing array*/
    int a1[]; /*first array*/
    int a2[]; /*second array*/
    int n;     /*to store size of array 1*/
    int m; /*to store size of array 2*/
    Mixer(int nn,int mm){ /**gives value of nn to size of array,n*/
        n=nn;
        m=mm;
    }
    void accept()throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        a1=new int[n];/**array 1 given size here*/
        System.out.println("Enter "+n+" elements: ");       
        for(int i=0;i<n;i++)
        a1[i]=Integer.parseInt(input.readLine()); /**array 1 filled*/
        a2=new int[m]; /**array 2 given size here*/
        System.out.println("Enter "+m+" elements: ");
        for(int i=0;i<m;i++)
        a2[i]=Integer.parseInt(input.readLine()); /**array 2 filled*/
        arr=new int[m+n]; /**common array size here*/
        for(int i=0;i<n;i++) /**common array gets array 1 elements*/
        arr[i]=a1[i];
        for(int i=0;i<m;i++) /**common array gets array 2 elements*/
        arr[i+n]=a2[i];        
        /**Duplicate Delete*/
        for(int i=0;i<(m+n)-1;i++){
            for(int j=i+1;j<m+n;j++){
                if(arr[i]==(arr[j])){
                    n-=1;
                    for(int k=j;k<m+n;k++)
                    arr[k]=arr[k+1];
                    j-=1;
                }
            }
        }      
        /**Bubble Sort*/
        for(int i=0;i<m+n;i++){
            for(int j=i+1;j<m+n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }        
    }   
    void display(){
        System.out.println("The sorted merged array is: ");
        for(int i=0;i<m+n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])throws IOException{
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array 1: ");
        int nn=Integer.parseInt(input.readLine());/**array size defined here*/
        System.out.println("Enter the size of array 2: ");
        int mm=Integer.parseInt(input.readLine());
        Mixer A=new Mixer(nn,mm); /**A is object name given in question*/
        A.accept(); 
        A.display();
    }
}