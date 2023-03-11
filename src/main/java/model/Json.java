package model;

import java.util.List;

public class Json {

	String numFound;
	String start;
	String numFoundExact;
	List<Docs> docs;

	public class Docs {

		List<String> isbn;
		String title;
		List<String> publisher;
		List<String> author_name;
		String cover_i;
		int first_publish_year;
		int number_of_pages_median;

	}

}
