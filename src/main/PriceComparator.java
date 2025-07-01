package main;

import java.util.Comparator;

public class PriceComparator implements Comparator<Hotel> {
    @Override
    public int compare(Hotel o1, Hotel o2) {
        if(o1.getRate() < o2.getRate()) { return -1;  }
        else { return 1;}
    }
}
