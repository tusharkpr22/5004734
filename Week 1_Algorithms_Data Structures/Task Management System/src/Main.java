public class Main {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        // Adding tasks
        tms.addTask(new Task("T001", "Design Homepage", "In Progress"));
        tms.addTask(new Task("T002", "Develop Backend", "Not Started"));
        tms.addTask(new Task("T003", "Create Database Schema", "Completed"));
        tms.addTask(new Task("T004", "Test Application", "In Progress"));

        // Traversing tasks
        System.out.println("All Tasks:");
        tms.traverseTasks();

        // Searching for a task
        System.out.println("\nSearch for Task ID T003:");
        Task foundTask = tms.searchTask("T003");
        System.out.println(foundTask != null ? foundTask : "Task not found");

        // Deleting a task
        System.out.println("\nDeleting Task ID T002:");
        boolean isDeleted = tms.deleteTask("T002");
        System.out.println(isDeleted ? "Task deleted" : "Task not found");

        // Traversing tasks after deletion
        System.out.println("\nAll Tasks after deletion:");
        tms.traverseTasks();
    }
}
