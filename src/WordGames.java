//Create a class called WordGames that has two methods:
//addHelloWord method that takes one parameter as input called word and
// returns the String Hello [wordHere]
//getFullName method that takes two parameters as input called name and
// surname and returns their concatenation

/**
 * The type Word games.
 */
public class WordGames {
    /**
     * Add hello word string.
     *
     * @param word the word
     * @return the string
     */
    public String addHelloWord(String word){
        return "Hello" + word;

    }

    /**
     * Get full names string.
     *
     * @param name    the name
     * @param surname the surname
     * @return the string
     */
    public String getFullNames(String name, String surname){
        return name + "" + surname;


    }
}
