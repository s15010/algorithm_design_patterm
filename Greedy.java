public class Greedy {
    public static void main(String[] args) {
        int change, n, sum, i;

        int val[] = {500, 100, 50, 10, 5, 1 };

        System.out.printf("お釣りの金額は？");
        change = new java.util.Scanner(System.in).nextInt();

        sum = 0;
        for(i = 0; i < 6; i++) {
            n = change / val[i];
            System.out.printf("%d円硬貨 = %d枚\n", val[i], n);
            sum += n;
            change %= val[i];
        }
        System.out.printf("硬貨の合計枚数 = %d枚\n", sum);

        return;
    }
}
