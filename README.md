# jSheehan.assignment1
Auto correct search Interrface Brute Force version:

<h3>INTERFACE</h3>
  The program implements an interface BruteForceInterface which a series of methods to be implemented in the 
BruteForce class.

<h3>CLASS</h3>
  The application allows the user to input a String and uses that input to complete a series of operations
which can be choosen by the user via a menu system. The options operate on a file database.txt constructing
a series of Maps or lists depending on the users choice. The HashMaps constructed use the String Terms within
the txt file as the Maps key and double(Weight) as the Maps value.

  Options 1, 2 and 3 ask the user to  input a String and then searches for all entries in the HashMap map that
start with the string provided and perform the following operation.</br>

  1)  Top Match:</br>
        Returns only the entry that starts with the input and has the highest weight.</br></br>
  2)  All Matches:</br>
        Returns all entries that start with the input.</br></br>
  3)  k Matches:</br>
        Allows the user to choose how many mathces are returned to the user.</br>
        </br>
  Two more options can be performed.</br>
  </br>
  4)  Weight of Term:</br>
        Searches for any String that matches the users input and if a match is found outputs the corresponding weight.</br></br>
  5)  Add Term:</br>
        Allows the user to input a term and a corresponding entry and adds to the map as an entry.</br></br>

<h3>TEST</h3>
  Tests a series of methods from the BruteForce class.</br></br>
  
  1)  testGetSubstringList():</br>
        Ensure that the getSubStringList() and hence the addEntry() method
        functions correctly by adding an entry "kryptonite" with weight "10.0"
        and then searching for a match for "kryptonite" and ensuring there is
        a result.</br></br>
  2)  testBruteForce():</br>
        Ensures that the BruteForce constructs a bruteForce object which
        is not null.</br></br>
  3)  testWeightOf():</br>
         Ensures the weightOf() method operates correctly by adding an entry
         and testing that the result of entering this entries term into the
         weightOf() method returns the. </br></br>
  4)  testBestMatch():</br>
         Ensures that the bestMatch() method works correctly in this case using
         the String with the highest weight overall "the" and ensuring that all
         substrings e.g. "t" will return "the" as.
   
  







