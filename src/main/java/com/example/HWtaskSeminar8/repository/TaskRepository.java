package com.example.HWtaskSeminar8.repository;

import com.example.HWtaskSeminar8.model.Task;
import com.example.HWtaskSeminar8.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *  Интерфейс репозитория для сущности задачи (Task).
 */
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
}
