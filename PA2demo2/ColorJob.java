package universitystudy.PA2demo2;

public class ColorJob extends PrintJob {

    public ColorJob(int pagesPerCopy, int copies, boolean duplex) {
        super(pagesPerCopy, copies, duplex);
    }

    @Override
    public int getCost() {
        // TODO Auto-generated method stub
        return 5 + getPagesPerCopy() * getCopies() * 8;
    }

}
