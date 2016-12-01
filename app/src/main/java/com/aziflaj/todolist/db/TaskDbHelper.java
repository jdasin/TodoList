package com.aziflaj.todolist.db;
import java.util.ArrayList;


public interface TaskDbHelper {
    public void deleteTask(String taskTitle);

    public void addTask(String task);

    public ArrayList<String> getTasksList();
}
