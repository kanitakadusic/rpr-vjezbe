package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int print(ArrayList objects, boolean from) {
        System.out.println();

        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i) instanceof Printable) {
                System.out.println((i + 1) + ". " + ((Printable) objects.get(i)).getInfo());
            }
        }

        if (from) System.out.print("- evaluation from (1-" + objects.size() + "): ");
        else System.out.print("- evaluation for (1-" + objects.size() + "): ");

        return new Scanner(System.in).nextInt();
    }

    public static void printEvaluations(ArrayList objects) {
        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i) instanceof Printable && objects.get(i) instanceof Evaluable) {
                System.out.print((i + 1) + ". " + ((Printable) objects.get(i)).getInfo());
                System.out.println(" " + ((Evaluable) objects.get(i)).getEvaluations());
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Rajan", "Blake", 2, "19333"));
        students.add(new Student("Carla", "Rose", 5, "18777"));

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("John", "Smith", "professor"));
        teachers.add(new Teacher("Elsa", "Walters", "dean"));

        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("Algorithms and Data Structures"));
        subjects.add(new Subject("Calculus"));

        String input;
        do {
            System.out.print("\nStatus (student/teacher/end): ");
            input = scanner.nextLine();

            if (input.trim().equals("student")) {
                int evaluationFrom = print(students, true);

                int evaluationFor = print(teachers, false);
                System.out.print("- grade: ");
                teachers.get(evaluationFor - 1).addEvaluation(students.get(evaluationFrom - 1).evaluate(scanner.nextInt()));

                evaluationFor = print(subjects, false);
                System.out.print("- grade: ");
                subjects.get(evaluationFor - 1).addEvaluation(students.get(evaluationFrom - 1).evaluate(scanner.nextInt()));

                scanner.nextLine();
            } else if (input.trim().equals("teacher")) {
                int evaluationFrom = print(teachers, true);

                int evaluationFor = print(subjects, false);
                System.out.print("- grade: ");
                subjects.get(evaluationFor - 1).addEvaluation(students.get(evaluationFrom - 1).evaluate(scanner.nextInt()));

                scanner.nextLine();
            }
        } while (!input.equals("end"));

        System.out.println("\nTeachers:");
        printEvaluations(teachers);

        System.out.println("\nSubjects");
        printEvaluations(subjects);
    }
}