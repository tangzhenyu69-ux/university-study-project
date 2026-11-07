package universitystudy.PA2demo2;

public class MonoJob extends PrintJob {

    public MonoJob(int pagesPerCopy, int copies, boolean duplex) {
        super(pagesPerCopy, copies, duplex);
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return getSheets() * 2;
    }

}
