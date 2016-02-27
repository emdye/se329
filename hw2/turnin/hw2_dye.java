/**
 * A utility class for the avid Christopher Walken aficionado.
 *
 * "Two little mice fell in a bucket of cream."
 */
public class ChristopherWalkenQuotes {
	
	// internal datastructure
	private Collection<String> quotes = new HashSet<String>();
	
	public ChristopherWalkenQuotes(Collection<String> collection) {
		quotes.addAll(collection);
	}
	
	public void add(String quote) {
		quotes.add(quote);
	}
	
	public boolean remove(Object obj) {
		return quotes.remove(obj);
	}
	
	// returns a collection of quotes in ChristopherWalkenQuotes
	public Collection<String> contained() {
		return new HashSet<Quote>(quotes);
	}
	
}