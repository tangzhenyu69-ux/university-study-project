package universitystudy.PA2demo2;

public class test {
    public static void main(String[] args) {
        MonoJob m1 = new MonoJob(5, 2, false);
        System.out.println(m1.getSheets());
        System.out.println(m1.getCost());
        ColorJob c1 = new ColorJob(3, 2, true);
        System.out.println(c1.getSheets());
        System.out.println(c1.getCost());
        PrintJob[] jobs = new PrintJob[1];
        jobs[0] = new MonoJob(1, 1, false);
        System.out.println(PrintJob.maxJobsWithinBudget(jobs, 2));
    }
}
