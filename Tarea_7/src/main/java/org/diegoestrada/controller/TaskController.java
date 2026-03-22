package org.diegoestrada.controller;

import org.diegoestrada.bean.Task;

public class TaskController {

    public static Task[] task = new Task[100];
    public static int totalTasks =0;

    public boolean addTask(Task newTask){
        for(int i=0; i<task.length; i++){
            if(task[i] == null){
                task[i] = newTask;
                totalTasks++;
                return true;
            }
        }
        return false;
    }

    public static void showAllTasks(){
        for(int i=0; i<totalTasks; i++){
            System.out.println(task[i]);
        }
    }

}
