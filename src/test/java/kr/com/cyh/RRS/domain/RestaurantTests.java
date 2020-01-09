package kr.com.cyh.RRS.domain;


import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTests {
    @Test
    public void creation() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul", 1004L);

        assertThat(restaurant.getId(), is(1004L));
        assertThat(restaurant.getName(), is("Bob zip"));
        assertThat(restaurant.getAddress(), is("Seoul"));
    }

    @Test
    public void information() {
        Restaurant restaurant = new Restaurant("Bob zip", "Seoul", 1004L);

        assertThat(restaurant.getInformation(), is("Bob zip in Seoul"));
    }
}