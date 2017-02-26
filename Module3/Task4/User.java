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
    } //- добавляет заработную плату к балансу пользователя

    void withdraw(int summ) {
        if (summ<0){throw new IllegalArgumentException("Incorect summ");
        if (summ<1000&&summ>0){setBalance(getBalance()-summ-(summ*0.05)};
        if (summ>=1000){setBalance(getBalance()-summ-(summ*0.10)};
    }// - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях

    public int companyNameLenght() {
        return getCompanyName().length();
    }   //- вычисляет длину имя компании

    void monthIncreaser(int addMonth) {
        setMonthsOfEmployment(getMonthsOfEmployment() + addMonth);
    }// - увеличивает monthsOfEmployment на addMonth
}
