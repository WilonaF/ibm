package com.ibm.lib;

public class Book {

	private String title;
	private Member mbr;

	public String getTitle() {
		return title;
	}

	public Book(String title) {
		this.title = title;
	}
	
	public void status() {
		if(mbr == null) {
			System.out.println(title+" is not issued to any member");
		}
		else
			System.out.println(title+" is issued to "+ mbr.getName());
	}
	
	public void issueBook(Member m) {
		if(mbr != null)
			System.out.println(title+" is already issued");
		else if(m.getBook()!=null)
			System.out.println(m.getName()+" has already issued a book");
		else {
			this.mbr = m;
			m.setBook(this);
			System.out.println("Book issued");
		}
	}
	
	public void returnBook(Member m) {
		if(mbr==null)
			System.out.println(title+" is not issued to anyone");
		else if(m.getBook() == null)
			System.out.println(m.getName()+" has never issued a book");
		else if(!m.getBook().getTitle().equals(title))
			System.out.println(m.getName()+" has not issued "+title);
		else if(!m.getName().equals(mbr.getName()))
			System.out.println(title+" was not issued to "+m.getName());
		else {
			this.mbr = null;
			m.setBook(null);
			System.out.println("Book returned");
		}
	}
}
