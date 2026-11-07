package universitystudy.PA2demo2;
/*Required public members for Question 2:

public PrintJob(int pagesPerCopy, int copies, boolean duplex)
public int getPagesPerCopy()
public int getCopies()
public boolean isDuplex()
public int getSheets()
public abstract int getCost()
Declare PrintJob itself abstract. Its constructor receives pagesPerCopy in 1 to 100 and copies in 1 to 10. All bounds are inclusive. The boolean duplex indicates double-sided printing.

The page count, copy count, and duplex setting cannot change after construction. The getters return these properties without changing any state. A job only describes printing settings and quotes sheets and cost; it does not make payments or track whether anything has been printed.*/

public abstract class PrintJob {
    private int pagesPerCopy;
    private int copies;
    private boolean duplex;

    public PrintJob(int pagesPerCopy, int copies, boolean duplex) {
        this.pagesPerCopy = pagesPerCopy;
        this.copies = copies;
        this.duplex = duplex;
    }

    public int getPagesPerCopy() {
        return pagesPerCopy;
    }

    public int getCopies() {
        return copies;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int getSheets() {
        if (duplex) {
            if (pagesPerCopy % 2 == 0) {
                return pagesPerCopy / 2 * copies;
            } else
                return (pagesPerCopy + 1) / 2 * copies;
        } else
            return pagesPerCopy * copies;
    }

    public abstract int getCost();

    public static int getTotalCost(PrintJob[] jobs) {
        int sum = 0;
        if (jobs.length >= 0 && jobs.length <= 100) {
            for (int i = 0; i < jobs.length; i++) {
                sum += jobs[i].getCost();
            }
            return sum;
        } else
            return 0;
    }

    private static PrintJob[] replace(PrintJob[] jobs) {
        PrintJob[] newJobs = new PrintJob[jobs.length];
        if (jobs.length == 0)
            return newJobs;
        for (int i = 0; i < newJobs.length; i++) {
            newJobs[i] = jobs[i];
        }
        for (int i = 0; i < newJobs.length; i++) {
            for (int j = 0; j < newJobs.length - 1; j++) {
                if (newJobs[j].getCost() > newJobs[j + 1].getCost()) {
                    PrintJob temp = newJobs[j];
                    newJobs[j] = newJobs[j + 1];
                    newJobs[j + 1] = temp;
                }
            }
        }
        return newJobs;
    }

    public static int maxJobsWithinBudget(PrintJob[] jobs, int budget) {
        PrintJob[] newJobs = replace(jobs);
        int count = 0;
        int sum = 0;
        if (jobs.length == 0 || budget < newJobs[0].getCost()) {
            return count;
        } else {
            while (sum < budget && count < newJobs.length) {
                sum += newJobs[count].getCost();
                if (sum > budget)
                    break;
                count++;
            }
            return count;
        }
    }
}
