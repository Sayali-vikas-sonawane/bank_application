public interface bankaccount_interface {

    String fetchbalance(String password);
    String addmoney(double amount);
    String withdrawmoney(double amount,String password);
    String changepassword(String oldpassword,String newpassword);
    double calculateinterest(int year);
}
