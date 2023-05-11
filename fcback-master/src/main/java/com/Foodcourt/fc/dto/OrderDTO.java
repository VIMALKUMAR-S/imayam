package com.Foodcourt.fc.dto;

import java.util.List;

public class OrderDTO {
    private List<CountDto> items;

    public List<CountDto> getItems() {
        return items;
    }

    public void setItems(List<CountDto> items) {
        this.items = items;
    }
}
