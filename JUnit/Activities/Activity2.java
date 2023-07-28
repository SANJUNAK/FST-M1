public class Activity2 {
    public class BankAccount {
        private Integer accountBalance;
        // Create a constructor
        public BankAccount(Integer initialBalance) {
            accountBalance = initialBalance;
        }

        // Add method to calculate
        // balance amount after withdrawal
        public Integer withdraw(Integer amount) {
            if (accountBalance < amount) {
                throw new NotEnoughFundsException(amount, accountBalance);
            }
            accountBalance -= amount;
            return accountBalance;
        }
    }
}
