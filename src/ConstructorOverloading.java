public class ConstructorOverloading {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private long phoneNumber;

    public static void main(String[] args) {
//        ConstructorOverloading bobsAccount = new ConstructorOverloading(200, "Bob Marley", "bobmarley@gmail.com");
        ConstructorOverloading charliesAccount = new ConstructorOverloading();
    }

    public ConstructorOverloading() {
        this(10, "Atharv", "atharv@gmail.com");
        System.out.println("Empty constructor");
    }

    public ConstructorOverloading(double balance, String customerName, String customerEmailAddress) {
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        System.out.println("Regular constructor");
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance < withdrawalAmount) {
            System.out.println("Insufficient funds");
            return;
        }
        this.balance -= withdrawalAmount;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return this.customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
