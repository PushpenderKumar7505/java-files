package p02;

public class Exam01 {

        int rollno;
        String course;
        int marks;

        Exam01() {
            rollno = 0;
            course = "unknown";
            marks = 0;
        }

       public void setvalue(int rollno, int marks)

        {
          this.marks= marks;
          this.rollno = rollno;


        }
        public void setvalue(int rollno, int marks, String course)
        {
            this.marks = marks;
            this.rollno = rollno;
            this.course = course;

        }
        public void display()
        {

            System.out.println(rollno + " " + course + " " + marks);
        }

    }

}
