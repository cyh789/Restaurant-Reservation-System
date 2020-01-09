package kr.com.cyh.RRS.domain;

        import java.util.ArrayList;
        import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> findAll();

    Restaurant findById(Long id);
}
