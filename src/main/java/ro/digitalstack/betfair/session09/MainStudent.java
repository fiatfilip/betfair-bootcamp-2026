package ro.digitalstack.betfair.session09;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("Mihai", 5);
        printReportEnchanted(student);
    }

    public static void printReport(Student student){
        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Status: " + student.getStatus());
    }

    public static void printReportEnchanted(Student student){
        String raport =
        """ 
        Student: %s 
                Grade: %.2f
            Status: %s
        """.formatted(student.getName(), student.getGrade(), student.getStatus());

        System.out.println(raport);
    }
}
