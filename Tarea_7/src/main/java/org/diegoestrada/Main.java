package org.diegoestrada;

import org.diegoestrada.bean.Task;
import org.diegoestrada.controller.CourseController;
import org.diegoestrada.bean.Course;
import org.diegoestrada.controller.TaskController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import static org.diegoestrada.controller.CourseController.course;

public class Main {

    static Scanner src = new Scanner(System.in);
    static int option =0;
    //static Course course = new Course();
    //static Task task = new Task();
    static CourseController courseController = new CourseController();
    static TaskController taskController = new TaskController();

    public static void main(String[] args) {

        menu();
    }

    //Menu of options
    public static void menu(){
        do{
            System.out.println("Welcome!");
            System.out.println("Main menu, select an option");
            System.out.println("1. Add Course");
            System.out.println("2. Add Task");
            System.out.println("3. Show Courses");
            System.out.println("4. Show Tasks");
            System.out.println("5. Exit");
            option = src.nextInt();
            src.nextLine();

            switch (option){
                case 1:
                    //Request Data
                    System.out.println("Enter Course ID");
                    int courseId = src.nextInt();
                    src.nextLine();
                    System.out.println("Enter name");
                    String name = src.nextLine();
                    System.out.println("Enter tutor Name");
                    String tutorName = src.nextLine();
                    System.out.println("Enter description");
                    String description = src.nextLine();
                    System.out.println("Enter category");
                    String category = src.nextLine();

                    //Save data In Model
                    Course course = new Course(courseId,name,tutorName,description,category);

                    courseController.createCourse(course);
                    break;
                case 2:
                    //Request data
                    System.out.println("Enter Tasks ID");
                    int taskId = src.nextInt();
                    src.nextLine();
                    System.out.println("Enter Course ID");
                    int idCourse= src.nextInt();
                    src.nextLine();
                    System.out.println("Enter name");
                    String nameTask = src.nextLine();
                    System.out.println("Enter description");
                    String descriptionTask = src.nextLine();
                    System.out.println("Enter Delivery Date (DD/MM/YYYY)");
                    String deliveryDate = src.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // String to LocalDate
                    LocalDate newDeliveryDate = LocalDate.parse(deliveryDate, formatter);
                    System.out.println("Enter State (1:Delivery | 2:Earring | 3:Qualified");
                    int state = src.nextInt();
                    src.nextLine();
                    System.out.println("Enter Points");
                    int points = src.nextInt();
                    src.nextLine();

                    Task task = new Task(taskId, idCourse, nameTask, descriptionTask, newDeliveryDate, state, points);

                    taskController.addTask(task);
                    break;
                case 3:
                    CourseController.showAllCourse();
                    break;
                case 4:
                    TaskController.showAllTasks();
                    break;
                case 5:
                    System.out.println("Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while (option!=5);
    }
}