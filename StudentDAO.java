import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class StudentDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void createStudent(Student student) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(student);
        tx.commit();
        session.close();
    }

    public Student readStudent(int id) {
        Session session = factory.openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    public void updateStudent(Student student) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(student);
        tx.commit();
        session.close();
    }

    public void deleteStudent(Student student) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(student);
        tx.commit();
        session.close();
    }
}