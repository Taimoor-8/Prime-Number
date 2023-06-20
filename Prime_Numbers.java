import java.util.Scanner;

public class Prime_Numbers {

    public boolean isPrime(int number){
        int temp;
        for (int i = 2; i <= number / 2; i++){
            temp = number % i;
            if (temp == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Prime_Numbers p = new Prime_Numbers();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value to be checked");
        int number = sc.nextInt();

        if (p.isPrime(number)){
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
    }
}
