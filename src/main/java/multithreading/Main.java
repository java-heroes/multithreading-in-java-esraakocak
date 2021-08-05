package multithreading;

public class Main {
	
	  public static void main( String[] args )
	    {
		 Book book = new Book("number of books ");
		 Thread thread = new Thread(book);
		 thread.start();
		 
		 
	    }

}
