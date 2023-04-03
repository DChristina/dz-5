public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 29;
        int c = 21;
        int d = 20;
        int sum1 = a + b;
        int sum2 = c + d;

        System.out.println( sum1>sum2?true:false);

        sum1++;
        sum2--;
        sum2--;

        System.out.println( sum1>sum2?true:false);

        System.out.println((sum1%2==0) || (sum2%2==0)?true:false);

    }
}