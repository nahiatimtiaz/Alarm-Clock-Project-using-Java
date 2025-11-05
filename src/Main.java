import java.util.Scanner;
public class Main{
    int accBalance;
    int withdraw;

    public static void balance (int accBalance, int withdraw) throws UserException {
        if(withdraw>accBalance){
            throw new UserException("Withdrawal exceeds ACC balance!");
        }
        else{
            System.out.println(accBalance-withdraw);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter acc balance");
        int accBalance = sc.nextInt();
        System.out.println("Enter how much to withdraw");
        int withdraw = sc.nextInt();

        try {
            balance(accBalance, withdraw);
        }
        catch(UserException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Transaction finished");
        }
    }
}