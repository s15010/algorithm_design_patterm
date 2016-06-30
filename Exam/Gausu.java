public class Gausu {
    public static void main(String[] args) {
        final int NUM = 3;
        int i, j, k;
        double d, e;
        double a[][] ={{2, 3, -4, -4},{3, -5, 3, 2}, {-4, 9, -2, 8}};

        for(i = 0; i < NUM; i++) {
            d = a[i][i];
            for(j = 0; j < NUM + 1; j++) {
                a[i][j] /= d;

            }
            for(k = i + 1; k < NUM; k++) {
                e = a[k][j];
                for(j = 0; j < NUM + 1; j++) {
                    a[k][j] -= a[i][j] * e;
                }
            }
        }

        for(j = NUM -1; j > 0; j--) {
            for(i = j -1; i >= 0; i--) {
               a[i][NUM] -= a[i][j] * a[j][NUM];
            }
        }

        System.out.printf("x = %f\n", a[0][NUM]);
        System.out.printf("y = %f\n", a[1][NUM]);
    }
}
