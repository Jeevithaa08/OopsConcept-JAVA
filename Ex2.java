package Day3Project;
import java.util.*;
class Book{
	int bookId;
	String author;
	String title;
	double price;
	Book(int bookId, String title, String author, double price)
	{
		this.bookId=bookId;
		this.author=author;
		this.title=title;
		this.price=price;
	}
	void display() {
		System.out.println("The bookId :"+bookId);
		System.out.println("The title :"+title);
		System.out.println("The author :"+author);
		System.out.println("The price :"+price);
	}
}
public class Ex2 {
	public static void main(String[] args) {
		Book b1 = new Book(3,"Java","Unknown",33);
		b1.display();
	}
}
