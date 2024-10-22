//Create a class called WordGames that has two methods:
//addHelloWord method that takes one parameter as input called word and
// returns the String Hello [wordHere]
//getFullName method that takes two parameters as input called name and
// surname and returns their concatenation
//create a class called Tester that has the main method where you:
//create a new WordGames object
//print in console the result of the addHelloWord method invocation
//print in console the result of the getFullName method invocation
//add Javadoc comments to:
//the 2 classes with a short description and the author
//the 3 methods with a short description, the parameters and the return


/**
 * The tester class helps to run the programme.
 */
public class Tester {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        WordGames wg = new WordGames();

        String helloword = wg.addHelloWord(" How are you");
        System.out.println(helloword);

        String fullnames = wg.getFullNames("Mundes", "Daniel");
        System.out.println(fullnames);
    }
}