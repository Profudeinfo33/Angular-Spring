package springlearningprof.Angular.Spring.repository;

import org.springframework.data.repository.CrudRepository;
import springlearningprof.Angular.Spring.domain.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {


}
