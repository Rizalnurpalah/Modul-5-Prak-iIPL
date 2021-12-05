/**
 * @(#)Course.java
 *
 *
 * @author  M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/11/29
 */


import java.util.Vector;
import java.util.Enumeration;

public class Course {
     private String title;
     private Vector courseRecords;
      Course() {
       courseRecords=new Vector();
      }
     public String getTitle() {return title;}
     public void setTitle( String t) {title=t;}
     public void addCourseRecord(CourseRecord cr) {
     courseRecords.addElement(cr);
     }

     public Enumeration getCourseRecords() {
      return courseRecords.elements();
     }

    public void printCourseStudents(){
     /*
     */
    }
    public void printBestStudent(){
     /*
     */
    }
