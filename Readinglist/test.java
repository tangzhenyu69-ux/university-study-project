package universitystudy.Readinglist;

public class test {
    public static void main(String[] args) {
        ReadingList other = new ReadingList(126090685, new String[] { "doorman" });
        ReadingList copy = new ReadingList(other);
        System.out.println(copy.getOwnerId());
        other.setOwnerId(126090688);
        System.out.println(other.getOwnerId());
        System.out.println(copy.getOwnerId());
    }
}
