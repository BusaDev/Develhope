public class Es_Matrix2 {
    public static void main(String args[]) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        showMatrix(matrix);
        showMatrix(swapMatrix(matrix));
    }
    public static void showMatrix (int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
    public static int[][] swapMatrix (int[][] matrix){
        int[][] matrix2 = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j <= matrix[i].length -1; j++){
                matrix2[j][i] = matrix[i][j];
            }            
        }
        return matrix2;
    }
}