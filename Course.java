/**
 * Write a description of class Course here.
 *Course class is a parent class where there is a use of getter and setter maethod and also a dispaly method is used.
 * @author (Dharti Bimali)
 * @version (5.0)
 */
public class Course {
    // Four instance variable Created: CourseID, CourseName,Courseleader,duration.
    private String CourseID;
    private String CourseName;
    private String Courseleader;
    private int duration;
    /*A constructor is Created with three parameteres.
     * this keyword is used to call instance variable
     * CourseID,CourseName,duration are initalized in the  constructor parameter.
     * Courseleader is initalized with empty("") String in the constructor
     */
    Course(String CourseID, String CourseName, int duration) {
        this.CourseID = CourseID;
        this.CourseName = CourseName;
        this.duration = duration;
        this.Courseleader = "";
    }
    //Accessor/Getter Method of CourseID
    public String getCourseID() {
        return this.CourseID;
    }
    //Accessor/Getter Method of CourseName
    public String getCourseName() {
        return this.CourseName;
    }
    //Accessor/Getter Method of Courseleader
    public String getCourseleader() {
        return this.Courseleader;
    }
    //Accessor/Getter Method of duration
    public int getduration() {
        return this.duration;
    }
    // Metator/ Setter Method Courseleader
    public void setCourseleader(String Courseleader) {
        this.Courseleader = Courseleader;
    }
    // Metator/ Setter Method duration
    public void setduration(int duration) {
        this.duration = duration;
    }
    // the method to display CourseID,CourseName,Courseleader,duration
    public void display() {
        System.out.println("The CourseID:" + getCourseID());
        System.out.println("The CourseName:" + getCourseName());
        System.out.println("The duration:" + getduration());
        if (getCourseleader() != "") {
            System.out.println("The Courseleader:" + getCourseleader());
        } else {
            System.out.println("The empty Courseleader");
        }
    }
}