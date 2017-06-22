package echau.programming.simpleclasses;

/**
 * Represents a BankAccount with a balance and the name of an account holder.
 *
 * @author Eugene Chau
 * @version June 22, 2017
 */
public class BankAccount implements Comparable<BankAccount> {
    private double balance;
    private String name;

    /**
     * Creates a new BankAccount with a balance in dollars and the name of 
     * an account holder.
     * 
     * @throws IllegalArgumentException If the <code>name</code> parameter is null.
     */
    public BankAccount(final double balance, final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name passed to BankAccount "
                + "constructor is null");
        }
        this.balance = balance;
        this.name = name;
    }
    
    /**
     * Deposits the specified amount in dollars into this account. The amount cannot 
     * be negative.
     * 
     * @param amount The amount to deposit in dollars.
     * @throws IllegalArgumentException If the specified amount is negative.
     */
    public void deposit(final double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount: " + amount);
        }
        this.balance += amount;
    }
    
    /**
     * Withdraws the specified amount in dollars from this account. Displays a 
     * warning message if the account is overdrawn.
     * 
     * @param amount The amount to withdraw in dollars.
     */
    public void withdraw(final double amount) {
        this.balance -= amount;
        if (this.balance < 0) {
            System.out.println("Warning: Account is overdrawn!");
        }
    }
    
    /**
     * Compares two BankAccounts based on the name of the holder and the balance. 
     * Comparisons are made primarily based on the balances of both BankAccounts, 
     * but if the balances are the same, compares the names of the account holders.
     * <br>
     * <br>
     * <b>Return values:</b>
     * <ul>
     *  <li>If both names and balances of the two accounts are equal, returns 0.</li>
     *  <li>If the names are the same, but the balances are different, returns 1 if
     *      the balance of this BankAccount is <i>greater</i> than the balance of the
     *      BankAccount in the parameter. Otherwise, returns -1.</li>
     *  <li>If the balances are the same, but the names are different, returns 1 if
     *      <code>this.getName().compareTo(account.getName())</code> returns a positive
     *      integer. Otherwise, returns -1.</li>
     *  <li>If both names and balances are different, compares the balances to see
     *      which is greater. If this BankAccount's balance is greater, returns 1;
     *      otherwise, returns -1.</li>
     * </ul>
     * 
     * @param account The BankAccount to compare this BankAccount to.
     * @return Either -1, 0, or 1 if this BankAccount is less, equal, or greater
     *         than the BankAccount being compared to.
     */
    @Override
    public int compareTo(final BankAccount account) {
        if (this.name.equals(account.getName()) 
            && this.balance == account.getBalance()) {
            return 0;
        } else if (this.balance == account.getBalance()) {
            if (this.name.compareTo(account.getName()) > 0) {
                return 1;
            }
            return -1;
        } else if (this.name.equals(account.getName())) {
            if (this.balance > account.getBalance()) {
                return 1;
            }
            return -1;
        } else {
            if (this.balance > account.getBalance()) {
                return 1;
            }
            return -1;
        }
    }
    
    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }
}
