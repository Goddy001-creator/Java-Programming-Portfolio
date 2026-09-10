package Session2.task02;

public class LoanCalculator {
    public static void main(String[] args) {
        double principal = 5000.00; // Loan amount ($5,000)
        double annualRate = 6.5;    // 6.5% interest
        int durationYears = 2;       // 2 years (24 months)

        double totalInterest = (principal * annualRate * durationYears) / 100.0;
        double totalRepayment = principal + totalInterest;
        double monthlyInstallment = totalRepayment / (durationYears * 12);

        System.out.println("========================================");
        System.out.println("     STUDENT LAPTOP LOAN SUMMARY        ");
        System.out.println("========================================");
        System.out.printf("Principal Borrowed : $%10.2f%n", principal);
        System.out.printf("Interest Rate      : %9.1f%%%n", annualRate);
        System.out.printf("Total Interest Fee : $%10.2f%n", totalInterest);
        System.out.printf("Total Repayment    : $%10.2f%n", totalRepayment);
        System.out.printf("Monthly Payment    : $%10.2f%n", monthlyInstallment);
        System.out.println("========================================");
    }
}
