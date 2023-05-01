import java.util.*;

public class ToDoList {

    private ArrayList<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(int index) {
        this.tasks.remove(index);
    }

    public void markTaskCompleted(int index) {
        Task task = this.tasks.get(index);
        task.setComplete(true);
    }

    public void printTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.isComplete() ? "complete" : "incomplete";
            System.out.println(i + ": " + task.getName() + " (" + task.getDescription() + ") - " + status);
        }
    }
}
