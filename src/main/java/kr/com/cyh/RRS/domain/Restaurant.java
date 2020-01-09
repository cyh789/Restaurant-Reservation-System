package kr.com.cyh.RRS.domain;

import org.springframework.web.bind.annotation.RestController;

//@RestController
public class Restaurant {

    private final String address;
    private final String name;
    private final long id;

    public Restaurant(String name, String address, long id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getInformation() {
        return name + " in " + address;
    }

    public Long getId() {
        return id;
    }
}
