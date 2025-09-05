class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        
        int[] rows = new int[matrix.length+matrix[0].length];
        int[] cols = new int[matrix.length+matrix[0].length];
        int index=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rows[index]=i;
                    cols[index]=j;
                    index++;
                }
            }
        }

        for(int i=0;i<index;i++){
            SetMatrixZeros.setToZeros(matrix, rows[i], cols[i]);
        }
    }

    public static void setToZeros(int[][] arr,int row,int col){
        for(int i=0;i<arr[row].length;i++){
            arr[row][i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr[i][col]=0;
        }
    }

    public static void main(String[] args) {
        SetMatrixZeros obj = new SetMatrixZeros();
        int[][] matrix = {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        obj.setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
