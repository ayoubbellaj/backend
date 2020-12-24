package com.springboot.app;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TODOController {

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/tasks")
	public List<TODO> getAllTasks() {
		return TODOService.getAllTasks();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/tasks/{taskId}")
	public TODO getTaskById(@PathVariable Long taskId) {
		return TODOService.getTaskById(taskId);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addtask")
	public TODO addTask(@RequestBody TODO task) {
		return TODOService.addTask(task);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/updateTask/{taskId}")
	public TODO updateTask(@PathVariable Long taskId, @RequestBody TODO task) {
		return TODOService.updateTask(taskId, task);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/deleteTask/{taskId}")
	public TODO deleteTask(@PathVariable Long taskId) {
		return TODOService.deleteTask(taskId);
	}
}
