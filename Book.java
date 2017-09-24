/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Olive Tamondong)
 * @version (09/24/2017)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    
    // satisfies 2.85
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        
        //satisfies 2.85
        pages = 1; 
    }

    //This satisfies requirement 2.83
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    // satisfies 2.85
    public int getPages()
    {
        return pages;
    }
    
    //This satisfies requirement 2.84
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
    
    //satisfies requirement 2.87
    public void printDetails()
    {
        System.out.println("Title: " + title + 
                           "\nAuthor: " + author +
                           "\nPages: " + pages );
    }
}
