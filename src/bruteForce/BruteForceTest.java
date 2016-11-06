package bruteForce;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class BruteForceTest {
	/*
	 * Ensure that the getSubStringList() and hence the addEntry() method
	 * functions correctly by adding an entry "kryptonite" with weight "10.0"
	 * and then searching for a match for "kryptonite" and ensuring there is
	 * a result.
	 */
	@Test
	public void testGetSubstringList() throws Exception {
		BruteForceInterface bruteForce;
		String s = "kryptonite";
		Double t = 10.0;
		bruteForce = new BruteForce();
		
		bruteForce.addEntry(s,t);
		
		List<String> resultList = bruteForce.getSubstringList(s);

		// check that the search returned some result(i.e. there is a match
		// in the list)
		assertTrue(resultList.size() > 0);
	}
	
	/*
	 * Ensures that the BruteForce constructs a bruteForce object which
	 *  is not null.
	 */
	@Test
	public void testBruteForce() throws Exception {
		BruteForceInterface bruteForce;

		bruteForce = new BruteForce();
		assertNotNull(bruteForce);

	}
	
	/*
	 * Ensures the weightOf() method operates correctly by adding an entry
	 * and testing that the result of entering this entries term into the
	 * weightOf() method returns the Double t.
	 */
	@Test
	public void testWeightOf() throws Exception {
		BruteForceInterface bruteForce;
		String s = "kryptonite";
		Double t = 10.0;
		bruteForce = new BruteForce();
		
		bruteForce.addEntry(s,t);
		
		double results = bruteForce.weightOf(s);

		// check that the search returned some result(i.e. there is a match
		// in the list)
		assertTrue(results==10.0);
	}
	
	/*
	 * Ensures that the bestMatch() method works correctly in this case using
	 * the String with the highest weight overall "the" and ensuring that all
	 * substrings e.g. "t" will return "the" as best match.
	 */
	@Test
	public void testBestMatch() throws Exception {
		BruteForceInterface bruteForce;
		String s = "t";
		bruteForce = new BruteForce();
		
		
		String bestMatch = bruteForce.bestMatch(s);

		// check that the search returned some result(i.e. there is a match
		// in the list)
		assertTrue(bestMatch.equals("the"));
	}
}
