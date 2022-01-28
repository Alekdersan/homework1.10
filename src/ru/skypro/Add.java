package ru.skypro;

public class Add {

    public static void main(String[] args) {
        Author authorFairy = new Author("Александр", "Пушкин");
        Book bookFairy = new Book("Сказки", authorFairy, 1835);
        Author authorHistory = new Author("Семён", "Федосеев");
        Book bookHistory = new Book("Пехота в бою", authorHistory, 2009);

        System.out.println("book.titleOfTheBook = " + bookFairy.getTitleOfTheBook());
        System.out.println("book.getAuthor() = " + bookFairy.getAuthor().getNameAuthor() + " " + bookFairy.getAuthor().getLastname());
        System.out.println("book.getYearOfPublication() = " + bookFairy.getYearOfPublication());

        System.out.println("bookHistory.getTitleOfTheBook() = " + bookHistory.getTitleOfTheBook());
        System.out.println("bookHistory.getAuthor() = " + bookHistory.getAuthor().getNameAuthor() + " " + bookHistory.getAuthor().getLastname());
        System.out.println("bookHistory.getYearOfPublication() = " + bookHistory.getYearOfPublication());

        System.out.println("book.toString() = " + bookFairy.toString());
        System.out.println("authorFairy.toString() = " + authorFairy.toString());

        System.out.println("bookHistory.toString() = " + bookHistory.toString());
        System.out.println("authorHistory.toString() = " + authorHistory.toString());

        System.out.println("authorFairy.equals(authorHistory) = " + authorFairy.equals(authorHistory));
        System.out.println("bookFairy.equals(bookHistory) = " + bookFairy.equals(bookHistory));
    }
}
