package book;

public class Book {
	String bookTitle, author; // fields or states
	String isbn;

	private static int isbnGen;
	double finalPrice;
	double originalPrice;
	byte year = 0000;

	public double getDiscount(int discount) {
		double discCal = originalPrice - (originalPrice * (discount / 100));
		finalPrice = discCal;
		return finalPrice;
	}

	public double getDiscount(String niNumber) {
		double discCal = originalPrice - 1.10; // fixed discount
		finalPrice = discCal;
		return finalPrice;
	}

	public String toString() {
		String result = "BookTitle: " + bookTitle + "\t isbn: " + isbn + "\n";
		System.out.println(result);
		return result;
	}

	// Default Constructor
	public Book() {
		this("Untitled", "No Author", Integer.toString(isbnGen++));

	}

	// Overloading
	// Shadowing
	public Book(String bookTitle, String author) {// Params
		this.bookTitle = bookTitle; // keyword this
		this.author = author; // shadowing
	}

	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/**
	 * @param bookTitle
	 *            the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(String isbn) {

		this.isbn = isbn;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the finalPrice
	 */
	public double getFinalPrice() {
		return finalPrice;
	}

	/**
	 * @param finalPrice
	 *            the finalPrice to set
	 */
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Book(String bookTitle, String author, String isbn) {// Params
		this.bookTitle = bookTitle; // keyword this
		this.author = author; // shadowing
		this.isbn = isbn;
		toString();
	}
}
