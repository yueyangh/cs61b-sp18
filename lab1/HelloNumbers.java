public class HelloNumbers {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x < 10) {
            sum = sum + x;
            System.out.println(x + " " + "sum: " + sum);
            x = x + 1;
        }
    }
}
