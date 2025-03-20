package pack;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class JsonHandler {

	public void store(Book book) {
		Gson gson = new Gson();
		
		String s = "\\Users\\admin\\Desktop\\excercises java\\Hello_Rest\\src\\main\\json-storage\\" 
		+ book.getId();
		
		try {
			FileWriter writer = new FileWriter(s);
			
			gson.toJson(book, writer);
			
			writer.flush();
			writer.close();
		} catch (JsonIOException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
