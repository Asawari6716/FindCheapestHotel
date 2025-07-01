package main;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReservationSystem {
    private final List<Hotel> hotels;

    public ReservationSystem(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Hotel findCheapestHotel() {

        Hotel hotel = hotels.stream().sorted(Comparator.comparingDouble(Hotel::getRate)).findFirst().get();
//        System.out.println("Cheapest Hotel: "+hotel);
        return hotel;
    }


    public Hotel  findCheapestHotelUsingComparator() {
        Hotel cheapestHotel = hotels.stream()
                .sorted(new PriceComparator())
                .findFirst().get();

//        System.out.println("Cheapest hotel: "+cheapestHotel);
        return cheapestHotel;
    }


    public Set<Hotel> findListOfCheapestHotel() {
        TreeMap<Double, Set<Hotel>> map = hotels.stream()
                .collect(Collectors.groupingBy(Hotel::getRate, TreeMap::new, Collectors.toSet()));

//        System.out.println(map.firstEntry().getValue());
        return map.firstEntry().getValue();
    }
}
