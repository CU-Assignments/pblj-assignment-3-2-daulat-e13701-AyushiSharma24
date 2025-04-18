public class MainApp {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student student = new Student("John", 21);
        dao.createStudent(student);

        Student retrieved = dao.readStudent(student.getId());
        System.out.println("Retrieved: " + retrieved.getName());

        retrieved.setAge(22);
        dao.updateStudent(retrieved);

        dao.deleteStudent(retrieved);
        System.out.println("Student deleted");
    }
}