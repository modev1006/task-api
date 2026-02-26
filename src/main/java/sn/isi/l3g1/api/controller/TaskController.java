package sn.isi.l3g1.api.controller;

import org.springframework.web.bind.annotation.*;
import sn.isi.l3g1.core.model.Task;
import sn.isi.l3g1.core.model.TaskStatus;
import sn.isi.l3g1.core.service.TaskService;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    // POST /api/tasks → Créer une tâche
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

    // GET /api/tasks → Lister toutes les tâches
    @GetMapping
    public List<Task> listTasks() {
        return taskService.listTasks();
    }

    // PUT /api/tasks/{id}/status → Modifier le statut
    @PutMapping("/{id}/status")
    public Task updateStatus(@PathVariable Long id, @RequestParam TaskStatus status) {
        return taskService.updateStatus(id, status);
    }

    // GET /api/tasks/done/count → Compter les tâches terminées
    @GetMapping("/done/count")
    public long countCompletedTasks() {
        return taskService.countCompletedTasks();
    }
}
