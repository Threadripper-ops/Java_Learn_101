package com.lol.Assignments;

abstract class Abook {
    protected String title;
    protected String author;
    protected int daysTaken;

    public Abook(String title, String author, int daysTaken) {
        this.title = title;
        this.author = author;
        this.daysTaken = daysTaken;
    }

    public abstract int daysOverdue();

    public abstract boolean isOverdue();

    public abstract double computeFine();
}

class Book extends Abook {
    private static final int MAX_DAYS = 14;
    private static final double FINE_PER_DAY = 0.5;

    public Book(String title, String author, int daysTaken) {
        super(title, author, daysTaken);
    }

    @Override
    public int daysOverdue() {
        return Math.max(0, daysTaken - MAX_DAYS);
    }

    @Override
    public boolean isOverdue() {
        return daysOverdue() > 0;
    }

    @Override
    public double computeFine() {
        return FINE_PER_DAY * daysOverdue();
    }
}

class ReferenceBook extends Abook {
    private static final int MAX_DAYS = 7;
    private static final double FINE_PER_DAY = 1.0;

    public ReferenceBook(String title, String author, int daysTaken) {
        super(title, author, daysTaken);
    }

    @Override
    public int daysOverdue() {
        return Math.max(0, daysTaken - MAX_DAYS);
    }

    @Override
    public boolean isOverdue() {
        return daysOverdue() > 0;
    }

    @Override
    public double computeFine() {
        return FINE_PER_DAY * daysOverdue();
    }
}

class AudioBook extends Abook {
    private static final int MAX_DAYS = 21;
    private static final double FINE_PER_DAY = 0.25;

    public AudioBook(String title, String author,int daysTaken){
        super(title,author,daysTaken);
    }

    @Override
    public int daysOverdue(){
        return Math.max(0,daysTaken-MAX_DAYS);
    }

    @Override
    public boolean isOverdue(){
        return daysOverdue()>0;
    }

    @Override
    public double computeFine(){
        return FINE_PER_DAY*daysOverdue();
    }
}