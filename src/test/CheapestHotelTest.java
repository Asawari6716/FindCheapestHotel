package test;

import main.Hotel;
import main.ReservationSystem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheapestHotelTest {

    @Test
    public void findCheapestHotel(){
        Hotel MiamiBeach = new Hotel(80, "Miami Beach");
        Hotel MiamiDowntown = new Hotel(120, "Miami Downtown");
        Hotel MiamiMidtown = new Hotel(100, "Miami Midtown");
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(MiamiDowntown);
        hotelList.add(MiamiBeach);
        hotelList.add(MiamiMidtown);
        ReservationSystem reservationSystem = new ReservationSystem(hotelList);

        System.out.println("---------Among three hotels:: findCheapestHotel---------");
        System.out.println("Hotel 1: "+MiamiBeach.getName()+"---"+MiamiBeach.getRate());
        System.out.println("Hotel 2: "+MiamiDowntown.getName()+"---"+MiamiDowntown.getRate());
        System.out.println("Hotel 3: "+MiamiMidtown.getName()+"---"+MiamiMidtown.getRate());


        Hotel cheapestHotel = reservationSystem.findCheapestHotel();
        System.out.println("Cheapest hotel is: "+cheapestHotel+"\n");
        assertEquals(MiamiBeach, cheapestHotel);
    }


    @Test
    public void findCheapestHotelUsingComparator(){
        Hotel MiamiBeach = new Hotel(80, "Miami Beach");
        Hotel MiamiDowntown = new Hotel(120, "Miami Downtown");
        Hotel MiamiMidtown = new Hotel(100, "Miami Midtown");
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(MiamiDowntown);
        hotelList.add(MiamiBeach);
        hotelList.add(MiamiMidtown);
        ReservationSystem reservationSystem = new ReservationSystem(hotelList);
        System.out.println("----Among three hotels: findCheapestHotelUsingComparator---------");

        System.out.println("Hotel 1: "+MiamiBeach.getName()+"---"+MiamiBeach.getRate());
        System.out.println("Hotel 2: "+MiamiDowntown.getName()+"---"+MiamiDowntown.getRate());
        System.out.println("Hotel 3: "+MiamiMidtown.getName()+"---"+MiamiMidtown.getRate());

        Hotel cheapestHotel = reservationSystem.findCheapestHotelUsingComparator();

        System.out.println("Cheapest hotel is: "+cheapestHotel+"\n");
        assertEquals(MiamiBeach, cheapestHotel);
    }

    @Test
    public void findListOfCheapestHotelWithSamePrice(){
        Hotel MiamiBeach = new Hotel(80, "Miami Beach");
        Hotel MiamiDowntown = new Hotel(120, "Miami Downtown");
        Hotel MiamiMidtown = new Hotel(100, "Miami Midtown");
        Hotel Brickell = new Hotel(80, "Brickell");
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(MiamiDowntown);
        hotelList.add(MiamiBeach);
        hotelList.add(MiamiMidtown);
        hotelList.add(Brickell);
        ReservationSystem reservationSystem = new ReservationSystem(hotelList);
        System.out.println("----Among three hotels: findListOfCheapestHotelWithSamePrice---------");
        System.out.println("Hotel 1: "+MiamiBeach.getName()+"---"+MiamiBeach.getRate());
        System.out.println("Hotel 2: "+MiamiDowntown.getName()+"---"+MiamiDowntown.getRate());
        System.out.println("Hotel 3: "+MiamiMidtown.getName()+"---"+MiamiMidtown.getRate());
        System.out.println("Hotel 4: "+Brickell.getName()+"---"+Brickell.getRate());

        Set<Hotel> setOfCheapHotels = reservationSystem.findListOfCheapestHotel();
        System.out.println("List of cheapest hotels are: "+setOfCheapHotels+"\n");
        assertEquals(2, setOfCheapHotels.size());
    }
}
