/**Array functions of user generated library. 
5. getSumOfElements(int[]) 
6. deleteElement(int[],int,int,int) 
7. mergeArray()
8. deleteDuplicate(int[],int)//t means terms
9. circleMat(int[][])
. BinarySearch(String[],String) 
. LinearSearch(Sting[],String)
. ExchangeSelectionSort(String[])
. BubbleSort(String[])

*/
class ArrayPackage{
    int getSumOfElements(int array[]){   
        int sum=0;
        for(int i=0;i<10;i++)
        sum+=array[i];
        return sum;
    }  
    void deleteDuplicate(String arr[],int t){
        for(int i=0;i<t-1;i++){
            for(int j=i+1;j<t;j++){
                if(arr[i].equals(arr[j])){
                    t-=1;
                    for(int k=j;k<t;k++)
                    arr[k]=arr[k+1];
                    j-=1;
                }
            }
        }
        System.out.println("\nSorted Merged Array.");
        for(int k=0;k<t;k++){
            if(!(arr[k].equals(null)))
            System.out.print(arr[k]+" "); 
        }
    }
    void circleMat(int[][] a){
        int ctr=0;
		for(int i=2;i>=0;i--){
			ctr++;
			if(ctr!=2){	
			    for(int j=2;j>=0;j--)	
			    System.out.print(a[i][j]+" ");				
				System.out.println();
			}	
			else{
				for(int j=0;j<3;j++)
				System.out.print(a[i][j]+" ");
				System.out.println();			
			}
		}
    }
}
