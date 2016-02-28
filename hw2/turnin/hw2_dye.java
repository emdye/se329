/**
 * A utility class for the avid Christopher Walken aficionado.
 *
 * "Two little mice fell in a bucket of cream."
 */
public class ChristopherWalkenQuotes {
	
	// internal datastructure
	private Collection<Quote> quotes = new HashSet<Quote>();
	
	public ChristopherWalkenQuotes(Collection<Quote> collection) {
		quotes.addAll(collection);
	}
	
	public void add(Quote quote) {
		quotes.add(quote);
	}
	
	public boolean remove(Object obj) {
		return quotes.remove(obj);
	}
	
	// returns a collection of quotes in ChristopherWalkenQuotes
	public Collection<Quote> contained() {
		return new HashSet<Quote>(quotes);
	}
	
	public class Quote {
		public String theQuote;
		public Quote(String s) {
			this.theQuote = s;
		}
	}
	
}