package com.springboot.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TODOService {
private static Map<Long, TODO> tasks = new HashMap<Long, TODO>();
private static Long index = 2L; 

static {
	TODO task1 =new TODO(1L,"description 1 ....");
	TODO task2 =new TODO(2L,"description 2 ....");
	tasks.put(1L, task1);
	tasks.put(2L, task2);
}

public static List<TODO> getAllTasks() {
	return new ArrayList<>(tasks.values());
}

public static TODO getTaskById(Long taskId) {
	return tasks.get(taskId);
}

public static TODO addTask(TODO task) {
	 index +=1;
	 task.setId(index);
	 tasks.put(index, task);
	 return task;
}

public static TODO updateTask(Long taskId,TODO task) {
	 task.setId(index);
	 tasks.put(index, task);
	 return task;
}

public static TODO deleteTask(Long taskId) {
	return tasks.remove(taskId);
}


}
