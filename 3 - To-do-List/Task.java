public class Task {
    private String name;
    private String description;
    private boolean complete;

    public Task(String name, String description, boolean complete) {
        this.name = name;
        this.description = description;
        this.complete = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
