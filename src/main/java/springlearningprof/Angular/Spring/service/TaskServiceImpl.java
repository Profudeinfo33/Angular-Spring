package springlearningprof.Angular.Spring.service;

import springlearningprof.Angular.Spring.domain.Task;
import springlearningprof.Angular.Spring.repository.TaskRepository;

public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }
}
