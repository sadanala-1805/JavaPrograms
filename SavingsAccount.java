public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newInterestRate) {
        annualInterestRate = newInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04);

        SavingsAccount person1 = new SavingsAccount(2000.00);
        SavingsAccount person2 = new SavingsAccount(3000.00);

        person1.calculateMonthlyInterest();
        person2.calculateMonthlyInterest();

        System.out.println("Person 1 Balance after 1 month: " + person1.getSavingsBalance());
        System.out.println("Person 2 Balance after 1 month: " + person2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.05); 
        person1.calculateMonthlyInterest();
        person2.calculateMonthlyInterest();

        System.out.println("Person 1 Balance after 2 months: " + person1.getSavingsBalance());
        System.out.println("Person 2 Balance after 2 months: " + person2.getSavingsBalance());
    }
}
