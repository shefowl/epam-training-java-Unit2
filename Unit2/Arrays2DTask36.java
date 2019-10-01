public class Arrays2DTask36 {
    private static final int N = 3;
    private static final int M = 3;

    public static void task36(){
        float arr[][] = new float [N][M];
        float temp[][] = new float [N][M];

        int counter = 1;
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j, ++counter){
                arr[i][j] = counter;
                temp[i][j] = arr[i][j];
            }
        }
        for(int i = 0; i < N; ++i){
            for(int j = 0; j < N; ++j){
                if((i == 0 || i == N - 1) && (j == 0 || j == N - 1)){
                    if(i == 0 && j == 0) {
                        arr[i][j] = (temp[i+1][j] + temp[i][j+1]) / 2;
                    }
                    if(i == 0 && j == N - 1) {
                        arr[i][j] = (temp[i+1][j] + temp[i][j-1]) / 2;
                    }
                    if(i == N - 1 && j == N - 1) {
                        arr[i][j] = (temp[i-1][j] + temp[i][j-1]) / 2;
                    }
                    if(i == N - 1 && j == 0) {
                        arr[i][j] = (temp[i-1][j] + temp[i][j+1]) / 2;
                    }
                }
                else
                    {
                        if(i == 0 && j > 0) {
                            arr[i][j] = (temp[i+1][j] + temp[i][j+1] + temp[i][j-1]) / 3;
                        }
                        if(i > 0 && j == N - 1) {
                            arr[i][j] = (temp[i+1][j] + temp[i][j-1] + temp[i-1][j]) / 3;
                        }
                        if(i == N - 1 && j > 0) {
                            arr[i][j] = (temp[i-1][j] + temp[i][j-1] + temp[i][j+1]) / 3;
                        }
                        if(i > 0 && j == 0) {
                            arr[i][j] = (temp[i-1][j] + temp[i][j+1] + temp[i+1][j]) / 3;
                        }
                    }

                if((i >= 1 && j >= 1) && (i <= N - 2 && j <= N - 2)){
                    arr[i][j] = (temp[i+1][j] + temp[i][j+1] + temp[i][j-1]) + temp[i-1][j] / 4;
                }

               // arr[i][j] = counter;
               // temp[i][j] = arr[i][j];
            }
        }
        
        for(int i = 0;i < N; ++i){
            for(int j = 0;j < N; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');


    }
}
