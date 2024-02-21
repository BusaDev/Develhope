public class Es_Matrix {
    public static void main(String args[]) {
        System.out.println(sumMatrix());
    }
    public static int sumMatrix (){
        int[][] matrix = {{1,2,3,4},{5,6,7,8}};
        int sum = 0;
        for (int i = 0; i <= 0; i++){
            for (int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}