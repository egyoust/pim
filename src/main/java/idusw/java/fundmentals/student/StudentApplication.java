package idusw.java.fundmentals.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApplication {
    public static void main(String[] args) {
        /**
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
        */
        List<Student> studentList = new ArrayList<>(); // ArrayList vs. Vector
        Scanner sc = new Scanner(System.in); // 키보드 입력을 받아 지정된 유형으로 반환
        int count = 0;
        do {
            System.out.println("입력하시오 " + count +  " >> 학번,이름,국어,수학,물리");
            String input = sc.next(); // 한줄로 
            String[] tokens = input.split(","); // , 를 구분자로 활용 String 배열 객체로 반화
            /*
            for(String token: tokens)
                System.out.println(token);
            */
            Long id = Long.valueOf(tokens[0].trim()); // 숫자문자열이어야 함. Long.valueOf("200412000L");
            String name = tokens[1].trim();
            Double korean = Double.valueOf(tokens[2].trim()); // 인스턴스 변수의 경우 초기화를 하지 않는 경우 기본값으로 초기화함
            Double math = Double.valueOf(tokens[3].trim());
            Double physics = Double.valueOf(tokens[4].trim());

            Grade grade = new Grade(korean, math, physics);
            Student student = new Student(id, name, grade);

            studentList.add(student);
            count++;
        } while(count < 3);
        System.out.format("%10s %10s %7s %7s\n", "학번", "이름", "총점", "평균");
        for(Student student : studentList) {
            Grade grade = student.getGrade();
            System.out.format("%10d %10s %7.2f %7.2f\n",
                    student.getHakbun(),student.getName(), grade.calcSum(), grade.calcAverage());
        }
    }
}
