package org.launchcode.studio7;

public abstract class BaseDisc {
    private String title;
    private String author;
    private int storageCapacity;

    public BaseDisc(String title, String author, int storageCapacity) {
        this.title = title;
        this.author = author;
        this.storageCapacity = storageCapacity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Storage capacity: " + storageCapacity);
    }
}

