class Bank {

    double amount;

    // constructor
    Bank(double amount) {
        this.amount = amount;
    }

    void withdraw(double w) {
        String msg = (w <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(msg);

        if (w <= amount)
            amount = amount - w;
    }

    void deposit(double d) {
        amount = amount + d;
    }

    public static void main(String[] args) {

        Bank b = new Bank(10000);

        b.withdraw(3000);
        b.deposit(5000);

        System.out.println("Final Balance = " + b.amount);
    }
}
