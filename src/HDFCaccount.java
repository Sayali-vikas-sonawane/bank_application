import java.util.UUID;

public class HDFCaccount implements bankaccount_interface{
    private String name;
    private String accno;
    private String password;
    private double balance;
    final double rateofinterest=7.1;
    final String IFSCCode="HDFC127890";

    public HDFCaccount() {
    }
    public HDFCaccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accno= String.valueOf(UUID.randomUUID());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }



    @Override
    public String fetchbalance(String password) {
        if(this.password.equals(password))
        {
            return "your balance is :" +this.balance;
        }
        return "incorrect password";
    }

    @Override
    public String addmoney(double amount) {
        this.balance+=amount;
        return "Amount added successfully,new balance is :"+this.balance;
    }

    @Override
    public String withdrawmoney(double amount, String password) {
        if(this.password.equals(password))
        {
            if(this.balance<amount)
            {
                return "Insufficient Balance";
            }
        this.balance-=amount;
            return "Amount deducted successfully,new balance is:"+this.balance;
        }
        return "Incorrect password";
    }

    @Override
    public String changepassword(String oldpassword, String newpassword) {
        if(this.password.equals(oldpassword))
        {
               this.password=newpassword;
               return "password changed successfully";
        }
        return "Incorrect password";
    }

    @Override
    public double calculateinterest(int year) {
        return (this.balance*year*rateofinterest)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCaccount{" +
                "name='" + name + '\'' +
                ", accno='" + accno + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateofinterest=" + rateofinterest +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
