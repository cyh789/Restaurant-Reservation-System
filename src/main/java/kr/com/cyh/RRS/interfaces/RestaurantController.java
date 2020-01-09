package kr.com.cyh.RRS.interfaces;

import kr.com.cyh.RRS.domain.Restaurant;
import kr.com.cyh.RRS.domain.RestaurantRepository;
import kr.com.cyh.RRS.domain.RestaurantRepositoryImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaurantController {

    private RestaurantRepository restaurantRepository = new RestaurantRepositoryImpl();

    @GetMapping("/restaurants")
    public List<Restaurant> list() {

        List<Restaurant> restaurants = restaurantRepository.findAll();

        return restaurants;
    }

    @GetMapping("/restaurants/{id}")
    public Restaurant detail(@PathVariable("id") Long id) {

        Restaurant restaurant = restaurantRepository.findById(id);

        return restaurant;
    }
}
