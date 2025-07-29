package com.standalone;

import java.util.List;
import java.util.Map;

public class Collection {
    List<String> name;
    Map<String, String> course;

    public Collection(List<String> name, Map<String, String> course) {
        this.name = name;
        this.course = course;
    }

    public Collection(){

    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "name=" + name +
                ", course=" + course +
                '}';
    }
}
