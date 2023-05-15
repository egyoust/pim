package idusw.java.fundmentals.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeTst {
    public static void main(String[] args) {
        System.out.println(Long.toHexString(3456789123L)); // long type literal
        float f = 123.3f;
        String ko = "인덕대학교 컴퓨터소프트웨어학과";
        String en = "Induk University, Dept. of Computer Software";

        int idx = en.indexOf("Dept");
        System.out.println(en.substring(idx, idx+4));

        System.out.println(ko.substring(6, 9));
        if(en.contains("comso"))
            System.out.println("true");
        else
            System.out.println("false");
        /*
        List<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받아 지정된 유형으로 반환
        int count = 0;

        do {
            System.out.println("학번 : ");
            Long id = sc.nextLong(); // 숫자문자열이어야 함. Long.valueOf("200412000L");
            System.out.println("이름 : ");
            String name = sc.next();
            System.out.println("국어 : ");
            Double korean = sc.nextDouble(); // 인스턴스 변수의 경우 초기화를 하지 않는 경우 기본값으로 초기화함
            System.out.println("수학 : ");
            Double math = sc.nextDouble();
            System.out.println("물리 : ");
            Double physics = sc.nextDouble();

            Grade grade = new Grade(korean, math, physics);
            Student student = new Student(id, name, grade);

            studentList.add(student);
            count++;
        } while(count < 5);

        for(Student student : studentList) {
            Grade grade = student.getGrade();
            System.out.format("%10d %10s %7.2f %7.2f\n",
                    student.getHakbun(),student.getName(), grade.calcSum(), grade.calcAverage());
        }

        */
    }
}
