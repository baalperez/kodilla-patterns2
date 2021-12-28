package com.kodilla.patterns2.observer.homework;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskTestSuite {


    @Test
    public void addTaskTest() {
        //Given
        Mentor mentor_1 = new Mentor("Mentor_1");
        Mentor mentor_2 = new Mentor("Mentor_2");
        Student student_1 = new Student("Student_1", mentor_1);
        Student student_2 = new Student("Student_2", mentor_1);
        Student student_3 = new Student("Student_3", mentor_2);
        Task task_1 = new Task("Zadanie_1");
        Task task_2 = new Task("Zadanie_2");
        Task task_3 = new Task("Zadanie_3");
        Task task_4 = new Task("Zadanie_4");

        //When
        student_1.addTask(task_1);
        student_1.addTask(task_2);
        student_1.addTask(task_3);
        student_1.addTask(task_4);
        student_2.addTask(task_1);
        student_2.addTask(task_2);
        student_3.addTask(task_1);

        //Then
        assertEquals(6, mentor_1.getTasks().size());
        assertEquals(1, mentor_2.getTasks().size());
        assertEquals(4, student_1.getTasks().size());
        assertEquals(2, student_2.getTasks().size());
        assertEquals(1, student_3.getTasks().size());
    }
}
