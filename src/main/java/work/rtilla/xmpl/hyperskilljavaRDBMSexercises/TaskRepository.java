package work.rtilla.xmpl.hyperskilljavaRDBMSexercises;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends CrudRepository<Task, Long> {

    Task findByTitle(String title); // NOTE if more than one may return NonUniqueResultException
    Optional<Task> findBySummary(String summary); // NOTE Task or Optional<Task> either
    List<Task> findBySummaryContaining(String text);
    List<Task> findAllByEnabled(boolean isEnabled);
    List<Task> findAllByEnabledOrderByPriorityAsc(boolean isEnabled);
}
