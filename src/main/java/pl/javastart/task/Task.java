package pl.javastart.task;

class Task {
    String name;
    String description;
    int priority;
    Person person;

    Task(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    boolean highPriority() {
        return priority > 0;
    }

    boolean lowPriority() {
        return priority < 0;
    }

    boolean mediumPriority() {
        return priority == 0;
    }

    String getTaskInfo() {
        return "Zadanie: " + name
                + "\nOpis: " + description
                + "\nPriorytet wysoki: " + highPriority()
                + "\nPriorytet średni: " + mediumPriority()
                + "\nPriorytet niski: " + lowPriority();
    }
}
