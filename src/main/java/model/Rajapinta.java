package model;

import java.net.URI;
import java.net.http.HttpResponse;
import java.time.Duration;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Rajapinta {

	private static Json Data = null;
	private static Kirjatiedot kirjatiedot;

	public static void yhteys(String isbn) {

		java.net.http.HttpClient client = java.net.http.HttpClient.newHttpClient();
		java.net.http.HttpRequest request = java.net.http.HttpRequest.newBuilder()
				.uri(URI.create("https://openlibrary.org/search.json?q=" + isbn
						+ "&fields=isbn+title+author_name+publisher+cover_i+first_publish_year+number_of_pages_median,availability&limit=1"))
				.timeout(Duration.ofMinutes(1)).header("Content-Type", "application/JSON").GET().build();
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)
				.thenAccept(Rajapinta::parse).join();
	}

	public static void parse(String responseBody) {

		System.out.println(responseBody);
		JsonParser parser = new JsonParser();
		JsonElement e = parser.parse(responseBody);
		Gson gson = new Gson();
		Data = gson.fromJson(e, Json.class);
		System.out.println(Data.docs.get(0).isbn.get(0));

		long isbn = Long.parseLong(Data.docs.get(0).isbn.get(0));
		String nimi = Data.docs.get(0).title;
		String kustantaja = Data.docs.get(0).publisher.get(0);
		String kirjoittajat = Data.docs.get(0).author_name.get(0);
		String kuva = Data.docs.get(0).cover_i;
		int julkaisuvuosi = Data.docs.get(0).first_publish_year;
		int sivumäärä = Data.docs.get(0).number_of_pages_median;

		kirjatiedot = new Kirjatiedot(isbn, nimi, kustantaja, kirjoittajat, kuva, julkaisuvuosi, sivumäärä);

	}

	public static Json getData() {
		return Data;
	}

	public static void setData(Json data) {
		Data = data;
	}

	public static Kirjatiedot getKirjatiedot() {
		return kirjatiedot;
	}

	public static void setKirjatiedot(Kirjatiedot kirjatiedot) {
		Rajapinta.kirjatiedot = kirjatiedot;
	}

}
