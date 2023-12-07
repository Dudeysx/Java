public class Main {
    public static void main(String[] args) {
        // Создаем массив типа Student, содержащий объекты класса Student и Aspirant
        Student[] students = new Student[3];
        students[0] = new Student("John", "Doe", "GroupA", 4.8);
        students[1] = new Aspirant("Jane", "Smith", "GroupB", 5.0, "Research on AI");
        students[2] = new Student("Bob", "Johnson", "GroupC", 4.5);

        // Вызываем метод getScholarship() для каждого элемента массива
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName() +
                    " Scholarship: " + student.getScholarship());
        }
    }
}
