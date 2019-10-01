public class Arrays2DTask39 {
    private static final int N = 3;
    private static final int M = 3;
    private static final int L = 3;
    public static void task39(){
        int a[][] = new int[L][M];
        int b[][] = new int[M][N];

        int counter = 5;
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j, ++counter){
                a[i][j] = counter;
                b[i][j] = counter;
            }
        }

        int[][] result = new int[L][M];

        for (int i = 0; i < L; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < N; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for(int i = 0;i < N; ++i){
            for(int j = 0;j < N; ++j){
                System.out.print(result[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
    }

}


