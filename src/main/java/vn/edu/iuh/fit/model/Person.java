package vn.edu.iuh.fit.model;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private int age;
    private List<Address> addresses;
    private List<String> emails;
    private String name;
}
