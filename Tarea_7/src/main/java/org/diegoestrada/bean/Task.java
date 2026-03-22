package org.diegoestrada.bean;

import java.time.LocalDate;
import java.util.Date;

public class Task {
    private int taskId;
    private int courseId;
    private String name;
    private String description;
    private LocalDate deliveryDate;
    private int state;//1= entregado, 2=pendiente, 3= calificada
    private int point;


    public Task(){}

    public Task(int taskId, int courseId, String name, String description, LocalDate deliveryDate, int state, int point) {
        this.taskId = taskId;
        this.courseId = courseId;
        this.name = name;
        this.description = description;
        this.deliveryDate = deliveryDate;
        this.state = state;
        this.point = point;
    }

    //Getters
    public int getTaskId() {
        return taskId;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public int getState() {
        return state;
    }

    public int getPoint() {
        return point;
    }

    //Setters
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return name + " " + taskId + " " + courseId + " " + description + " " + state + " " + point;
    }

}
