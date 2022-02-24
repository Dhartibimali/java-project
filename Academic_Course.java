/**
 * Write a description of class Academic_Course here.
 *AcademicCourse class is a subclass(child) of Course class.Here is used of super keyword inorder to access the 
 superclass constructor. Getter and setter method along with it display and removed method is also define.
 * @author (Dharti Bimali)
 * @version (5.0)
 */
public class Academic_Course extends Course { // eight instance variable created: lectureName,level,credit,StartingDate,CompletionDate,isRegistered,RemovedStatus,numberofAssessment
    private String level;
    private String Credit;
    private String StartingDate;
    private String CompletionDate;
    private int numberofAssessment;
    private boolean isRegistered;
    private boolean RemovedStatus;
    private String lectureName;
    /* The Constructor accepts six parameter: CourseID,CourseName, duration,level,credit,and numberofAssessment
     * A call is made to superclass constructor with three parameters: CourseID, CourseName, and duration.
     * In the constructor, instructorname,StartingDate and CompletionDate is assign as empty("") String, and 
    isRegistered status initalized to false.
     */
    Academic_Course(String CourseID, String CourseName, int duration, String level, String Credit, int numberofAssessment) {
        super(CourseID, CourseName, duration);
        this.level = level;
        this.Credit = Credit;
        this.numberofAssessment = numberofAssessment;
        this.lectureName = "";
        this.StartingDate = "";
        this.CompletionDate = "";
        this.isRegistered = false;
    }
    // Getter/Acessor Method of lectureName
    public String getlectureName() {
        return this.lectureName;
    }
    // Getter/Acessor Method of level
    public String getlevel() {
        return this.level;
    }
    // Getter/Acessor Method of Credit
    public String getCredit() {
        return this.Credit;
    }
    // Getter/Acessor Method of StartingDate
    public String getStartingDate() {
        return this.StartingDate;
    }
    // Getter/Acessor Method of CompletionDate
    public String getCompletionDate() {
        return this.CompletionDate;
    }
    // Getter/Acessor Method of numberOfAssessment
    public int getnumberofAssessment() {
        return this.numberofAssessment;
    }
    // Getter/Acessor Method of isRegistered
    public boolean getisRegistered() {
        return this.isRegistered;
    }
    //Setter/Mutator Method of lectureName
    public void setlecturename(String lecturename) {
        this.lectureName = lectureName;
    }
    //Setter/Mutator Method of numberofAssessment
    public void setnumberofAssessment(int numberofAssessment) {
        this.numberofAssessment = numberofAssessment;
    }
    // Method to register a Course
    public void register(String Courseleader, String lectureName, String StartingDate, String CompletionDate) {
        //Statement to be displayed if course is  register
        if (this.isRegistered == true) {
            System.out.println("the Course is alreday registerd");
            System.out.println("lecturename:" + getlectureName());
            System.out.println("StartingDate:" + getStartingDate());
            System.out.println("CompletionDate:" + getCompletionDate());
        } else if (this.isRegistered == false) {
            super.setCourseleader(Courseleader);
            this.lectureName = lectureName;
            this.StartingDate = StartingDate;
            this.CompletionDate = CompletionDate;
            this.isRegistered = true;
            this.RemovedStatus = false;
        }
    }

    /*A method to display the details of the course is required.
     * It must have same signature as the display method in the course class.
     * Call the method in Course class to display the CourseId,CourseName,duration and Courseleader.

     */

    public void display() {
        super.display();
        if (this.isRegistered == true) {
            System.out.println("lectureName:" + getlectureName());
            System.out.println("level:" + getlevel());
            System.out.println("Credit:" + getCredit());
            System.out.println("StartingDate:" + getStartingDate());
            System.out.println("CompletionDate:" + getCompletionDate());
            System.out.println("numberofAssessments:" + getnumberofAssessment());
        }
    }
}