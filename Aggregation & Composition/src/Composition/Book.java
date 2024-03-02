package Composition;

public class Book {
	String author;
	Page p = new Page("Java");
	Book(String author)
	{
		this.author = author;
	}
	void readBook() 
	{
		System.out.println("Reading Book by author "+author);
	}
}
