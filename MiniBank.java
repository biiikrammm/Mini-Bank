import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

class Account{
   private final int accountNumber;
   private final String accountHolderName;
   private BigDecimal accountBalance = BigDecimal.ZERO;

   public Account(int accountNumber, String accountHolderName){
      this.accountNumber = accountNumber;
      this.accountHolderName = accountHolderName;
   }

   public int getAccountNumber(){
      return this.accountNumber;
   }

   public String getAccountHolder(){
      return this.accountHolderName;
   }

   public BigDecimal getAccountBalance(){
      return this.accountBalance;
   }

   public void deposit(BigDecimal amount){
      if(amount.compareTo(BigDecimal.ZERO) <= 0){
         System.out.println("Invalid amount!");
         return;
      }
      accountBalance = accountBalance.add(amount);
   }

   public void withdraw(BigDecimal amount){
      if(amount.compareTo(BigDecimal.ZERO) <= 0){
         System.out.println("Invalid amount!");
         return;
      }
      if(amount.compareTo(accountBalance) > 0){
         System.out.println("Insufficient balance!");
         return;
      }
      accountBalance = accountBalance.subtract(amount);
   }

   @Override
   public String toString() {
      return "Account No: " + accountNumber + ", Holder: " + accountHolderName + ", Balance: " + accountBalance.setScale(2, RoundingMode.HALF_UP);
   }
}

public class MiniBank {
   public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      System.out.print("Number of Accounts: ");
      int totalAccounts = in.nextInt();
      Account [] accounts = new Account[totalAccounts];

      for(int i = 0; i < totalAccounts; i++){
         System.out.print("Enter Account Number: ");
         int accountNumber = in.nextInt(); in.nextLine();

         if(searchAccount(accounts, accountNumber) != -1){
            System.out.println("Account number already exists! Try again.");
            i--;
            continue;
         }

         System.out.print("Enter Account Holder Name: ");
         String accountHolderName = in.nextLine();
         System.out.println();

         accounts[i] = new Account(accountNumber,accountHolderName);
      }

      System.out.println("All the accounts: " + Arrays.toString(accounts));

      while(true){

         System.out.print("Enter Account number (0 to exit): ");
         int accountNo = in.nextInt();

         if(accountNo == 0)
            break;

         int index = searchAccount(accounts,accountNo);
         if(index == -1){
            System.out.println("Account Not Found!!");
         }

         else {
            System.out.println("### OPERATIONS ###");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT MONEY");
            System.out.println("3. WITHDRAW MONEY");
            System.out.println("4. EXIT");

            boolean running = true;

            while (running) {
               System.out.print("Enter Choice: ");
               int choice = in.nextInt();

               switch (choice) {
                  case 1:
                     System.out.println("Balance: " +
                             accounts[index].getAccountBalance().setScale(2, RoundingMode.HALF_UP));
                     break;

                  case 2:
                     try{
                        System.out.print("Enter Amount to Deposit: ");
                        BigDecimal depositAmount = new BigDecimal(in.next());
                        accounts[index].deposit(depositAmount);
                     }
                     catch(Exception e){
                        System.out.println("Invalid amount input!");
                        in.nextLine();
                     }
                     break;

                  case 3:
                     try{
                        System.out.print("Enter Amount to Withdraw: ");
                        BigDecimal withdrawAmount = new BigDecimal(in.next());
                        accounts[index].withdraw(withdrawAmount);
                     }
                     catch(Exception e){
                        System.out.println("Invalid amount input!");
                        in.nextLine();
                     }
                     break;

                  case 4:
                     running = false;
                     break;

                  default:
                     System.out.println("Invalid choice!!");
               }
            }
         }
      }
   }

   static int searchAccount(Account []arr, int target){
      if(arr.length == 0)
         return -1;

      for(int i = 0; i < arr.length; i++){
         if(arr[i] != null && arr[i].getAccountNumber() == target)
            return i;
      }
      return -1;
   }
}

