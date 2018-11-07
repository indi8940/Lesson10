package Searching;

public class StringReview {

    public static void main(String[] args) {
        String x = "the quick brown fox";
        //          0123456789012345678

        //indexOf -> Returns an int, start location of something
        int loc = x.indexOf("q");
        System.out.println("q is at location " + loc);

        loc = x.indexOf("o", 13); //start viewing at 13
        System.out.println("starting at 13 the next 'o' is at " + loc);

        loc = x.indexOf("q", 5); //Will return -1 = not found
        System.out.println("starting at 5, the next 'q' is at " + loc);

        //charAt -> returns a char
        char c = x.charAt(13); //letter w
        System.out.println("The letter at position '13' is " + c);

        //length -> returns int
        int len = x.length(); //19
        System.out.println(x + " is " + len + " letters long");

        //substring -> returns String, requires 1 or mor ints
        String y = x.substring(10, 13); // 13 not included ;)... = bro
        System.out.println("Hey " + y);
        y = x.substring(16); //16 to end
        System.out.println("Crazy like a " + y);// fox

        //toLower and Uppercase
        //Original string does not change
        System.out.println(x.toUpperCase());

        x = x.toLowerCase(); //re-assigning x to all lowercase
        //compareTo ->
        y = "jumped over the lazy dog.";
        int z = x.compareTo(y);
        System.out.println("y vs x = " + z);
        //compareTo does letter math
        //calculates the alphabetical distance between first letter of each string
        //"t" vs 'j' - > 10 letters apart in alphabet
        //positive means First things further down the list

        //More Examples:
        System.out.print("Andy Vs Bob\t");
        System.out.println("Andy".compareTo("Bob")); //-1

        System.out.print("Bob Vs Bob\t");
        System.out.println("Bob".compareTo("Bob")); //0

        System.out.print("Dave Vs Bob\t");
        System.out.println("Dave".compareTo("Bob")); //2

        System.out.print("Bib Vs Bob\t");
        System.out.println("Bib".compareTo("Bob")); //6
        
        //compareTo = 0 = exact match (This is good!!!)
        
        System.out.println("Thats all folks");
    }

}
