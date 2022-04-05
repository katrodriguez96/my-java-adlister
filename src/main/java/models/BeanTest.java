package models;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album testAlbum = new Album();
        testAlbum.setArtist("Lemon Demon");
        testAlbum.setName("Spirit Phone");
        System.out.println("testAlbum.getArtist() = " + testAlbum.getArtist());
        System.out.println("testAlbum.getName() = " + testAlbum.getName());

        Author billShake = new Author();
        billShake.setId(1);
        billShake.setFirstName("William");
        billShake.setLastName("Shakespeare");

        Author churchill = new Author();
        churchill.setId(2);
        churchill.setFirstName("Winston");
        churchill.setLastName("Churchill");

        Author wilde = new Author();
        wilde.setId(3);
        wilde.setFirstName("Oscar");
        wilde.setLastName("Wilde");

        Quote quote1 = new Quote();
        quote1.setId(1);
        quote1.setAuthorId(wilde.getId());
        quote1.setContent("The truth is rarely pure and never simple.");

        Quote quote2 = new Quote();
        quote2.setId(2);
        quote2.setAuthorId(billShake.getId());
        quote2.setContent("If music be the food of love, play on.");

        Quote quote3 = new Quote();
        quote3.setId(3);
        quote3.setAuthorId(churchill.getId());
        quote3.setContent("If you're going through hell, keep going.");

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);

        ArrayList<Author> authors = new ArrayList<>();
        authors.add(billShake);
        authors.add(wilde);
        authors.add(churchill);

        for (Quote quote : quotes) {
            String authorName;
            for (Author author : authors) {
                if (quote.getAuthorId() == author.getId()) {
                    authorName = author.getFirstName() + " " + author.getLastName();
                    System.out.printf("\"%s\" - %s\n", quote.getContent(), authorName);
                }
            }
        }
    }
}
