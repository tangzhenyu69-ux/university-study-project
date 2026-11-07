package universitystudy.PA2demo1;

public class test {
    public static void main(String[] args) {
        PrintAccount pa = new PrintAccount(100);
        pa.topUp(10000);
        System.out.println(pa.getBalance());
        pa.pay(120);
        System.out.println(pa.getBalance());
        pa.pay(31);
        System.out.println(pa.pay(31));
        System.out.println(pa.getBalance());
    }
}
