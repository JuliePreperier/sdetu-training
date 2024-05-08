package basics;

public class TestString {
    public static void main(String[]args){
        String bookTitle = "The lord of the Rings";
        String wordChoice = "Rings";

        if (bookTitle.contains(wordChoice)){
            System.out.println("the book contains the word: "+wordChoice);
        }

        String browser = "Chrome";
        if (browser.equalsIgnoreCase("chrome")){
            System.out.println("The browser is chrome");
        }

        String firstName= "Tim";
        String lastName= "Short";
        String ssn ="9874561236";

        System.out.println(firstName.substring(0,1));
        System.out.println(lastName.substring(0,1));
        System.out.println(ssn.substring(5));
    }
}
