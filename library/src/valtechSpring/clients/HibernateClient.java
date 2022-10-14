package valtechSpring.clients;



import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


import valtechSpring.orm.Address;
import valtechSpring.orm.Article;
import valtechSpring.orm.Author;
import valtechSpring.orm.Blog;
import valtechSpring.orm.Book;

import valtechSpring.orm.HandBook;
import valtechSpring.orm.Publisher;




public class HibernateClient {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf=new AnnotationConfiguration()
				.configure()
			
				.addAnnotatedClass(Address.class)
				.addAnnotatedClass(Article.class)
				.addAnnotatedClass(Author.class).addAnnotatedClass(Blog.class)
				.addAnnotatedClass(Book.class).addAnnotatedClass(HandBook.class)
				.addAnnotatedClass(Publisher.class)
				.buildSessionFactory();
		
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		
		
		
		//ONE TO ONE
		
		//Author c=new Author("Akshay","123456789");
		
	Author c=new Author("Author2","123456789");
//		
//		//Book b=new Book("book1",new Date());
	Address a=new Address("mandya2","Blr","Kar",56078);
		ses.saveOrUpdate(c);
		ses.saveOrUpdate(a);
		a.setAuthor(c);
		c.setAddress(a);
		
		
//		
		
		
		
		
		//ONE-MANY
		
		
		
//		Publisher c1=new Publisher("Publisher3", "987654321");
//		Publisher c2=new Publisher("Publisher4", "987654321");
//		
//		Author a1=new Author("Akshay","123456789");
//		
//		Author a2=new Author("Author2","123456789");
//		
//		
//		
//		ses.saveOrUpdate(a1);
//		ses.saveOrUpdate(a2);
//		
//		ses.save(new Book("book1",new Date()));
//		ses.save(new Article("book1","https://book1.html"));
//		ses.save(new Blog("book1","https://blog.book1.html",12));
//		ses.save(new HandBook("book1","12345678",120,new Date(),4));
//	
//		
//		List<Book> txs=ses.createQuery("SELECT book From Book book").list();
//		for(Book t:txs){
//			//ternary operator boolCond ? true:false
//			t.setPublisher(t.getId()/1==t.getId() ? c1:c2);
//			
//			//t.setAuthor(t.getId()/1==t.getId() ? a1:a2);
//			System.out.println(t);
//		}
//		
		
		
//		Publisher p=new Publisher("Publisher3", "987654321");
//		Address a1=new Address("manday","Blr","Kar",56078);
//		ses.saveOrUpdate(p);
//		ses.saveOrUpdate(a1);
//		a1.setPublisher(p);
//		p.setAddress(a1);
		
		
		
		
		
		
		
		
		
		
//		Author c=new Author("Akshay","123456789");
//		
//		Book b=new Book("book2",new Date());
//		Article a=new Article("book1","https://book1.html");
//		
//		ses.saveOrUpdate(c);
//		ses.saveOrUpdate(b);
//		ses.saveOrUpdate(a);
		
		//b.setAuthor(c);
		
		
		
		
//		a1.setPublisher(p);
//		p.setAddress(a1);
		
		
		//MANY TO MANY
		
		Author c=new Author("Akshay","123456789");
		Address a=new Address("JP Nagar","Blr","Kar",56078);
		ses.saveOrUpdate(c);
		ses.saveOrUpdate(a);
		c.setAddress(a);
	
		Author au1=(Author)ses.load(Author.class, 140);
		
		Book ac=new Book("book2",new Date());
		Book ac1=new Book("book2",new Date());
		ses.saveOrUpdate(ac);
		ses.saveOrUpdate(ac1);
		
		
		Book ac2=(Book)ses.load(Book.class, 160);
		Book ac3=(Book)ses.load(Book.class, 161);
		c.addBook(ac);
		c.addBook(ac3);
		c.addBook(ac2);
	
		au1.addBook(ac3);
		au1.addBook(ac1);
		
		
		
	
		
		tx.commit();
		ses.close();
		
	}

}
