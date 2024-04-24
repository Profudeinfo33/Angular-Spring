package springlearningprof.Angular.Spring.service;

import org.springframework.stereotype.Service;
import springlearningprof.Angular.Spring.domain.Task;


public interface TaskService {
    Iterable<Task> list();

    Task save(Task task);
}
