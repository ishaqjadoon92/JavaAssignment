package assignmentone;

import java.util.Scanner;

public class MiniUniversity {

    public static void main(String[] args) {

        System.out.println("\t === *** WELCOME TO STUDENT MANAGEMENT SYSTEM *** === \n");
        System.out.println("PLEASE FOLLOW THE INSTRACTION \n");

        System.out.println("1- Student Department ");
        System.out.println("2- Teacher Department ");
        System.out.println("3- Exit ");

        Scanner userInput = new Scanner(System.in);
        System.out.print("Select Choice :");
        int list = userInput.nextInt();

        switch (list) {
            case 1:
                Student student = new Student();
                student.addStudent();
                break;
            case 2:
                Teacher teacher = new Teacher();
                teacher.addTeacher();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

    }
}
