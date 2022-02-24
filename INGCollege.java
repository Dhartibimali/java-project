/**
 * INGCollege class is used form mathing a GUI.
 * @author (Dhart Bimali)
 * @version (5.0)
 */
// Importing the Bluej Package
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class INGCollege implements ActionListener {
    // Instance Variable is created.
    private JFrame frame_1;
    private JButton Add_AC, Add_NoNAC, Add_Academic, Add_Register, Back, Next, Display, Clear, Add_NonAcademic, Remove, Back_1, Clear_1, Display_1, Add_Register_1;
    private JLabel label_ING, label_ing, label_CourseID, CourseName, Duration, level, Credit, NoofAssessment, Register, CID, Courseleader, CID_2, lecturename, startdate, completiondate, Prerequisites, Instructorname, Examdate, label_CourseID_1, CourseName_1, completiondate_1, startdate_1, Duration_1, CID_1, Courseleader_1;
    private JPanel panel, panel_1, panel_2;
    private JComboBox js_day, js_date, j_months, js_day_1, js_date_1, j_months_1, js_date_2, j_months_2, js_day_2, js_date_3, js_months_3, js_day_3, js_date_4, js_months_4, js_day_4;
    private JTextField textCourse_ID, textCourseName, textDuration, textlevel, textCredit, textNoofAssessment, textCID, textCourseleader, textCID_2, textlecturename, textstartdate, textcompletiondate, textPrerequisites, textInstructorname, textExamdate, textCourse_ID_1, textCourseName_1, textDuration_1, textCID_1, textCourseleader_1;
    //Array List is Created 
    private ArrayList < Course > ingArray = new ArrayList();
    //Main Method
    public static void main(String[] args) {
        INGCollege obj = new INGCollege(); //Object is Created for INGCollege
        obj.Gui(); //calling Gui method
    }
    //Method is created for main Gui home page
    public void Gui() {
        frame_1 = new JFrame("Course Registration"); //Main Frame is created 
        JFrame.setDefaultLookAndFeelDecorated(true);
        //panel created for the main frame
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);
        panel.setBounds(0, 0, 550, 200);
        // JLabel For ING College
        label_ING = new JLabel("ING Course");
        label_ING.setBounds(190, 0, 250, 40);
        label_ING.setFont(new Font("Arial", Font.PLAIN, 30));
        label_ING.setForeground(Color.LIGHT_GRAY); //setForeground is used to change the color of INGCollege
        panel.add(label_ING);

        //JButton is Created for Academic Course

        Add_AC = new JButton("AcademicCourse");
        Add_AC.setBounds(70, 50, 380, 40);
        Add_AC.setFont(new Font("Arial", Font.PLAIN, 25));
        Add_AC.setBackground(Color.GRAY);
        panel.add(Add_AC);
        //JButton is Created for Non-Academic Course
        Add_NoNAC = new JButton("NonAcademicCourse");
        Add_NoNAC.setBounds(70, 105, 380, 40);
        Add_NoNAC.setFont(new Font("Arial", Font.PLAIN, 25));
        Add_NoNAC.setBackground(Color.GRAY);
        panel.add(Add_NoNAC);
        //Adding the panel in frame_1
        frame_1.add(panel);
        frame_1.setBounds(0, 0, 550, 200);
        frame_1.setVisible(true);
        frame_1.setResizable(false);
        //Panel_1 is Created for AcademicCourse
        panel_1 = new JPanel();
        panel_1.setBackground(Color.LIGHT_GRAY);
        panel_1.setVisible(false);
        panel_1.setLayout(null);
        panel_1.setBounds(0, 0, 800, 650);
        frame_1.add(panel_1);

        //JLabel for Academic Course
        label_ing = new JLabel("Academic Course");
        label_ing.setBounds(250, 10, 380, 40);
        label_ing.setFont(new Font("Arial", Font.PLAIN, 30));
        label_ing.setForeground(Color.black); //setForeground is used to change the color of INGCollege
        panel_1.add(label_ing);

        //JLabel for CourseID
        label_CourseID = new JLabel("CourseID:");
        label_CourseID.setBounds(25, 90, 380, 40);
        label_CourseID.setFont(new Font("Arial", Font.PLAIN, 15));
        label_CourseID.setForeground(Color.black);
        panel_1.add(label_CourseID);
        //TextFiled for CourseId
        textCourse_ID = new JTextField();
        textCourse_ID.setBounds(150, 95, 200, 30);
        textCourse_ID.setFont(new Font("Arial", Font.PLAIN, 15));
        textCourse_ID.setEditable(true);
        panel_1.add(textCourse_ID);

        // JLabel for level
        level = new JLabel("Level:");
        level.setBounds(410, 90, 380, 40);
        level.setFont(new Font("Arial", Font.PLAIN, 15));
        level.setForeground(Color.black);
        panel_1.add(level);

        //JTesxtField for level
        textlevel = new JTextField();
        textlevel.setBounds(530, 95, 200, 30);
        textlevel.setFont(new Font("Arial", Font.PLAIN, 15));
        textlevel.setEditable(true);
        panel_1.add(textlevel);

        //JLabel for CourseName
        CourseName = new JLabel("CourseName:");
        CourseName.setBounds(25, 150, 380, 40);
        CourseName.setFont(new Font("Arial", Font.PLAIN, 15));
        CourseName.setForeground(Color.black);
        panel_1.add(CourseName);

        //TextField for CourseName
        textCourseName = new JTextField();
        textCourseName.setBounds(150, 155, 200, 30);
        textCourseName.setFont(new Font("Arial", Font.PLAIN, 15));
        textCourseName.setEditable(true);
        panel_1.add(textCourseName);

        //JLabel for NoofAssessment
        NoofAssessment = new JLabel("NoofAssessment:");
        NoofAssessment.setBounds(390, 205, 380, 40);
        NoofAssessment.setFont(new Font("Arial", Font.PLAIN, 15));
        NoofAssessment.setForeground(Color.black);
        panel_1.add(NoofAssessment);

        //JTextField for textNoofAssessment
        textNoofAssessment = new JTextField();
        textNoofAssessment.setBounds(530, 205, 200, 30);
        textNoofAssessment.setFont(new Font("Arial", Font.PLAIN, 15));
        textNoofAssessment.setEditable(true);
        panel_1.add(textNoofAssessment);

        //JLabel for duration 
        Duration = new JLabel("Duration:");
        Duration.setBounds(25, 210, 380, 40);
        Duration.setFont(new Font("Arial", Font.PLAIN, 17));
        Duration.setForeground(Color.black);
        panel_1.add(Duration);

        //JTextField for duration
        textDuration = new JTextField();
        textDuration.setBounds(150, 210, 200, 30);
        textDuration.setFont(new Font("Arial", Font.PLAIN, 15));
        textDuration.setEditable(true);
        panel_1.add(textDuration);
        //JLabel for credit
        Credit = new JLabel("Credit:");
        Credit.setBounds(400, 150, 380, 40);
        Credit.setFont(new Font("Arial", Font.PLAIN, 15));
        Credit.setForeground(Color.black);
        panel_1.add(Credit);
        //JTextField for Credit
        textCredit = new JTextField();
        textCredit.setBounds(530, 155, 200, 30);
        textCredit.setFont(new Font("Arial", Font.PLAIN, 15));
        textCredit.setEditable(true);
        panel_1.add(textCredit);

        // JButton for Add_Academic
        Add_Academic = new JButton("Add Academic Course");
        Add_Academic.setBounds(290, 280, 200, 30);
        Add_Academic.setFont(new Font("Arial", Font.PLAIN, 15));
        Add_Academic.setForeground(Color.BLACK);
        Add_Academic.setBackground(Color.WHITE);
        panel_1.add(Add_Academic);

        //JLabel for Register
        Register = new JLabel("Register Course");
        Register.setBounds(30, 300, 380, 40);
        Register.setFont(new Font("Arial", Font.BOLD, 20));
        Register.setForeground(Color.black);
        panel_1.add(Register);

        //JLabel for CID
        CID = new JLabel("Course ID:");
        CID.setBounds(30, 340, 380, 40);
        CID.setFont(new Font("Arial", Font.PLAIN, 15));
        CID.setForeground(Color.black);
        panel_1.add(CID);

        //JTextField for CID
        textCID = new JTextField();
        textCID.setBounds(150, 345, 200, 30);
        textCID.setFont(new Font("Arial", Font.PLAIN, 15));
        textCID.setEditable(true);
        panel_1.add(textCID);
        // JLabel for Courseleader
        Courseleader = new JLabel("Course leader:");
        Courseleader.setBounds(30, 400, 380, 40);
        Courseleader.setFont(new Font("Arial", Font.PLAIN, 15));
        Courseleader.setForeground(Color.black);
        panel_1.add(Courseleader);

        //JTextField for textCourseleader
        textCourseleader = new JTextField();
        textCourseleader.setBounds(150, 400, 200, 30);
        textCourseleader.setFont(new Font("Arial", Font.PLAIN, 15));
        textCourseleader.setEditable(true);
        panel_1.add(textCourseleader);

        //JLabel for lecturename
        lecturename = new JLabel("Lecture name:");
        lecturename.setBounds(30, 460, 380, 40);
        lecturename.setFont(new Font("Arial", Font.PLAIN, 15));
        lecturename.setForeground(Color.black);
        panel_1.add(lecturename);
        //JTextField for lecturename
        textlecturename = new JTextField();
        textlecturename.setBounds(150, 460, 200, 30);
        textlecturename.setFont(new Font("Arial", Font.PLAIN, 15));
        textlecturename.setEditable(true);
        panel_1.add(textlecturename);
        // JLabel for stratdate
        startdate = new JLabel("Start Date:");
        startdate.setBounds(400, 340, 380, 40);
        startdate.setFont(new Font("Arial", Font.PLAIN, 15));
        startdate.setForeground(Color.black);
        panel_1.add(startdate);

        Integer[] Date = {
            1990,
            1991,
            1992,
            1993,
            1994,
            1995,
            1996,
            1997,
            1998,
            1999,
            2001,
            2003,
            2002
        };
        //ComboBox is Created for js_date
        js_date = new JComboBox(Date);
        js_date.setBounds(540, 345, 60, 25);
        panel_1.add(js_date);

        String[] months = {
            "January",
            "Februray",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "Octobor",
            "November",
            "December"
        };
        //ComboBox is Created for j_months
        j_months = new JComboBox(months);
        j_months.setBounds(610, 345, 80, 25);
        panel_1.add(j_months);

        String[] Day = {
            "01",
            "02",
            "03",
            "04",
            "05",
            "06",
            "07",
            "08",
            "09",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31"
        };
        //ComboBox is Created for js_day
        js_day = new JComboBox(Day);
        js_day.setBounds(700, 345, 50, 25);
        panel_1.add(js_day);
        // JLabel is created for completedate

        completiondate = new JLabel("Completion Date:");
        completiondate.setBounds(400, 395, 380, 40);
        completiondate.setFont(new Font("Arial", Font.PLAIN, 15));
        completiondate.setForeground(Color.black);
        panel_1.add(completiondate);

        Integer[] Date_1 = {
            1990,
            1991,
            1992,
            1993,
            1994,
            1995,
            1996,
            1997,
            1998,
            1999,
            2001,
            2003,
            2002
        };
        //ComboBox is Created for js_date_1
        js_date_1 = new JComboBox(Date);
        js_date_1.setBounds(540, 400, 60, 25);
        panel_1.add(js_date_1);

        String[] months_1 = {
            "Janyary",
            "Februray",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "Octobor",
            "November",
            "December"
        };
        //ComboBox is Created for j_moths_1
        j_months_1 = new JComboBox(months);
        j_months_1.setBounds(610, 400, 80, 25);
        panel_1.add(j_months_1);

        String[] Day_1 = {
            "01",
            "02",
            "03",
            "04",
            "05",
            "06",
            "07",
            "08",
            "09",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31"
        };
        js_day_1 = new JComboBox(Day); //ComboBox is Created for Js_day_1
        js_day_1.setBounds(700, 400, 50, 25);
        panel_1.add(js_day_1);
        //JButton for Add_Register
        Add_Register = new JButton("Add Register Course");
        Add_Register.setBounds(290, 510, 200, 30);
        Add_Register.setFont(new Font("Arial", Font.PLAIN, 15));
        Add_Register.setForeground(Color.BLACK);
        Add_Register.setBackground(Color.WHITE);
        panel_1.add(Add_Register);

        //JButton for Back
        Back = new JButton("Back");
        Back.setBounds(40, 560, 90, 30);
        Back.setFont(new Font("Arial", Font.PLAIN, 15));
        Back.setForeground(Color.BLACK);
        Back.setBackground(Color.WHITE);
        panel_1.add(Back);

        //JButton for Next
        Next = new JButton("Next");
        Next.setBounds(150, 560, 90, 30);
        Next.setFont(new Font("Arial", Font.PLAIN, 15));
        Next.setForeground(Color.BLACK);
        Next.setBackground(Color.WHITE);
        panel_1.add(Next);

        //JButton for Display
        Display = new JButton("Display");
        Display.setBounds(500, 560, 90, 30);
        Display.setFont(new Font("Arial", Font.PLAIN, 15));
        Display.setForeground(Color.BLACK);
        Display.setBackground(Color.WHITE);
        panel_1.add(Display);
        //JButton for clear
        Clear = new JButton("Clear");
        Clear.setBounds(610, 560, 90, 30);
        Clear.setFont(new Font("Arial", Font.PLAIN, 15));
        Clear.setForeground(Color.BLACK);
        Clear.setBackground(Color.WHITE);
        panel_1.add(Clear);

        //panel_2 is created for Non_Academic
        panel_2 = new JPanel();
        panel_2.setBackground(Color.LIGHT_GRAY);
        panel_2.setBounds(0, 0, 800, 650);
        panel_2.setLayout(null);

        //JLabel for Non Academic Course
        label_ing = new JLabel("Non Academic Course");
        label_ing.setBounds(250, 10, 380, 40);
        label_ing.setFont(new Font("Arial", Font.PLAIN, 30));
        label_ing.setForeground(Color.black); //setForeground is used to change the color of INGCollege
        panel_2.add(label_ing);

        //JLabel for CourseID
        label_CourseID_1 = new JLabel("CourseID:");
        label_CourseID_1.setBounds(25, 90, 380, 40);
        label_CourseID_1.setFont(new Font("Arial", Font.PLAIN, 15));
        label_CourseID_1.setForeground(Color.black);
        panel_2.add(label_CourseID_1);

        // JTextField for CourseID
        textCourse_ID_1 = new JTextField();
        textCourse_ID_1.setBounds(150, 95, 200, 30);
        textCourse_ID_1.setFont(new Font("Arial", Font.PLAIN, 15));
        textCourse_ID_1.setEditable(true);
        panel_2.add(textCourse_ID_1);

        //JLabel for CourseName_1
        CourseName_1 = new JLabel("CourseName:");
        CourseName_1.setBounds(25, 150, 380, 40);
        CourseName_1.setFont(new Font("Arial", Font.PLAIN, 15));
        CourseName_1.setForeground(Color.black);
        panel_2.add(CourseName_1);

        // JTextField for CourseName_1
        textCourseName_1 = new JTextField();
        textCourseName_1.setBounds(150, 155, 200, 30);
        textCourseName_1.setFont(new Font("Arial", Font.PLAIN, 15));
        textCourseName_1.setEditable(true);
        panel_2.add(textCourseName_1);

        //JLabel for duration_1
        Duration_1 = new JLabel("Duration:");
        Duration_1.setBounds(410, 90, 380, 40);
        Duration_1.setFont(new Font("Arial", Font.PLAIN, 17));
        Duration_1.setForeground(Color.black);
        panel_2.add(Duration_1);

        // JTextField for duration_1

        textDuration_1 = new JTextField();
        textDuration_1.setBounds(530, 95, 200, 30);
        textDuration_1.setFont(new Font("Arial", Font.PLAIN, 15));
        textDuration_1.setEditable(true);
        panel_2.add(textDuration_1);

        //JLabel for Prerequisites
        Prerequisites = new JLabel("Prerequisites:");
        Prerequisites.setBounds(400, 150, 380, 40);
        Prerequisites.setFont(new Font("Arial", Font.PLAIN, 15));
        Prerequisites.setForeground(Color.black);
        panel_2.add(Prerequisites);

        // JTextField for Prerequisites 
        textPrerequisites = new JTextField();
        textPrerequisites.setBounds(530, 155, 200, 30);
        textPrerequisites.setFont(new Font("Arial", Font.PLAIN, 15));
        textCredit.setEditable(true);
        panel_2.add(textPrerequisites);

        // JButton for Add_NonAcademic
        Add_NonAcademic = new JButton("Add NonAcademic Course");
        Add_NonAcademic.setBounds(290, 220, 230, 30);
        Add_NonAcademic.setFont(new Font("Arial", Font.PLAIN, 15));
        Add_NonAcademic.setForeground(Color.BLACK);
        Add_NonAcademic.setBackground(Color.WHITE);
        panel_2.add(Add_NonAcademic);

        // JLabel for Register NonAcademic course
        Register = new JLabel("Register Course");
        Register.setBounds(30, 280, 380, 40);
        Register.setFont(new Font("Arial", Font.BOLD, 20));
        Register.setForeground(Color.black);
        panel_2.add(Register);

        // JLabel for CID_2
        CID_2 = new JLabel("Course ID:");
        CID_2.setBounds(30, 320, 380, 40);
        CID_2.setFont(new Font("Arial", Font.PLAIN, 15));
        CID_2.setForeground(Color.black);
        panel_2.add(CID_2);

        // JButton for CID_2
        textCID_2 = new JTextField();
        textCID_2.setBounds(150, 325, 200, 30);
        textCID_2.setFont(new Font("Arial", Font.PLAIN, 15));
        textCID_2.setEditable(true);
        panel_2.add(textCID_2);

        // JLabel for Course leader
        Courseleader_1 = new JLabel("Course leader:");
        Courseleader_1.setBounds(30, 380, 380, 40);
        Courseleader_1.setFont(new Font("Arial", Font.PLAIN, 15));
        Courseleader_1.setForeground(Color.black);
        panel_2.add(Courseleader_1);

        // JTextField for Course leader
        textCourseleader_1 = new JTextField();
        textCourseleader_1.setBounds(150, 380, 200, 30);
        textCourseleader_1.setFont(new Font("Arial", Font.PLAIN, 15));
        textCourseleader_1.setEditable(true);
        panel_2.add(textCourseleader_1);

        // JLabel for Instructor Name
        Instructorname = new JLabel("Instructor name:");
        Instructorname.setBounds(30, 440, 380, 40);
        Instructorname.setFont(new Font("Arial", Font.PLAIN, 15));
        Instructorname.setForeground(Color.black);
        panel_2.add(Instructorname);

        // JTextField for Instructorname
        textInstructorname = new JTextField();
        textInstructorname.setBounds(150, 440, 200, 30);
        textInstructorname.setFont(new Font("Arial", Font.PLAIN, 15));
        textInstructorname.setEditable(true);
        panel_2.add(textInstructorname);

        // JLabel for startdate_1
        startdate_1 = new JLabel("Start Date:");
        startdate_1.setBounds(400, 320, 380, 40);
        startdate_1.setFont(new Font("Arial", Font.PLAIN, 15));
        startdate_1.setForeground(Color.black);
        panel_2.add(startdate_1);

        Integer[] Date_2 = {
            1990,
            1991,
            1992,
            1993,
            1994,
            1995,
            1996,
            1997,
            1998,
            1999,
            2001,
            2003,
            2002
        };
        // JComboBox for js_date_2
        js_date_2 = new JComboBox(Date);
        js_date_2.setBounds(540, 325, 60, 25);
        panel_2.add(js_date_2);

        String[] months_2 = {
            "Janyary",
            "Februray",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "Octobor",
            "November",
            "December"
        };
        // JComboBox for j_months_2
        j_months_2 = new JComboBox(months);
        j_months_2.setBounds(610, 325, 80, 25);
        panel_2.add(j_months_2);

        String[] Day_2 = {
            "01",
            "02",
            "03",
            "04",
            "05",
            "06",
            "07",
            "08",
            "09",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31"
        };
        // JComboBox for js_day_2
        js_day_2 = new JComboBox(Day);
        js_day_2.setBounds(700, 325, 50, 25);
        panel_2.add(js_day_2);

        //JLabel for completiondate_1
        completiondate_1 = new JLabel("Completion Date:");
        completiondate_1.setBounds(400, 375, 380, 40);
        completiondate_1.setFont(new Font("Arial", Font.PLAIN, 15));
        completiondate_1.setForeground(Color.black);
        panel_2.add(completiondate_1);

        Integer[] Date_3 = {
            1990,
            1991,
            1992,
            1993,
            1994,
            1995,
            1996,
            1997,
            1998,
            1999,
            2001,
            2003,
            2002
        };
        // JComboBox for js_date_3
        js_date_3 = new JComboBox(Date);
        js_date_3.setBounds(540, 380, 60, 25);
        panel_2.add(js_date_3);

        String[] months_3 = {
            "Janyary",
            "Februray",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "Octobor",
            "November",
            "December"
        };
        // JComboBox for js_months_3
        js_months_3 = new JComboBox(months);
        js_months_3.setBounds(610, 380, 80, 25);
        panel_2.add(js_months_3);

        String[] Day_3 = {
            "01",
            "02",
            "03",
            "04",
            "05",
            "06",
            "07",
            "08",
            "09",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31"
        };
        //JComboBox for js_day_3
        js_day_3 = new JComboBox(Day);
        js_day_3.setBounds(700, 380, 50, 25);
        panel_2.add(js_day_3);

        //JLabel for Examdate
        Examdate = new JLabel("Exam Date:");
        Examdate.setBounds(400, 435, 380, 40);
        Examdate.setFont(new Font("Arial", Font.PLAIN, 15));
        Examdate.setForeground(Color.black);
        panel_2.add(Examdate);

        Integer[] Date_4 = {
            1990,
            1991,
            1992,
            1993,
            1994,
            1995,
            1996,
            1997,
            1998,
            1999,
            2001,
            2003,
            2002
        };
        //JComboBox for js_date_4
        js_date_4 = new JComboBox(Date);
        js_date_4.setBounds(540, 440, 60, 25);
        panel_2.add(js_date_4);

        String[] months_4 = {
            "Janyary",
            "Februray",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "Octobor",
            "November",
            "December"
        };
        //JComboBox for js_months_4
        js_months_4 = new JComboBox(months);
        js_months_4.setBounds(610, 440, 80, 25);
        panel_2.add(js_months_4);

        String[] Day_4 = {
            "01",
            "02",
            "03",
            "04",
            "05",
            "06",
            "07",
            "08",
            "09",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17",
            "18",
            "19",
            "20",
            "21",
            "22",
            "23",
            "24",
            "25",
            "26",
            "27",
            "28",
            "29",
            "30",
            "31"
        };
        //JComboBox for js_day_4
        js_day_4 = new JComboBox(Day);
        js_day_4.setBounds(700, 440, 50, 25);
        panel_2.add(js_day_4);

        // JButton for Add_Register_1
        Add_Register_1 = new JButton(" Register Course");
        Add_Register_1.setBounds(290, 510, 200, 30);
        Add_Register_1.setFont(new Font("Arial", Font.PLAIN, 15));
        Add_Register_1.setForeground(Color.BLACK);
        Add_Register_1.setBackground(Color.WHITE);
        panel_2.add(Add_Register_1);

        // JButton for Back_1
        Back_1 = new JButton("Back");
        Back_1.setBounds(40, 560, 90, 30);
        Back_1.setFont(new Font("Arial", Font.PLAIN, 15));
        Back_1.setForeground(Color.BLACK);
        Back_1.setBackground(Color.WHITE);
        panel_2.add(Back_1);

        // JButton for Display_1
        Display_1 = new JButton("Display_1");
        Display_1.setBounds(500, 560, 105, 30);
        Display_1.setFont(new Font("Arial", Font.PLAIN, 15));
        Display_1.setForeground(Color.BLACK);
        Display_1.setBackground(Color.WHITE);
        panel_2.add(Display_1);

        // JButton for Clear_1
        Clear_1 = new JButton("Clear");
        Clear_1.setBounds(610, 560, 90, 30);
        Clear_1.setFont(new Font("Arial", Font.PLAIN, 15));
        Clear_1.setForeground(Color.BLACK);
        Clear_1.setBackground(Color.WHITE);
        panel_2.add(Clear_1);

        // JButton for Remove
        Remove = new JButton("Remove");
        Remove.setBounds(160, 560, 110, 30);
        Remove.setFont(new Font("Arial", Font.PLAIN, 15));
        Remove.setForeground(Color.BLACK);
        Remove.setBackground(Color.RED);
        panel_2.add(Remove);

        //ActionListener is used
        Add_AC.addActionListener(this);
        Add_NoNAC.addActionListener(this);
        Add_Academic.addActionListener(this);
        Add_NonAcademic.addActionListener(this);
        Add_Register.addActionListener(this);
        Add_Register_1.addActionListener(this);
        Back.addActionListener(this);
        Back_1.addActionListener(this);
        Remove.addActionListener(this);
        Clear_1.addActionListener(this);
        Clear.addActionListener(this);
        Display.addActionListener(this);
        Display_1.addActionListener(this);
        Next.addActionListener(this);
        panel_2.setVisible(false);
        frame_1.setLayout(null);
        frame_1.add(panel_2);

    }
    //getters methods for Academic Course
    public String getCourse_ID() {
        return this.textCourse_ID.getText();
    }
    public String getCourseName() {
        return this.textCourseName.getText();
    }
    public int getDuration() {
        return Integer.parseInt(this.textDuration.getText());
    }
    public String getCredit() {
        return this.textCredit.getText();
    }
    public String getlevel() {
        return this.textlevel.getText();
    }
    public int getNoofAssessment() {
        return Integer.parseInt(this.textNoofAssessment.getText());
    }
    //getter method for RegisterAcademic Course
    public String getCID() {
        return this.textCID.getText();
    }
    public String getCourseleader() {
        return this.textCourseleader.getText();
    }
    public String getlecturename() {
        return this.textlecturename.getText();
    }
    public String getstartdate() {
        String startdate = js_date.getSelectedItem() + "" + js_day.getSelectedItem() + "" + j_months.getSelectedItem();
        return startdate;
    }
    public String getcompletiondate() {
        String completiondate = js_date_1.getSelectedItem() + "" + js_day_1.getSelectedItem() + "" + j_months_1.getSelectedItem();
        return completiondate;

    }
    //getter method for nonAcademic
    public String getCID_1() {
        return this.textCourse_ID_1.getText();
    }
    public String getCourseName_1() {
        return this.textCourseName_1.getText();
    }
    public int getDuration_1() {
        return Integer.parseInt(this.textDuration_1.getText());
    }
    public String getPrerequisites() {
        return this.textPrerequisites.getText();
    }
    // Getter method to REgister NonAcademic course
    public String getCourseleader_1() {
        return this.textCourseleader_1.getText();
    }
    public String getInstructorname() {
        return this.textInstructorname.getText();
    }
    public String getstartdate_1() {
        String startdate_1 = js_date_2.getSelectedItem() + "" + js_day_2.getSelectedItem() + "" + j_months_2.getSelectedItem();
        return startdate_1;
    }
    public String getcompletiondate_1() {
        String completiondate_1 = js_date_3.getSelectedItem() + "" + js_day_3.getSelectedItem() + "" + js_months_3.getSelectedItem();
        return completiondate_1;

    }
    public String getExamdate() {
        String Examdate = js_date_4.getSelectedItem() + "" + js_day_4.getSelectedItem() + "" + js_months_4.getSelectedItem();
        return Examdate;

    }
    public String getCID_2() {
        return this.textCID_2.getText();
    }
    //Action Performed method is used for the proper function of the buttons
    @Override
    public void actionPerformed(ActionEvent e) {
        // getActionCommand is used in order to returns the command string associated with this action
        String d = e.getActionCommand();
        // Codes which were used to change the panel using the buttons
        if (e.getSource() == Add_AC) {
            panel_1.setVisible(true);
            panel.setVisible(false);
            frame_1.setSize(780, 650);
        } else if (e.getSource() == Back) {
            panel_1.setVisible(false);
            panel.setVisible(true);
            frame_1.setSize(550, 200);
        } else if (e.getSource() == Add_NoNAC) {

            panel.setVisible(false);
            panel_2.setVisible(true);
            frame_1.setSize(780, 650);
        } else if (e.getSource() == Back_1) {
            panel_1.setVisible(true);
            panel_2.setVisible(false);
            frame_1.setSize(780, 650);

        } else if (e.getSource() == Next) {
            panel_1.setVisible(false);
            panel_2.setVisible(true);
            frame_1.setSize(780, 650);

        } else if (d.equals("Add Academic Course")) {
            int b = 0;
            for (Course a: ingArray) { //for each loop
                if (getCourse_ID().equals(a.getCourseID())) {
                    JOptionPane.showMessageDialog(panel_1, "Coures ID has been already added", "ERROR", JOptionPane.ERROR_MESSAGE);
                    b = 1;
                }
            }

            if (getCourse_ID().isEmpty() || getCourseName().isEmpty() || getlevel().isEmpty() || getCredit().isEmpty() || getstartdate().isEmpty() || getcompletiondate().isEmpty()) {
                JOptionPane.showMessageDialog(panel_1, "Fill the requirement", "ERROR", JOptionPane.ERROR_MESSAGE);
                b = 1;
            }
            if (b == 0) {
                // Expection handling is done 
                try {
                    getDuration();

                    try {
                        getNoofAssessment();
                    } catch (NumberFormatException exp) {
                        JOptionPane.showMessageDialog(frame_1, "Please  fill the information No.of Aassessment", "ALERT", JOptionPane.ERROR_MESSAGE);
                        b = 1;
                    }
                } catch (NumberFormatException exp) {
                    JOptionPane.showMessageDialog(frame_1, "Please  fill the  information for duration", "ALERT", JOptionPane.ERROR_MESSAGE);
                    b = 1;
                }

                if (b == 0) {
                    ingArray.add(new Academic_Course(getCourse_ID(), getCourseName(), getDuration(), getlevel(), getCredit(), getNoofAssessment()));
                    JOptionPane.showMessageDialog(frame_1, "Course_ID:" + getCourse_ID() + "\n" + "CourseName:" + getCourseName() + "\n" + "Duration:" + getDuration() +
                        "\n" + "level:" + getlevel() + "\n" + "Credit:" + getCredit() + "\n" + "NoofAssessment:" + getNoofAssessment() + "\n Successfully added");
                }
            }

        } else if (d.equals("Add Register Course")) {
            int b2 = 0;
            if (getCID().isEmpty() || getCourseleader().isEmpty() || getlecturename().isEmpty() || getstartdate().isEmpty() || getcompletiondate().isEmpty()) {
                JOptionPane.showMessageDialog(panel_1, "Fill the requirement", "ERROR", JOptionPane.ERROR_MESSAGE);
                b2 = 1;
            } else {
                for (Course a: ingArray) {
                    if (a.getCourseID().equals(getCID()) && a instanceof Academic_Course) {
                        Academic_Course ac_obj = (Academic_Course) a;
                        if (ac_obj.getisRegistered() == true) {
                            JOptionPane.showMessageDialog(frame_1, "The Course has been alredy registered");
                            break;
                        } else if (ac_obj.getisRegistered() == false) {
                            ac_obj.register(getCourseleader(), getlecturename(), getstartdate(), getcompletiondate());
                            JOptionPane.showMessageDialog(panel_1, "CourseID:" + getCID() + "\n" + "Courseleader:" + getCourseleader() + "\n" + "lecture Name" + getlecturename() + "\n" + "Start date" + getstartdate() + "\n" + "Complete date" + getcompletiondate());
                            break;
                        } else {
                            JOptionPane.showMessageDialog(panel_1, "Please enter the correct Course Id", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }

                    }

                }
            }
        } else if (d.equals("Add NonAcademic Course")) {

            int b3 = 0;
            if (getCID_1().isEmpty() || getCourseName_1().isEmpty() || getPrerequisites().isEmpty()) {
                JOptionPane.showMessageDialog(panel_2, "Fill the requirement", "ERROR", JOptionPane.ERROR_MESSAGE);
                b3 = 1;
            }
            if (b3 == 0)
                for (Course a: ingArray) {
                    if (getCID_1().equals(a.getCourseID())) {
                        JOptionPane.showMessageDialog(panel_2, "Non-Academic Course has been already added", "ERROR", JOptionPane.ERROR_MESSAGE);
                        b3 = 1;
                    }
                }
            if (b3 == 0) {
                // Expection handling is done 
                try {
                    getDuration_1();
                } catch (NumberFormatException exp) {
                    JOptionPane.showMessageDialog(panel_2, "Please  fill the  duartion", "ERROR", JOptionPane.ERROR_MESSAGE);
                    b3 = 2;
                }
            }
            if (b3 == 0) {
                ingArray.add(new NonAcademicCourse(getCID_1(), getCourseName_1(), getDuration_1(), getPrerequisites()));
                JOptionPane.showMessageDialog(panel_2, "CourseID:" + getCID_1() + "\n" + "CourseName:" + getCourseName_1() + "\n" + "Duration:" + getDuration_1() +
                    "\n Successfully added");
            }

        } else if (d.equals(" Register Course")) {
            int b4 = 0;
            if (getCID_1().isEmpty() || getCourseleader_1().isEmpty() || getInstructorname().isEmpty() || getstartdate_1().isEmpty() || getcompletiondate_1().isEmpty() || getExamdate().isEmpty()) {
                JOptionPane.showMessageDialog(panel_2, "Fill all the requirement", "ERROR", JOptionPane.ERROR_MESSAGE);
                b4 = 1;
            } else {
                for (Course a: ingArray) {
                    if (a.getCourseID().equals(getCID_2()) && a instanceof NonAcademicCourse) {
                        NonAcademicCourse Nac_obj = (NonAcademicCourse) a;

                        if (Nac_obj.getisRegistered() == true) {
                            JOptionPane.showMessageDialog(panel_2, "The Course has been alredy registered");
                            break;
                        } else if (Nac_obj.getisRegistered() == false) {
                            Nac_obj.Register(getCourseleader_1(), getInstructorname(), getstartdate_1(), getcompletiondate_1(), getExamdate());
                            JOptionPane.showMessageDialog(panel_2, "CourseID:" + getCID_2() + "\n" + "Courseleader:" + getCourseleader_1() + "\n" + "InstructorName:" + getInstructorname() + "\n" + "StartDate" + getstartdate_1() + "\n" + "CompleteDate:" + getcompletiondate_1() + "\n" + "ExamDate:" + getExamdate());
                            break;
                        }

                    }

                }

            }
        }
        //display for  Academic Course
        else if (d.equals("Display")) {
            for (Course a: ingArray) {
                if (a instanceof Academic_Course) {
                    Academic_Course ac_obj = (Academic_Course) a;
                    System.out.println("");
                    ac_obj.display();
                }
            }
        }
        //displaying Non Academic Course
        else if (d.equals("Display_1")) {
            for (Course a: ingArray) {
                if (a instanceof NonAcademicCourse) {
                    NonAcademicCourse Nac_obj = (NonAcademicCourse) a;
                    System.out.println("");
                    Nac_obj.display();
                }
            }
        }
        //Remove for Non-Academic course
        else if (d.equals("Remove")) {

            for (Course a: ingArray)

            {
                if (a.getCourseID().equals(getCID_2()) && a instanceof NonAcademicCourse) {
                    NonAcademicCourse Nac_obj = (NonAcademicCourse) a;
                    int b5 = 0;
                    if (Nac_obj.getisRemoved() == true) {
                        JOptionPane.showMessageDialog(panel_2, "The Course ID:" + getCID_2() + "has been already removed", "ERROR", JOptionPane.ERROR_MESSAGE);
                        b5 = 1;
                    } else if (Nac_obj.getisRemoved() == false) {
                        Nac_obj.remove();
                        System.out.println("");
                        JOptionPane.showMessageDialog(panel_2, "NonAcademicCourse " + getCID_2() + "The Course has been Successfully removed ", "ERROR", JOptionPane.ERROR_MESSAGE);
                        b5 = 2;
                    }

                }

            }

        } //Clear for Academic Course
        else if (d.equals("Clear")) {
            textCourse_ID.setText("");
            textlevel.setText("");
            textCourseName.setText("");
            textNoofAssessment.setText("");
            textDuration.setText("");
            textCredit.setText("");
            textCID.setText("");
            textCourseleader.setText("");
            textlecturename.setText("");
            js_date.setSelectedIndex(0);
            j_months.setSelectedIndex(0);
            js_day_1.setSelectedIndex(0);
            js_date_1.setSelectedIndex(0);
            j_months_1.setSelectedIndex(0);
            js_day_1.setSelectedIndex(0);

            textCourse_ID_1.setText("");
            textCourseName_1.setText("");
            textDuration_1.setText("");
            textPrerequisites.setText("");
            textCID_2.setText("");
            textCourseleader_1.setText("");
            textInstructorname.setText("");
            js_date_2.setSelectedIndex(0);
            js_months_3.setSelectedIndex(0);
            js_day_3.setSelectedIndex(0);
            js_date_1.setSelectedIndex(0);
            j_months_1.setSelectedIndex(0);
            js_day_1.setSelectedIndex(0);
        }

    }

}