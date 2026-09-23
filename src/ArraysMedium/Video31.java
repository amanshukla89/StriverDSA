package ArraysMedium;

public class Video31 {
    //SET MATRIX ZEROES-->We need to modify the matrix so that if any cell is 0,
    // then its entire row and entire column become 0.
    static void setZeroesBetter(int[][] matrix) {
        int n = matrix.length;       // number of rows
        int m = matrix[0].length;    // number of columns
        int[] col = new int[m];
        int[] row = new int[n];

        for(int i = 0; i< n ;i++) {
            for(int j = 0;j < m;j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col [j] = 1;
                }
            }
        }
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < m;j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
    void main() {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

    }
}
