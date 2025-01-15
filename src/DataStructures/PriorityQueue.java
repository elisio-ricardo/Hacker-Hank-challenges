import java.util.*;

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    // Constructor
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    // Compare students by priority (higher CGPA, then name, then ID)
    @Override
    public int compareTo(Student other) {
        if (Double.compare(this.cgpa, other.cgpa) != 0) {
            return Double.compare(other.cgpa, this.cgpa); // Higher CGPA first
        } else if (!this.name.equals(other.name)) {
            return this.name.compareTo(other.name); // Lexicographical order of names
        } else {
            return Integer.compare(this.id, other.id); // Lower ID first
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        java.util.PriorityQueue<Student> queue = new java.util.PriorityQueue<>();

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                queue.add(new Student(id, name, cgpa));
            } else if (parts[0].equals("SERVED")) {
                queue.poll(); // Remove the highest priority student
            }
        }

        // Retrieve remaining students in priority order
        List<Student> remainingStudents = new ArrayList<>();
        while (!queue.isEmpty()) {
            remainingStudents.add(queue.poll());
        }

        return remainingStudents;
    }
}

// Example usage
public class PriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            events.add(scanner.nextLine());
        }

        Priorities priorities = new Priorities();
        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}
