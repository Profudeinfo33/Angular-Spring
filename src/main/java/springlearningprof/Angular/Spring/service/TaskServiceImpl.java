package springlearningprof.Angular.Spring.service;

import org.springframework.stereotype.Service;
import springlearningprof.Angular.Spring.domain.Task;
import springlearningprof.Angular.Spring.repository.TaskRepository;
@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {

        return this.taskRepository.save(task);
    }
}
