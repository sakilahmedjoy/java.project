public class TuitionManagementSystem {
    public class TuitionManagementSystem {
        private List<Student> students;
        private List<Course> courses;
        private List<Payment> payments;
        public TuitionManagementSystem() {
            students = new ArrayList<>();
            courses = new ArrayList<>();
            payments = new ArrayList<>();
        }
        public void addStudent(Student student) {
            students.add(student);
        }
        public void removeStudent(Student student) {
            students.remove(student);
        }
        public void addCourse(Course course) {
            courses.add(course);
        }
        public void removeCourse(Course course) {
            courses.remove(course);
        }
        public void addPayment(Payment payment) {
            payments.add(payment);
        }
        public void removePayment(Payment payment) {
            payments.remove(payment);
        }
        public Student getStudentById(int id) {
            for (Student student : students) {
                if (student.getId() == id) {
                    return student;
                }
            }
            return null;
        }
        public Course getCourseById(int id) {
            for (Course course : courses) {
                if (course.getId() == id) {
                    return course;
                }
            }
            return null;
        }
        public Payment getPaymentById(int id) {
            for (Payment payment : payments) {
                if (payment.getId() == id) {
                    return payment;
                }
            }
            return null;
        }
        public void generateStudentReport(Student student) {
            // Implement the logic to generate a report for a specific student
        }
        public void generateCourseReport(Course course) {
        }
        public void generatePaymentReport(Payment payment) {
        }
    }
    public class Main {
        public static void main(String[] args) {
            TuitionManagementSystem tuitionManagementSystem = new TuitionManagementSystem();
        }
