package com.Foodcourt.fc.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "dishName")
    private String dishName;

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private int price;

    @Column(name = "availability")
    private String availability;

    @ManyToOne
    @JsonBackReference
    private Menu menu;

    public Items(){

    }

    public Items(String dishName, String imageUrl, String category, int price, String availability, Menu menu) {
        this.dishName = dishName;
        this.imageUrl = imageUrl;
        this.category = category;
        this.price = price;
        this.availability = availability;
        this.menu = menu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
