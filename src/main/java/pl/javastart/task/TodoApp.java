package pl.javastart.task;

public class TodoApp {

    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Kowalski");

        Task task1 = new Task("Pozmywać naczynia", "Po prostu pozmywać");
        Task task2 = new Task("Zrobić zakupy", "Koniecznie kupić ziemniaki", 10);
        Task task3 = new Task("Zrobić zadanie domowe", "Z polskiego", -5, person1);

        System.out.println(task1.getTaskInfo());
        System.out.println();
        System.out.println(task2.getTaskInfo());
        System.out.println();
        System.out.println(task3.getTaskInfo());
    }
}
