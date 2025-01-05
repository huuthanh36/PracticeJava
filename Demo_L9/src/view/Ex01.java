
package view;

import bean.Student;
import static common.Grade.*;

public class Ex01 {
    
    public static void main(String[] args) {
        Student[] students = {
            new Student(102, "Nam", C),
            new Student(103, "Bảo", F),
            new Student(104, "Hoàng", D),
            new Student(105, "Nguyên", B),
            new Student(107, "Vũ", F),
            new Student(109, "Lan", A),
            new Student(202, "Đạt", C),
            new Student(103, "Bảo", F),
            new Student(107, "Vũ", C),
            new Student(104, "Hoàng", B)
        };
        
        //1. Tìm danh sách sinh viên từng đạt loại A trong năm 
        Student[] gradeStudents = findGradeAStudents(students);
        System.out.println("1. Danh sách sinh viên đạt loại A");
        for(Student student : gradeStudents){
            System.out.println(student);
        }
        
        //2. Danh sách sinh viên đã học laij
        Student[] retakeStudents = findRetakeStudents(students);
        System.out.println("2. Danh sách sinh viên đã học lại ");
        for(Student student : retakeStudents){
            System.out.println(student);
        }
    
    }
    // Tìm danh sách sinh viên đạt loại A trong năm 
    private static Student[] findGradeAStudents(Student[] students){
        int count =0;
        for(Student student : students){
            if(student.getGrade() == A){
                count++;
            }
        }
        Student[] gradeAStudents = new Student[count];
        int index = 0;
        for(Student student : students){
            if(student.getGrade() == A){
                gradeAStudents[index++] = student;
            }
        }
        return gradeAStudents;
    }
    // Tìm danh sách sinh viên phải học lại
    private static Student[] findRetakeStudents(Student[] students){
        int count =0;
        for(Student student : students){
            if(student.getGrade() == F){
                count++;
            }
        }
        Student[] retakeStudents = new Student[count];
        int index = 0;
        for(Student student : students){
            if(student.getGrade() == F){
                retakeStudents[index] = student;
            }
        }
        return retakeStudents;
    }
    
    
    
//    private static Student[] getStudents(Student[] students){
//        Student[] result = new Student[students.length];
//        int count = 0;
//        for(Student student : students){
//            if(student.getRank()== A){
//                result[count++] = student;
//            }
//        }
//        return result;
//    }
    
//    private static Student[] mockData(){
//        return new Student[] {
//            new Student(102, "Nam", C),
//            new Student(103, "Bảo", F),
//            new Student(104, "Hoàng", D),
//            new Student(105, "Nguyên", B),
//            new Student(107, "Vũ", F),
//            new Student(109, "Lan", A),
//            new Student(202, "Đạt", C),
//            new Student(103, "Bảo", F),
//            new Student(107, "Vũ", C),
//            new Student(104, "Hoàng", B),
//        };
//        
//    }
}
