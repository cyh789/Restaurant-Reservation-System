package kr.com.cyh.RRS.domain;

import org.springframework.web.bind.annotation.RestController;

//@RestController
public class Restaurant {

    private final long id;
    private final String address;
    private final String name;

    public Restaurant(long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
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
