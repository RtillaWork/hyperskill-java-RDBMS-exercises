package work.rtilla.xmpl.hyperskilljavaRDBMSexercises;

import java.util.Optional;

public class TaskModel {
    // Create
    public void performCreateOps(TaskRepository taskRepository) {
        Task fitnessTask = new Task("Go to gym", "It could be a nice walk", true, 3);
        System.out.printf("Task fitnessTask between .new and .save: %s\n", fitnessTask);
        System.out.printf("Task fitnessTask after .save: %s\n", taskRepository.save(fitnessTask));

        Task groceryTask = new Task("Costco!", "Need more Nutella", false, 6);
        taskRepository.save(groceryTask);

        Task listenToJavaPodcastsTask = new Task("Listen before sleep",
                "OMG 2 weeks worth of podcasts", true, 7);
        Task savedPodcastTask = taskRepository.save(listenToJavaPodcastsTask);

        System.out.printf("Task savedPodcastTask: %s\n", savedPodcastTask.toString());
    }

    // Read
    public void performReadOps(TaskRepository taskRepository) {
        Optional<Task> taskOptional = taskRepository.findById(1L);
        if (taskOptional.isPresent()) {
            System.out.printf("Task findById: %s\n", taskOptional.get());
        }

        final Iterable<Task> tasksAll = taskRepository.findAll();
        for (Task task: tasksAll) {
            System.out.printf("Find all Task: %s\n", task.toString());
        }

        final Iterable<Task> tasksEnabled = taskRepository.findAllByEnabled(true);
        for (Task task: tasksEnabled) {
            System.out.printf("Find all enabled Task : %s\n", task.toString());
        }
        final Iterable<Task> tasksContainingPodcast = taskRepository.findBySummaryContaining("podcast");
        for (Task task: tasksContainingPodcast) {
            System.out.printf("Find all Task: %s\n", task.toString());
        }
    }

    // Update
    public void performUpdateOps(TaskRepository taskRepository) {
        System.out.println("Updating tasks's title");
        Task task = taskRepository.findBySummaryContaining("Nutella").get(0);

        if (task != null) {
            System.out.println(task);
            task.setEnabled(true);
            taskRepository.save(task);
            System.out.println(taskRepository.findBySummaryContaining("Nutella").get(0));
        }
    }

    // Delete
    public void performDeleteOps(TaskRepository taskRepository) {
        Task task = taskRepository.findBySummaryContaining("Nutella").get(0);
        if (task != null) {
            taskRepository.delete(task);
            System.out.printf("Count: %s\n", taskRepository.count());
        }
    }

    }
