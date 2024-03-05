package java_02.Quiz0506;

public class ChileExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
  /*
   parent.field2 = "data2"; //(불가능)
   parent.method3(); //(불가능)
  */

    }
}
