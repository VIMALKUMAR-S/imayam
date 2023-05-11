package com.Foodcourt.fc.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BestSellingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Column
    private int itemId;

    @Column
    private int count;

    public BestSellingItem(int itemId, int count) {
        this.itemId = itemId;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
