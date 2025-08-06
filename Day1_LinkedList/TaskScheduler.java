package Day1_LinkedList;
public class TaskScheduler {

    static class TaskNode {
        int taskId;
        String taskName;
        String priority;
        String dueDate;
        TaskNode next;

        public TaskNode(int taskId, String taskName, String priority, String dueDate) {
            this.taskId = taskId;
            this.taskName = taskName;
            this.priority = priority;
            this.dueDate = dueDate;
        }
    }

    static class CircularTaskList {
        TaskNode head, tail, current;

        void addTask(TaskNode task) {
            if (head == null) {
                head = tail = current = task;
                tail.next = head;
            } else {
                tail.next = task;
                tail = task;
                tail.next = head;
            }
        }

        void deleteTaskById(int taskId) {
            if (head == null) return;
            if (head.taskId == taskId) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    head = head.next;
                    tail.next = head;
                }
                return;
            }
            TaskNode temp = head;
            while (temp.next != head && temp.next.taskId != taskId) {
                temp = temp.next;
            }
            if (temp.next.taskId == taskId) {
                if (temp.next == tail) tail = temp;
                temp.next = temp.next.next;
            }
        }

        void viewCurrentAndMoveNext() {
            if (current != null) {
                System.out.println(current.taskId + " - " + current.taskName + " - " + current.priority + " - " + current.dueDate);
                current = current.next;
            }
        }

        void displayAllTasks() {
            if (head == null) return;
            TaskNode temp = head;
            do {
                System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
                temp = temp.next;
            } while (temp != head);
        }

        void searchByPriority(String priority) {
            if (head == null) return;
            TaskNode temp = head;
            do {
                if (temp.priority.equals(priority)) {
                    System.out.println(temp.taskId + " - " + temp.taskName);
                }
                temp = temp.next;
            } while (temp != head);
        }
    }

    public static void main(String[] args) {
        CircularTaskList taskList = new CircularTaskList();

        taskList.addTask(new TaskNode(1, "Write Code", "High", "2025-10-24"));
        taskList.addTask(new TaskNode(2, "Test Code", "Medium", "2025-07-10"));
        taskList.addTask(new TaskNode(3, "Push to Git", "Low", "2025-09-16"));

        System.out.println("All Tasks:");
        taskList.displayAllTasks();

        System.out.println("Viewing tasks in circular rotation:");
        for (int i = 0; i < 5; i++){
        taskList.viewCurrentAndMoveNext();
        }

        System.out.println("Search by Priority 'High':");
        taskList.searchByPriority("High");

        System.out.println("\nRemoving Task ID 2:");
        taskList.deleteTaskById(2);
        taskList.displayAllTasks();
    }
}