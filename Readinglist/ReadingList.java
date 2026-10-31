package universitystudy.Readinglist;

public class ReadingList {
    private int ownerId;
    private String[] titles;

    public ReadingList(int ownerId, String[] titles) {
        this.ownerId = ownerId;
        this.titles = titles;
    }

    public ReadingList(ReadingList other) {
        // TODO: complete this copy constructor.
        this.ownerId = other.getOwnerId();
        this.titles = new String[other.getTitles().length];
        for (int i = 0; i < this.titles.length; i++) {
            this.titles[i] = other.getTitles()[i];
        }
    }

    public int getOwnerId() {
        return ownerId;
    }

    public String[] getTitles() {
        return titles;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

}
