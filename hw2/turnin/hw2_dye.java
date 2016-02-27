/**
 * A utility class for the avid Christopher Walken aficionado.
 *
 * "Two little mice fell in a bucket of cream."
 */
public class ChristopherWalkenQuotes {
	
	// internal datastructure
	private Collection<Quote> quotes = new ArrayList<Quote>();
	
	public ChristopherWalkenQuotes(Collection<Quote> collection) {
		quotes.addAll(collection);
	}
	
	public void add(Quote quote) {
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
	public Collection<Quote> contained() {
		ArrayList<Quote> retval = new ArrayList<Quote>();
		
		for (Quote quote : quotes) {
			if (!retval.contains(quote)) {
				retval.add(quote);
			}
		}
		
		return retval;
	}
	
	public class Quote {
		public String theQuote;
		public Quote(String s) {
			this.theQuote = s;
		}
	}
	
}