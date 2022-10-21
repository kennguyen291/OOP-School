import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Khang", "Nguyen");
        Student student2 = new Student(2, "Dung", "Bui");

        Class class1 = new Class(1, "10a7");
        Class class2 = new Class(2, "10a6");

        student1.setClassId(class1.getId());
        student2.setClassId(class1.getId());

        Teacher teacher1 = new Teacher(1, "Tony","Teo");
        Teacher teacher2 = new Teacher(2, "Jaden","Tran");

        class1.setPrimaryTeacherId(1);
        class2.setPrimaryTeacherId(2);

        Subject toan = new Subject(1, "Toan");
        Subject van = new Subject(2, "Van ");
        Subject anh = new Subject(3, "Anh ");

        ExamType muoiLamPhut = new ExamType(1, "15", 1);
        ExamType motTiet = new ExamType(2, "45", 1);
        ExamType mid = new ExamType(3, "Mid", 2);
        ExamType finalExam = new ExamType(4, "Final", 2);

        Semester sem1 = new Semester(1, "HK1 22", 1);
        Semester sem2 = new Semester(2, "HK2 22", 1);
        Semester sem3 = new Semester(3, "HK1",2);
        Semester sem4 = new Semester(4, "HK2",2);

        Year year1 = new Year(1, "2022-2023");
        Year year2 = new Year(2, "2023-2024");
        Year year3 = new Year(3, "2024-2025");

        Student[] students = {student1, student2};
        Class[] classes = {class1, class2};
        Subject[] subjects = {toan, van, anh};
        ExamType[] examTypes = {muoiLamPhut, motTiet, mid, finalExam};
        Semester[] semesters = {sem1, sem2, sem3, sem4};
        Year[] years = {year1, year2, year3};
        Teacher[] teachers = {teacher1, teacher2};

        Exam[] exams = new Exam[24];
        //Khang - Toan - HK1 - 2022
        exams[0] = new Exam(1, 1, 1, 1, 1, 4.0);
        exams[1] = new Exam(2, 1, 1, 2, 1, 5);
        exams[2] = new Exam(3, 1, 1, 3, 1, 6);
        exams[3] = new Exam(4, 1, 1, 4, 1, 7);

        //Khang - Van - HK1 - 2022
        exams[4] = new Exam(5, 1, 2, 1, 1, 5.0);
        exams[5] = new Exam(6, 1, 2, 2, 1, 5.0);
        exams[6] = new Exam(7, 1, 2, 3, 1, 5.0);
        exams[7] = new Exam(8, 1, 2, 4, 1, 5.0);

        //Khang - Anh - Hk1
        exams[8]  = new Exam(9, 1, 3, 1, 1, 6.0);
        exams[9]  = new Exam(10, 1, 3, 2, 1, 6.0);
        exams[10] = new Exam(11, 1, 3, 3, 1, 6.0);
        exams[11] = new Exam(12, 1, 3, 4, 1, 6.0);

        //Khang - Toan - HK2
        exams[12]= new Exam(13, 1, 1, 1, 2, 4.0);
        exams[13] = new Exam(14, 1, 1, 2, 2, 4.0);
        exams[14] = new Exam(15, 1, 1, 3, 2, 4.0);
        exams[15]= new Exam(16, 1, 1, 4, 2, 4.0);

        //Khang - Van - HK2
        exams[16]= new Exam(17, 1, 2, 1, 2, 8.0);
        exams[17]= new Exam(18, 1, 2, 2, 2, 8.0);
        exams[18] = new Exam(19, 1, 2, 3, 2, 8.0);
        exams[19] = new Exam(20, 1, 2, 4, 2, 8.0);

        //Khang - Anh - HK2
        exams[20]  = new Exam(21, 1, 3, 1, 2, 9.0);
        exams[21] = new Exam(22, 1, 3, 2, 2, 9.0);
        exams[22]= new Exam(23, 1, 3, 3, 2, 9.0);
        exams[23]= new Exam(24, 1, 3, 4, 2, 9.0);

        getPointsheetByStudentId(1, students, teachers ,classes, subjects, examTypes, semesters, exams, years, 1);


    }

    public static String getStudentNameByStudentId(int studentId, Student[] students){
        String studentName = "";
        for (Student student: students) {
            if (studentId == student.getId()){
                studentName = student.getFirstName() + " " +student.getLastName();
            }
        }
        return  studentName;
    }

    public static String getYearById(int yearId, Year[] years){
        String yearName = "";
        for (Year year: years) {
            if (yearId == year.getId()){
                yearName = year.getYearName();
            }
        }
        return yearName;
    }

    public static String getClassByStudentId(int studentId, Student[] students, Class[] classes){
        int classId = 0;
        String className = " ";
        for (Student student: students) {
            if (studentId == student.getId()){
                classId = student.getClassId();
            }
        }
        for (Class classElement: classes) {
            if (classId == classElement.getId()){
                className = classElement.getClassName();
            }
        }
        return className;
    }

    public static String getPrimaryTeacherByStudentId(int studentId, Student[] students, Class[] classes, Teacher[] teachers){
        int classId = 0;
        int primaryTeacherId = 0;
        String primaryTeacherName = "";
        for (Student student: students) {
            if (studentId == student.getId()){
                classId = student.getClassId();
            }
        }
        for (Class classElement: classes) {
            if (classId == classElement.getId()){
                primaryTeacherId = classElement.getPrimaryTeacherId();
            }
        }
        for (Teacher teacher: teachers) {
            if (primaryTeacherId == teacher.getId()){
                primaryTeacherName = teacher.getFirstName() + " " + teacher.getLastName();
            }
        }
        return primaryTeacherName;
    }

    public static void getSemesterByYearId (int yearId, List<Semester> semesters){
        System.out.print("                  ");
        for (Semester semester:semesters) {
            if (yearId == semester.getYearId()){
                System.out.print(semester.getSemesterName()+ "                     ");
            }
        }
    }

    public static List<Semester> getSemeseterExistedByYearId (int yearId, Semester[] semesters){

        List<Semester> semList = new ArrayList<>();
            for (Semester semester: semesters) {
                if (semester.getYearId() == yearId){
                    semList.add(semester);
                }
            }

        for (Semester semester: semList) {
            System.out.println(semester.getSemesterName());
        }
        return semList;
    }
    public static void getPointsheetByStudentId(int studentId, Student[] students, Teacher[] teachers ,Class[] classes, Subject[] subjects, ExamType[] examTypes, Semester[] semesters, Exam[] exams, Year[] years, int yearId){
        //LAY RA NHUNG SEMESTER TON TAI TRONG NAM DO
        List<Semester> semesterInThisYear = getSemeseterExistedByYearId(yearId, semesters);

        // HIEN THI NHUNG THONG TIN CO BAN
        System.out.println("POINT SHEET");
        System.out.println("Student: " + getStudentNameByStudentId(studentId, students));
        System.out.println("School Year: " + getYearById(yearId, years));
        System.out.println("Class: " + getClassByStudentId(studentId, students, classes));
        System.out.println("Primary Teacher: " + getPrimaryTeacherByStudentId(studentId, students, classes, teachers));

        // HIEN THI NHUNG SEMESTER TRONG NAM
        for ( Semester semester: semesterInThisYear) {
            System.out.print("               ");
            System.out.print(semester.getSemesterName()+ "    ");
        }
        System.out.println("\n");

        //HIEN THI NHUNG LOAI EXAM
        System.out.print("          ");
        for (int i = 0; i < 2; i++){
            for (ExamType type:examTypes) {
                System.out.print(type.getName()+ "  ");
            }
            System.out.print("     ");
        }
        System.out.print("Average");
        System.out.println("\n");

        //HIEN THI DIEM EXAM CUA TUNG MON + TINH AVERAGE POINT CUA TUNG MON + TINH AVERAGE POINT CUA TAT CA CAC MON
        int numberOfSubject = 0;
        double allSubjectAveragePoint = 0;
        //LOOP QUA TUNG SUBJECT
        for (Subject subject: subjects) {
            numberOfSubject ++;
            //TINH DIEM AVERAGE POINT CUA SUBJECT DO
            double subjectAveragePoint = calculateAverageBySubject(studentId, subject, exams, semesterInThisYear, examTypes);
            allSubjectAveragePoint = allSubjectAveragePoint + subjectAveragePoint;
            System.out.print(subject.getName() + ":    ");

            //HIEN THI DIEM CUA CAC EXAM CUA SUBJECT DO
            getAllPointBySubjectIdAndStudentIdAndYearId(studentId, subject.getId(), yearId, exams, semesterInThisYear);
            System.out.print(" " + subjectAveragePoint);
            System.out.println("\n");
        }
        System.out.println("Average point: " + Math.round((allSubjectAveragePoint / numberOfSubject) * 100.0) / 100.0);
        System.out.println("Grade: " + getGrade(allSubjectAveragePoint / numberOfSubject));
    }

    public static String getGrade(double point){
       if(point < 5){
           return "Failed";
       } else if (point > 7){
           return "Gioi";
       } else return "Trung Binh";
    }

    // DO HE SO NAM TRONG EXAM-TYPE NEN EM PHAI REFERENCE DEN ROI LAY RA
    public static int getHesoForExam (Exam exam, ExamType[] examTypes){
        int examHeso = 0;
        for (ExamType examType: examTypes) {
            if (exam.getExamTypeId() == examType.getId()){
                examHeso = examType.getHeSo();
            }
        }
        return examHeso;
    }

    public static double calculateAverageBySubject(int studentId, Subject subject, Exam[] exams, List<Semester> semesters, ExamType[] examTypes){
        double total = 0;
        int numberOfElement = 0;
        for (Semester semester: semesters){
            for (Exam exam: exams) {
                if (exam.getStudentId() == studentId && exam.getSubjectId() == subject.getId() && exam.getSemesterId() == semester.getId()){
                    int examHeso = getHesoForExam(exam, examTypes);
                    total = total + exam.getPoint() * examHeso;
                    numberOfElement = numberOfElement + examHeso;
                }
            }
//            System.out.println("total debug: " + total);
//            System.out.println("number debug: "+numberOfElement);
        }
        return Math.round((total / numberOfElement) * 100.0) / 100.0 ;
//            return total / numberOfElement;
    }



    public static void getAllPointBySubjectIdAndStudentIdAndYearId(int studentId, int subjectId, int yearId, Exam[] exams, List<Semester> semesters){
        for (Semester semester: semesters) {
            if ( yearId == semester.getYearId()){
                for (Exam exam : exams) {
                    if (exam.getStudentId() == studentId && exam.getSubjectId() == subjectId && exam.getSemesterId() == semester.getId()) {
                        System.out.print(exam.getPoint() + "  ");
                    }
                }
            }
            System.out.print("     ");

        }

    }




}