public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    Book() {

    }

    Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString() {
        return "Название " + title + " Дата публикации" + publicationYear + " Автор" + author.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Book book) {
        return book.title == this.title &&
                this.publicationYear == book.publicationYear &&
                book.author.equals(this.author);
    }
}
