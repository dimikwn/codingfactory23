package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings.
 */
public class ConcatApp {

    public static void main(String[] args) {
        String title = "Dr";
        String firstname = "Athan.";
        String lastname = "Androutsos";
        String fullName;
        String titledFullname;

        fullName = title + firstname + lastname;
        titledFullname = title.concat(firstname).concat(lastname);

        System.out.println(fullName);
        System.out.println(titledFullname);
    }
}
