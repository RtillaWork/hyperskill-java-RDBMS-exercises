package work.rtilla.xmpl.hyperskilljavaRDBMSexercises;

import javax.persistence.*;

@Entity
@Table(name="task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String summary;
    private boolean enabled;
    private int priority;

    public Task(String title, String summary, boolean enabled, int priority) {
        this.title = title;
        this.summary = summary;
        this.enabled = enabled;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return String.format("{id: %s, title: %s, summary: %s, isEnabled: %s, priority: %s}",
                getId(), getTitle(), getSummary(), isEnabled(), getPriority());
    }
}
