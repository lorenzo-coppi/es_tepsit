package some;



import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import junit.framework.TestCase;
import pack.Book;

public class BookTest extends TestCase {
	public void testGet() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/api").path("books").path("1");
		Response response = target.request().get();
		System.out.println("Response code: " + response.getStatus());
		Book book = response.readEntity(Book.class);
		System.out.println("Title: " +  (String)(book.getTitle()));
	}
	
	public void testAdd() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/api").path("books");
		Book book = new Book();
		book.setId(2);
		book.setTitle("Test");
		book.setLanguage("english");
		Response response = target.request().post(Entity.entity(book, MediaType.APPLICATION_JSON));
		System.out.println("Response code: " + response.getStatus());
	}
}