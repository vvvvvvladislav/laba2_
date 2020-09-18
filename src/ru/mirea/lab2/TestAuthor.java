package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Ioann Ioannov", "ioann1980@yandex.ru", 'm');
        System.out.println(a);
        a.setEmail("ioann80@ya.ru");
        System.out.println(a);
    }
}