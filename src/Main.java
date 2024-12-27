//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       HDFCaccount ritacc=new HDFCaccount("ritu","9776444",90000);
       System.out.println(ritacc);
       System.out.println(ritacc.fetchbalance("567676"));
       System.out.println(ritacc.fetchbalance("9776444"));
       System.out.println(ritacc.addmoney(5000));
       System.out.println(ritacc.withdrawmoney(2000,"9776444"));
       System.out.println(ritacc.changepassword("9776444","sayali123"));
       System.out.println(ritacc.fetchbalance("sayali123"));
       System.out.println("Interest of 5 years on current balance will be:"+ritacc.calculateinterest(5));
    }
}