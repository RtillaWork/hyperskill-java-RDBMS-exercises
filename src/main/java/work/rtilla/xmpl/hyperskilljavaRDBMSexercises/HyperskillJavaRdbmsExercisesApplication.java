package work.rtilla.xmpl.hyperskilljavaRDBMSexercises;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HyperskillJavaRdbmsExercisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyperskillJavaRdbmsExercisesApplication.class, args);
	}

	@Bean
	public CommandLineRunner runApplication(TaskRepository taskRepository) {
		TaskModel taskModel = new TaskModel();
		return (args -> {
			// add console output
			taskModel.performCreateOps(taskRepository);
//			taskModel.performReadOps(taskRepository);
//			taskModel.performUpdateOps(taskRepository);
//			taskModel.performDeleteOps(taskRepository);
		});
	}
}
