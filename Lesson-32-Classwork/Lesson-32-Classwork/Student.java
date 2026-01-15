class Student{

  
  String firstName;
  int gradeLevel;
  double gpa;
  double[] grades;

  String[] courses = {};

  
  Student(String firstName, int gradeLevel, double gpa, 
          double[] grades, string[] courses){
    
    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
    this.grades     = grades;

    this.courses = courses;


  }


  checkCourse(String course) {
    for (class : courses) {
      if (class.equalsIgnoreCase(course)) {
        return true;
      }
    }

    return false;
  }
  // class functions

  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1;x++){
      sum+=this.grades[x];
    }
    return sum/this.grades.length;
  }

  
}