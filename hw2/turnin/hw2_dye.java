/**
 * A utility class for the avid Christopher Walken aficionado.
 *
 * "Two little mice fell in a bucket of cream."
 */
public class ChristopherWalkenQuotes {
	
	// internal datastructure
	private Collection<String> quotes = new ArrayList<String>();
	
	public ChristopherWalkenQuotes(Collection<String> collection) {
		quotes.addAll(collection);
	}
	
	public void add(String quote) {
		quotes.add(quote);
		// TODO enforce uniqueness internally
	}
	
	public boolean remove(Object obj) {
		boolean found = false;
		while (remove(obj)) {
			found = true;
		}
		return found;
	}
	
	// returns a collection of quotes in ChristopherWalkenQuotes
	public Collection<String> contained() {
		ArrayList<String> retval = new ArrayList<String>();
		
		for (String quote : quotes) {
			if (!retval.contains(quote)) {
				retval.add(quote);
			}
		}
		
		return retval;
	}
	
}