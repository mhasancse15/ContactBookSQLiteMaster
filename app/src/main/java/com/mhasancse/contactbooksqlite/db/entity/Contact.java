package com.mhasancse.contactbooksqlite.db.entity;

public class Contact {

    public static final String TABLE_NAME = "contacts";

    public static final String COLUMN_ID = "contact_id";
    public static final String COLUMN_NAME = "contact_name";
    public static final String COLUMN_EMAIL = "contact_email";

    private String name;
    private String email;
    private long id;


    public Contact() {
    }

    public Contact(long id, String name, String email) {

        this.name = name;
        this.email = email;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_EMAIL + " DATETIME DEFAULT CURRENT_TIMESTAMP"
                    + ")";
}
