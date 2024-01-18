class courseClass {
String studentName;
    String courseName;
String [] enrolledstudents;

  
    int enrollments;
  
static int maxCapacity=100;


static void setMaxCapacity(int maxCapacity){
    courseClass.maxCapacity=maxCapacity;
}

courseClass(String courseName){
this.courseName=courseName;
this.enrollments=0;
this.enrolledstudents=new String[maxCapacity];
}
void enrollStudents(String studentName){
    enrolledstudents[enrollments]=studentName;
    enrollments++;
    System.out.println("yes, one student "+ studentName + " is enrolled");
    System.out.println(enrollments);
   
}
 void unenrollStudents(int capacity){
    System.out.println("student removed");
   enrollments--;
   System.out.println(enrollments);
}
public static void main(String[] args) {
    courseClass bca=new courseClass("MCA");
   bca.enrollStudents("sumit");
   bca.unenrollStudents(5);
}

}
