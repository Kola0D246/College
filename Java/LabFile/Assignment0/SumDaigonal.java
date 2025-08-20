// Write a program to calculate the average of daigonal element of nXn matrix of number

public class SumDaigonal {
    public static void main (String args[]){
        //variable declaration
        int rows, columns, sum = 0;

        // Create a nXn matrix
        int mat[][] = {{11, 12, 13},
                        {21, 22, 23},
                        {31, 32, 33}};

        // Calculate num of rows and column and check if matrix is nXn
        rows = mat.length;
        columns = mat[0].length;
        if (rows != columns) {
            System.out.println("Give a square (nXn) matrix in program");
            return;   //program end
        }

        // Calculate average of daigonal elements
        for (int i=0; i<rows; i++) {
            sum+= mat[i][i];
            }

        System.out.printf("Average of daigonal elements = %d\n", sum/rows);
    }
}
