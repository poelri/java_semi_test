package java_02.Quiz0102;

public class Student {

    String name = "김철수"; //학생 이름
    int ban = 1;   //반
    int no = 10;   //번호
    int kor = 90;  //국어점수
    int eng = 70;  //영어점수
    int math = 85; //수학점수
    int getTotal;
    double getAverage;

    public int getGetTotal() {
        getTotal = kor +eng + math;
        return getTotal;
    }

    public double getGetAverage() {
        getAverage = (double) getTotal / 3;
        return getAverage;
    }

    @Override
    public String toString() {
        return "이름 : " + name + "," + " 반 : " + ban +","+ " 번호 : " + no +"";
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.toString());
    }

}
