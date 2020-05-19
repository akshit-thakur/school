class SpiralMat{
    public static void main(String args[]){
        int[][] mat=new int[4][4];
        int[] resultArr=new int[16];
        int num=0,r=0,c=0,ctr=0;
        System.out.println("The 4x4 matrix is: ");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                num+=1;
                mat[i][j]=num;  
                System.out.print(mat[i][j]+" ");
            }       
            System.out.println();
        }        
        for(c=0;c<=3;c++){
            resultArr[ctr]=mat[r][c];
            ctr++;
        }
        for(r=1;r<4;r++){
            resultArr[ctr]=mat[r][c-1];
            ctr++;
        }   
        for(;c-2>=0;c--){
            resultArr[ctr]=mat[r-1][c-2];
            ctr++;
        }         
        for(;r-2>=1;r--){
            resultArr[ctr]=mat[r-2][c-1];
            ctr++;
        }
        for(;r>1;r--){
            resultArr[ctr]=mat[r-1][c];
            c++;
            ctr++;
            resultArr[ctr]=mat[r-1][c];
            ctr++;
        }
        resultArr[ctr]=mat[r+1][c];
        ctr++;
        resultArr[ctr]=mat[c][r];  
        System.out.println("The spiral is: ");
        for(int i=0;i<=ctr;i++)
        System.out.print(resultArr[i]+" ");
    }
}