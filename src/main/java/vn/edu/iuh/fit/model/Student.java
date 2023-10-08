package vn.edu.iuh.fit.model;

import lombok.Data;

@Data
public class Student {
    private long id;
    private String name;
    private Class_ lophoc;

    public Student(long id) {
        this.id = id;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(Class_ lophoc) {
        this.lophoc = lophoc;
    }

    public Student(long id, String name, Class_ lophoc) {
        this.id = id;
        this.name = name;
        this.lophoc = lophoc;
    }
    public Student(){}
}
