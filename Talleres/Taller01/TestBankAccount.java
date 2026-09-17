public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC-1001", "David Quinchia", 1000.0);

        System.out.println("--- BANK ACCOUNT TESTS ---");
        System.out.println("Initial Balance: $" + account.getBalance());

        // Depósito válido e inválido
        System.out.println("Deposit $500: " + account.deposit(500.0)); // true
        System.out.println("Deposit -$100: " + account.deposit(-100.0)); // false

        // Retiro válido, por encima del saldo y valor no permitido
        System.out.println("Withdraw $300: " + account.withdraw(300.0)); // true
        System.out.println("Withdraw $2000 (Exceeds balance): " + account.withdraw(2000.0)); // false
        System.out.println("Withdraw -$50: " + account.withdraw(-50.0)); // false

        System.out.println("Final Balance: $" + account.getBalance());
    }
}