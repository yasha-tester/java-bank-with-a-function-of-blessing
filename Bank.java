import java.util.Scanner;

public class Bank {

static double balance = 0;

public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int option = 0;
while(option !=5){
System.out.println("Good people! Welcome to the bank of Java.");
System.out.println("1. Check balance");
System.out.println("2. Deposit");
System.out.println("3. Withdraw money");
System.out.println("4. Get a blessing");
System.out.println("5. Exit");
System.out.println("Choose your option for your needs!: ");
option = scanner.nextInt();

switch(option){
case 1:
checkBalance();
break;
case 2:
deposit();
break;
case 3:
withdraw();
break;
case 4:
blessing();
break;
case 5:
exit(1);
break;
default:
System.out.println("Entered option is invalid. Please, try again");
break;
}
}
}

public static void checkBalance(){
System.out.println("Your current balance is $" + balance);
}

public static void deposit(){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the amount to deposti: $");
double amount = scanner.nextDouble();
balance += amount;
System.out.println("$" + amount + " has been deposited to your account.");
checkBalance();
}

public static void withdraw(){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the amount to withdraw: $");
double amount = scanner.nextDouble();
if(amount > balance){
System.out.println("Insufficient funds");
} else {
balance -= amount;
System.out.println("$" + amount + " has been withdrawn from your account");
}
checkBalance();
}

public static void blessing(){
Scanner scanner = new Scanner(System.in);
System.out.println("May God bless your soul!");
System.out.println("Now you can press 5 and tell the Santa Clause what do you want for Christmas!");
int option = 0;
while(option !=5){

option = scanner.nextInt();

switch(option){
case 1:
naughtyBoy();
break;
case 2:
gotcha();
break;
case 3:
naughtyBoy();
break;
case 4:
extraBlessing();
break;
case 5:
exit(2);
break;
default:
System.out.println("Entered option is invalid. Please, try again");
break;
}
}
}

public static void naughtyBoy(){
System.out.println("Youu thhe littttle naughty boy! How dare you do it exactly otherwise you've been told to?'");
}

public static void gotcha(){
System.out.println("AHhhhh!! Youuuuu theeeee naughtyBooooooooeeeee! Get offa that thang! Get it right!! How can someone do such a thing?! But i gotcha! Take that! You're busted!");
}

public static void extraBlessing(){
System.out.println("May the God be with you! Be careful and brave, you! If you'll try hard enough for long enough you'll get what you need! God bless you!");
}
public static void exit(int num){
if(num == 2){
System.out.println("You have exited your last layer of menu, now you're in the main menu.");
}
if(num == 1){
System.out.println("Thank you for banking with us. Have a great day and a great life and may god bless you.");
}
}
}
