package com.kabaso.datastructures;

public class Book {
    private String title;
    private int isdn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIsdn() {
        return isdn;
    }

    public void setIsdn(int isdn) {
        this.isdn = isdn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return isdn == book.isdn;
    }

    @Override
    public int hashCode() {
        return isdn;
    }
}
