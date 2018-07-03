package ThemePark;

import ThemePark.Attractions.Attraction;
import ThemePark.Attractions.IReviewed;
import ThemePark.Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;
    public int rating;

    public ThemePark(String name) {
        this.name = name;
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
        reviews = new ArrayList<>();
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList getAttractions(){
        return new ArrayList(attractions);
    }

    public ArrayList getStalls(){
        return new ArrayList(stalls);
    }

    public ArrayList<IReviewed> getAllReviews() {
        return new ArrayList<>(reviews);
    }
}
