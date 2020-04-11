public class TwoPublicClasses {
  public static void main(String[] args) {
    Student s = new Student();

    s.setStudentNumber(1);
    s.print();

    System.out.println("You can have two public classes in two separate files.");
    System.out.println("As long as both files are in the same directory, they will be able to compile together.");
  }
}
