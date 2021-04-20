
package Matriks;

public class no1 {
   public static void main(String [] args){
        int[][] matriks_b = {
            {1, 2, 3},
            {4, 5, 6},
        };
        int[][] transpose = new int[2][2];
        for (int i=0; i<matriks_b.length; i++){
            for (int j=0; j<matriks_b[0].length; j++){
                transpose[j][i] = matriks_b[i][j];
                
            }
        }
        for (int i=0; i<matriks_b[0].length; i++){
            for(int j=0; j<matriks_b.length; j++){
                System.out.print(transpose[i][j]+" ");
                
            }
            System.out.println();
        }
    }
} 

