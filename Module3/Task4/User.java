package alexey_efimenko.Module3.Task4;

/**
 * Created by Linkin on 26.02.2017.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }
    public enum BalancesEnums {
        BALANCEZERO(0), BALANCE1000(1000), ;

        BalancesEnums(int id) {
            this.id = id;
        }

        private int id;

        public int getValue() {
            return id;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    void paySalary() {
        setBalance(getBalance() + getSalary());
    }

    void withdraw(int summ) {
        if (summ < BalancesEnums.BALANCEZERO.getValue()) {
            throw new IllegalArgumentException("Incorect summ");
        }
        if (summ < BalancesEnums.BALANCE1000.getValue() && summ > BalancesEnums.BALANCEZERO.getValue()) {
            setBalance((int) (getBalance() - summ - (summ * 0.05)));
        }
        if (summ >= BalancesEnums.BALANCE1000.getValue()) {
            setBalance((int) (getBalance() - summ - (summ * 0.10)));
        }
    }

    public int companyNameLenght() {
        return getCompanyName().length();
    }
    void monthIncreaser(int addMonth) {
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
    }
}
