import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        NameAsNumber nameAsNumber = new NameAsNumber();
        Scanner scanner = new Scanner(System.in);
        String restart;
        do {
            System.out.println("Input a name:");
            String name = scanner.next();
            System.out.println(nameAsNumber.calculateSumOfName(name));
            System.out.println("Do you want to calculate the sum of another name? (y/n)");
            restart = scanner.next();
        }while(restart.compareToIgnoreCase("Y") == 0);
        scanner.close();
    }
}
