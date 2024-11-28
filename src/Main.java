public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Остен", "Джейн");
        Author author2 = new Author("Стивен ", "Кинг");
        Book book1 = new Book("Гордость и предубеждение", author1, 1813);
        Book book2 = new Book("Сияние", author2, 1977);

        book1.setPublicationYear(2022);
    }
}