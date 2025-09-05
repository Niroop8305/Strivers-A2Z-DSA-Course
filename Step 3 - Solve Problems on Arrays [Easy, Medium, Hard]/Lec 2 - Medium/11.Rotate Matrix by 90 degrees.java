class RotateMatrixBy90Degrees {
    public void rotate(int[][] matrix) {
        int m=matrix.length, n=matrix[0].length;
        int arr[][] = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=matrix[i][j];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[j][n-i-1]=arr[i][j];
            }
        }
    }

    public void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RotateMatrixBy90Degrees obj = new RotateMatrixBy90Degrees();
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        obj.printMatrix(matrix);

        obj.rotate(matrix);

        System.out.println("Matrix after 90 degree rotation:");
        obj.printMatrix(matrix);
    }
}
