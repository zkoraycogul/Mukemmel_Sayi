import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt(),total=0;

        for(int i=1;i<number;i++) {
            if(number%i == 0 ) {
                total += i;
            }
        }
        System.out.println(total == number ? number + " Mükemmel sayıdır. " : number + " Mükemmel sayı değildir.");
    }
}
