public class Arrays2DTask38 {
    private static final int N = 3;
    private static final int M = 3;
    public static void task38(){
        int a[][] = new int[N][M];
        int b[][] = new int[N][M];
        int counter = 0;
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j, ++counter){
                a[i][j] = counter;
                b[i][j] = counter;
            }
        }
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j, ++counter){
                a[i][j] += b[i][j];
            }
        }

            for(int i = 0;i < N; ++i){
                for(int j = 0;j < N; ++j){
                    System.out.print(a[i][j] + " ");
                }
                System.out.print('\n');
            }
            System.out.print('\n');
        }

}

