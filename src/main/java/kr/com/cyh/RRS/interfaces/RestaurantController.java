package kr.com.cyh.RRS.interfaces;

import kr.com.cyh.RRS.domain.Restaurant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        List<Restaurant> restaurants = new ArrayList<>();

        Restaurant restaurant = new Restaurant("Bob zip", "Seoul", 1004L);

        restaurants.add(restaurant);

        return restaurants;
    }
}
