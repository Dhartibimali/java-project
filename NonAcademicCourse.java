/**
 * Write a description of class NonAcademicCourse here.
 *NonAcademicCourse class is a subclass(child) of Course class.Here is used of super keyword inorder to access the 
 superclass constructor. Getter and setter method along with it display and removed method is also define.
 * @author (Dhart Bimali)
 * @version (5.0)
 */
public class NonAcademicCourse extends Course

{
    //Seven instance variable are created:instructorname,duration,StartingDate,CompletionDate,ExamDate,prerequisiteisRegistered,isRemoved
    private String instructorname;
    private int duration;
    private String StartingDate;
    private String CompletionDate;
    private String ExamDate;
    private String Prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;

    /*
 * A constructor is created with four parameters:the courseID, course
  name, duration and prerequisite.
 * A call is made to the superclass constructor
with three parameters: the CourseID, CourseName and duration.
 * The constructor initializes StartingDate, CompletionDate and ExamDate to empty
("") string, and isRegistered and isRemoved status to false.
 */
    NonAcademicCourse(String CourseID, String CourseName, int duration, String Prerequisite) {
        super(CourseID, CourseName, duration);
        this.Prerequisite = Prerequisite;
        this.StartingDate = "";
        this.CompletionDate = "";
        this.ExamDate = "";
        this.isRegistered = false;
        this.isRemoved = false;
    }
    //Getter/Acessor Method of instructorname.
    public String getinstructorname() {
        return this.instructorname;
    }
    //Getter/Acessor Method of duration.
    public int getduration() {
        return this.duration;
    }
    //Getter/Acessor Method of StartingDate.
    public String getStartingDate() {
        return this.StartingDate;
    }
    //Getter/Acessor Method of CompletionDate.
    public String getCompletionDate() {
        return this.CompletionDate;
    }

    //Getter/Acessor Method of ExamDate.
    public String getExamDate() {
        return this.ExamDate;
    }
    //Getter/Acessor Method of Prerequistie.
    public String getPrerequistie() {
        return this.Prerequisite;
    }
    //Getter/Acessor Method of isRegistered.
    public boolean getisRegistered() {
        return this.isRegistered;
    }
    //Getter/Acessor Method of isRemoved.
    public boolean getisRemoved() {
        return this.isRemoved;
    }
    //mutator/setter method of instructorname
    public void setinstructorname(String instructorname) {
        if (isRegistered == false) {
            this.instructorname = instructorname;
        } else {
            System.out.println("the course is already register so that instructorname cannot be changed");
        }
    }
    //Method to register course
    public void Register(String Courseleader, String instructorname, String StartingDate, String CompletionDate, String ExamDate) {
        if (isRegistered == false) {
            setinstructorname(instructorname);
            this.isRegistered = true;
        } else {
            System.out.println("The Course is already registered");
        }
    }
    //method to remove a Course
    void remove() {
        if (isRemoved == false) {
            System.out.println("The course is already removed");

        } else {
            super.setCourseleader("");
            this.instructorname = "";
            this.StartingDate = "";
            this.CompletionDate = "";
            this.ExamDate = "";
            this.isRegistered = false;
            this.isRemoved = true;
        }
    }
    // Method to display
    public void display() {
        super.display();
        if (isRegistered == true) {
            System.out.println("Instructorname:" + getinstructorname());
            System.out.println("StartingDate:" + getStartingDate());
            System.out.println("CompletionDate:" + getCompletionDate());
            System.out.println("ExamDate:" + getExamDate());
        }

    }
}