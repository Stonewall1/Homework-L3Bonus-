import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number");
        int X = scanner.nextInt();
        int sum = 0;
        while(X!= 0){
            sum = sum + (X % 10);
            X = X / 10;
        }
        System.out.println(sum);
    }
}
