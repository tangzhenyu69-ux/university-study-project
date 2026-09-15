package universitystudy;

public class Stringdemo {
    public static void main(String[] args) {
        String firstname = "Cristiano";
        String lastname = "Averio";
        System.out.println(firstname + " " + lastname);
        System.out.println(firstname.toUpperCase() + " " + lastname.toUpperCase());
        String fullname = firstname + lastname;
        System.out.println(fullname.length());
        System.out.println(fullname.toUpperCase());
        System.out.println(fullname.charAt(6));
        System.out.println(fullname.indexOf("C"));
    }

}
