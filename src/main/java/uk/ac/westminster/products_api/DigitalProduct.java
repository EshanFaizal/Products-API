package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {

    private double fileSizeMb;
    private String downloadUrl;

    // Default No-Arg Constructor (Required by Jackson for JSON deserialization)
    public DigitalProduct() {
        super();
    }

    // Parameterized Constructor
    public DigitalProduct(Long id, String name, double price, double fileSizeMb, String downloadUrl) {
        super(id, name, price); // Pass base fields to the parent Product constructor
        this.fileSizeMb = fileSizeMb;
        this.downloadUrl = downloadUrl;
    }

    // Getters and Setters for subclass-specific fields
    public double getFileSizeMb() {
        return fileSizeMb;
    }

    public void setFileSizeMb(double fileSizeMb) {
        this.fileSizeMb = fileSizeMb;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}


