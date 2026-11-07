package universitystudy.PA2demo2;

import universitystudy.PA2demo1.PrintAccount;

public class demo {
    public static void main(String[] args) {
        PrintAccount pa = new PrintAccount(60);
        PrintJob m1 = new MonoJob(5, 2, true);
        PrintJob c1 = new ColorJob(3, 2, true);
        System.out.println("Mono sheets: " + m1.getSheets());
        System.out.println("Mono cost: " + m1.getCost());
        System.out.println("Color sheets: " + c1.getSheets());
        System.out.println("Color cost: " + c1.getCost());
        PrintJob[] total = new PrintJob[2];
        total[0] = m1;
        total[1] = c1;
        System.out.println("Total cost: " + PrintJob.getTotalCost(total));
        System.out.println("First payment: " + pa.pay(PrintJob.getTotalCost(total)));
        System.out.println("Balance after first payment: " + pa.getBalance());
        System.out.println("Top-up: " + pa.topUp(10));
        System.out.println("Balance after top-up: " + pa.getBalance());
        System.out.println("Second payment: " + pa.pay(PrintJob.getTotalCost(total)));
        System.out.println("Balance after second payment: " + pa.getBalance());
    }
}
