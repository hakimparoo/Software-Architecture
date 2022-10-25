package creational;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private BOOKS jsonBooks;
    private List<JSONBook> books;

    public JSONBookMetadataFormatter() {
        books = new ArrayList<>();
    }


    @Override
    public BookMetadataFormatter reset() {
        books.clear();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONBook book = new JSONBook();
        book.setISBN(b.getISBN());
        book.setTitle(b.getTitle());
        book.setPublisher(b.getPublisher());
        book.setAuthors(List.of(b.getAuthors()));
        books.add(book);
        return this;
    }

    @Override
    public String getMetadataString() {

        jsonBooks = new BOOKS();
        jsonBooks.setBooks(books);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonBooks);
        return json;
    }
}

class BOOKS {
    private List<JSONBook> books;

    public void setBooks(List<JSONBook> books) {
        this.books = books;
    }
}

class JSONBook {
    private String ISBN;
    private String Title;
    private String Publisher;
    private List<String> Authors = new ArrayList<>();

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        this.Publisher = publisher;
    }

    public List<String> getAuthors() {
        return Authors;
    }

    public void setAuthors(List<String> authors) {
        this.Authors = authors;
    }
}