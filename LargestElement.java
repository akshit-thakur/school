import java.util.*;
class LargestElement{
    int[][] array;  //2D array to store the matrix  
    int max; //stores the element with maximum value 
    int row; //
    int column;
    int maxR;
    int maxC;
    int min; //stores the element with minimum value
    int minC;
    int minR;
    void getInput(){
        try{
            Scanner read=new Scanner(System.in);
            System.out.println("Enter the number of rows for array: ");
            row=read.nextInt();
            System.out.println("Enter the number of columns for array: ");
            column=read.nextInt();
            array=new int[row][column];
            System.out.println("Enter "+row*column+" elements: ");
            for(int i=0;i<row;i++){
                for(int j=0;j<column;j++)
                array[i][j]=read.nextInt();
            }
        }
        catch(InputMismatchException e){
            System.out.println("Wrong input format! Enter a number, try again");
            getInput();
        }
    }
    void findLargestAndSmallest(){
        max=array[0][0]; min=array[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(array[i][j]>max){
                    max=array[i][j];
                    maxR=i+1;
                    maxC=j+1;                    
                }
                if(array[i][j]<min){
                    min=array[i][j];
                    minR=i+1;
                    minC=j+1;                    
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
            System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
    void sort(){        
        int ctr=0; int[] arr=new int[row*column];
        for(int i=0;i<row;i++){            
            for(int j=0;j<column;j++){
                arr[ctr]=array[i][j];
                ctr+=1;
            }       
        }
        for(int j=0;j<ctr;j++){  
            int min=j;
            for(int k=j+1;k<ctr;k++){
                if(arr[k]<arr[min])
                min=k;
            }
            int temp=arr[min];
            arr[min]=arr[j];
            arr[j]=temp;
        }
        ctr=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array[i][j]=arr[ctr];
                ctr++;
            }
        }  
    }
    void display(){
        System.out.println("Largest element "+max);
        System.out.println("Row "+maxR);
        System.out.println("Column "+maxC);
        System.out.println("Smallest element "+min);
        System.out.println("Row "+minR);
        System.out.println("Column "+minC);
        System.out.println("Array in ascending order: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++)
            System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String args[]){
        LargestElement obj=new LargestElement();
        obj.getInput();
        obj.findLargestAndSmallest();
        obj.sort();
        obj.display();
    }
}