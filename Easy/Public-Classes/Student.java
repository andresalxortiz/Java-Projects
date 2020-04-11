public class Student{
  public void setStudentNumber(int value) {
    this.value = value;
  }

  public void print() {
    System.out.println("Do not refer to me as student #"+value+". I have a name.");
  }

  private int value;
}
