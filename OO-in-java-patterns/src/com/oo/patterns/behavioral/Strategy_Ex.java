package com.oo.patterns.behavioral;

import java.util.ArrayList;
import java.util.List;

class Task {
	private String name;
	private double duration;

	public Task(String name, double duration) {
		super();
		this.name = name;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", duration=" + duration + "]";
	}

	public String getName() {
		return name;
	}

	public double getDuration() {
		return duration;
	}

}

interface SchedulingStrategy {
	Task nextTask(List<Task> tasks);
}

class FCFSStrategy implements SchedulingStrategy {
	@Override
	public Task nextTask(List<Task> tasks) {
		return tasks.get(0);
	}
}

class STFStrategy implements SchedulingStrategy {
	@Override
	public Task nextTask(List<Task> tasks) {
		Task shortest = tasks.get(0);
		for (Task task : tasks) {
			if (shortest.getDuration() > task.getDuration()) {
				shortest = task;
			}
		}
		return shortest;
	}
}

class LTFStrategy implements SchedulingStrategy {
	@Override
	public Task nextTask(List<Task> tasks) {
		Task longest = tasks.get(0);
		for (Task task : tasks) {
			if (longest.getDuration() < task.getDuration()) {
				longest = task;
			}
		}
		return longest;
	}
}

class TaskList {
	private List<Task> tasks = new ArrayList<>();
	private SchedulingStrategy strategy;

	public void setStrategy(SchedulingStrategy strategy) {
		this.strategy = strategy;
	}

	public void addTask(Task task) {
		tasks.add(task);
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Task getNextTask() {
		return strategy.nextTask(tasks);
	}

}

public class Strategy_Ex {

	public static void main(String[] args) {

		TaskList taskList = new TaskList();
		taskList.addTask(new Task("task-1", 4));
		taskList.addTask(new Task("task-2", 2));
		taskList.addTask(new Task("task-3", 3));
		taskList.addTask(new Task("task-4", 0));

		// --------------------------------------

		// taskList.setStrategy(new STFStrategy());
		// taskList.setStrategy(new LTFStrategy());
		// taskList.setStrategy(new FCFSStrategy());
		// System.out.println(taskList.getNextTask());

		// --------------------------------------
	}

}
