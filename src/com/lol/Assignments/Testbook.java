package com.lol.Assignments;

class Testbook{
    public static void main(String[] args){
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 20);
        ReferenceBook refBook1 = new ReferenceBook("Encyclopedia Britannica", "Britannica Editors", 10);

        System.out.println("Book: " + book1.title + ", Author: " + book1.author + ", Days Taken: " + book1.daysTaken);
        System.out.println("Days Overdue: " + book1.daysOverdue());
        System.out.println("Is Overdue: " + book1.isOverdue());
        System.out.println("Fine: Rs" + book1.computeFine());

        System.out.println();

        System.out.println("Reference Book: " + refBook1.title + ", Author: " + refBook1.author + ", Days Taken: " + refBook1.daysTaken);
        System.out.println("Days Overdue: " + refBook1.daysOverdue());
        System.out.println("Is Overdue: " + refBook1.isOverdue());
        System.out.println("Fine: Rs" + refBook1.computeFine());

        System.out.println();
    }
}