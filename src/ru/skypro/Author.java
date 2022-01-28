package ru.skypro;

import java.util.Objects;

public class Author {
    private final String nameAuthor;
    private final String lastname;

    public Author(String nameAuthor, String lastname) {
        this.nameAuthor = nameAuthor;
        this.lastname = lastname;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(lastname, author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, lastname);
    }
}
