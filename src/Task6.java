import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter natural number");
        int number = scanner.nextInt();
        if(number == 1 || number == 2 || number == 3){
            System.out.println("Its simple number");
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            int X = number % i;
            if(X == 0){
                System.out.println("Its not simple number");
                break;
            }
            else if(i != (int)Math.sqrt(number)){
                continue;
            }
            else{
                System.out.println("Its simple number");
            }
        }
    }
}
