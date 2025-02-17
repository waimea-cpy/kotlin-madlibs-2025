/**
 * Kotlin Story Maker (MadLibs)
 */

fun main() {
    println("Story Maker 3000")
    println("------------------------------------")
    println()

    val name1    = getString("Please enter a person's NAME: ")
    val pronoun1 = getString("Is that person a 'he' or a 'she'? ")
    val name2    = getString("Please enter another person's NAME: ")
    val pronoun2 = getString("Is that person a 'he' or a 'she'? ")

    val verb1    = getString("Please enter a VERB ending in 'ing': ")
    val verb2    = getString("Please enter a VERB ending in 'ed': ")
    val verb3    = getString("Please enter another VERB ending in 'ing': ")

    val noun1    = getString("Please enter the name of an OBJECT: ")
    val noun2    = getString("Please enter a type of ANIMAL: ")

    println()
    println("ok, here is your story...")
    println()

    println("$name1 was walking down the road, when $pronoun1 bumped into")
    println("$name2 who was $verb1 a $noun1.")

}


/**
 * Get a string from the user
 *
 * parameters:
 *   - prompt - Text to show the user
 * returns:
 *   - String that the user types
 */
fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}