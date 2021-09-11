package com.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;

public class HotelReservation {

    public List<Hotels> list;

    public HotelReservation() {
        this.list = new ArrayList<>();
    }

    public boolean add(Hotels hotel) {
        return list.add(hotel);
    }
}
