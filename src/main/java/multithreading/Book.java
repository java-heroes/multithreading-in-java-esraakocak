package multithreading;

public class Book implements Runnable{

	 private String bookName;
	 public Book (String bookName) {
		 this.bookName=bookName;	 
	 }  
	public void run() {
		System.out.println("Runnable "+this.bookName+" "+" running");	
		
			try {
				for(int i = 0; i<100;i++) {
				System.out.println(this.bookName+ "   :  " +i);
				Thread.sleep(1000);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(this.bookName+"error encountered");
				
			}
			System.out.println(bookName+"transaction terminated");
			
		}
	}

