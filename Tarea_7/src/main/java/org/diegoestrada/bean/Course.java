package org.diegoestrada.bean;

public class Course {

    private int courseId;
    private String name;
    private String tutor;
    private String description;
    private String category;

    public Course (){
    }

    public Course(int courseId, String name, String tutor, String description, String category) {
        this.courseId = courseId;
        this.name = name;
        this.tutor = tutor;
        this.description = description;
        this.category = category;

    }

    //Getters
    public int getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public String getTutor() {
        return tutor;
    }

    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }

    //Setters
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " " + courseId + " " + tutor + " " + description + " " + category;
    }


}
