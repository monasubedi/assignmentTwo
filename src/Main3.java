import java.util.Scanner;

public class Main3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please, enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Please, enter your birth date in the format-(yyyy-mm-dd) - Example 1989-4-14 ");
        String birthday = sc.nextLine();
        HeartRates rate = new HeartRates(firstName,lastName,birthday);

        System.out.println(rate.getTargetHeartRateRange());
        System.out.println(rate.toString());
        sc.close();

    }
}
