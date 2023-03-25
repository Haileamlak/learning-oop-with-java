// package LAB;

import java.util.ArrayList;

public class Student {
    private String name;
    private String id;
    private ArrayList<Course> courses;

    Student(String name, String id) {
        setName(name);
        setId(id);
        courses = new ArrayList<Course>();
    }

    public String getStuCourse() {
        Course c = courses.get(0);
        return c.getcId() + "..." + c.getcTitle() + "..." + c.getCreditHour();
    }
    public void setStuCourse(Course cc) {
        courses.add(new Course(cc.getcId(), cc.getcTitle(), cc.getCreditHour()));
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "with id number + " + id + " has taken the course " + getStuCourse();
    }
}
