public class biniarysearch_missingnumber_1539 {
    public static void main(String[] args){
       int i,j;
       int count=0;
       int[][] matrix = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
       for(i=0;i<matrix.length;i++)
       {
       for(j=0;j<matrix[0].length;j++)
       {
           if (matrix[i][j]<0)
           {
               count++;
           }else {
               continue;
           }
       }

       }
        System.out.println(count);
       }
    }