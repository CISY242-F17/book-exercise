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
    
    // satisfies 2.88
    private String refNumber;
    
    // satisfies 2.91
    private int borrowed;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String bookRefNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        
        //satisfies 2.85
        pages = 1; 
        
        //satisfies 2.88
        refNumber = ""; 
        
        // satisfies 2.91
        borrowed = 0;
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
    
    //satisfies requirement 2.88 and 2.90
    //Ask professor if this is right
    public void setRefNumber(String ref)
    {
       if(ref.length() >= 3)
       {
           refNumber = ref;
       }
       else
       {
           System.out.println("Error: Reference Number should be " + 
                               "at least 3 characters");
       }
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    //satisfies requirement 2.91
    public void borrow()
    {
        borrowed++ ;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
   
    
    
    
    //satisfies requirement 2.87
    public void printDetails()
    {
        System.out.println("Title: " + title + 
                           "\nAuthor: " + author +
                           "\nPages: " + pages );
        
        //satisfies requirement 2.89
        if(refNumber.length() == 0)
        {
            System.out.println("Reference Number: ZZZ");
        }
        else
        {
            System.out.println("Reference Number: " + refNumber);
        }
        
        //satisfies requirement 2.91
        System.out.println("Borrowed: " + borrowed);
    }
}
