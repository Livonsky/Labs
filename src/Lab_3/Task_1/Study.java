package Lab_3.Task_1;

public class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String printCourse() {
        System.out.println(course);
        return this.course;
    }

    @Override
    public String toString() {
        return "Study{" +
                "course='" + course + '\'' +
                '}';
    }
}




class JavaProgram {

    public static void main(String[] args) {

        Study study = new Study ("");
        study.setCourse("Изучение Java - это просто!");
        study.printCourse();
            }

}

