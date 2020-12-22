package com.springboot.app;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TODOController {

	@GetMapping("/tasks")
	public List<TODO> getAllTasks() {
		return TODOService.getAllTasks();
	}
	
	@GetMapping("/tasks/{taskId}")
	public TODO getTaskById(@PathVariable Long taskId) {
		return TODOService.getTaskById(taskId);
	}
	
	@PostMapping("/addtask")
	public TODO addTask(@RequestBody TODO task) {
		return TODOService.addTask(task);
	}
	
	@PutMapping("/updateTask/{taskId}")
	public TODO updateTask(@PathVariable Long taskId, @RequestBody TODO task) {
		return TODOService.updateTask(taskId, task);
	}
	
	@DeleteMapping("/deleteTask/{taskId}")
	public TODO deleteTask(@PathVariable Long taskId) {
		return TODOService.deleteTask(taskId);
	}
}
