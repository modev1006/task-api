package sn.isi.l3g1.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.isi.l3g1.api.model.Task;
import sn.isi.l3g1.api.model.TaskStatus;
import sn.isi.l3g1.api.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    // POST /api/tasks → Créer une tâche
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    // GET /api/tasks → Lister toutes les tâches
    @GetMapping
    public ResponseEntity<List<Task>> listTasks() {
        List<Task> tasks = taskService.listTasks();
        return ResponseEntity.ok(tasks);
    }

    // GET /api/tasks/{id} → Obtenir une tâche spécifique
    @GetMapping("/{id}")
    public ResponseEntity<Task> getTask(@PathVariable Long id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    // PUT /api/tasks/{id}/status → Modifier le statut
    @PutMapping("/{id}/status")
    public ResponseEntity<Task> updateStatus(@PathVariable Long id, @RequestParam TaskStatus status) {
        Task updatedTask = taskService.updateStatus(id, status);
        return ResponseEntity.ok(updatedTask);
    }

    // DELETE /api/tasks/{id} → Supprimer une tâche
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }

    // GET /api/tasks/done/count → Compter les tâches terminées
    @GetMapping("/done/count")
    public ResponseEntity<Long> countCompletedTasks() {
        long count = taskService.countCompletedTasks();
        return ResponseEntity.ok(count);
    }
}
