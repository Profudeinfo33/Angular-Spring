package springlearningprof.Angular.Spring.controller;

import org.springframework.web.bind.annotation.*;
import springlearningprof.Angular.Spring.domain.Task;
import springlearningprof.Angular.Spring.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> list(){
        return this.taskService.list();
    }

    @PostMapping("/save")
    public Task saveTask(@RequestBody Task task){
        return this.taskService.save(task);
    }
}
