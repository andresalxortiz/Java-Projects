class Teacher {
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void printName() {
    System.out.println("My name is "+firstName+" "+lastName+".");
  }

  // The OnePublicClass function will not be able to directly access these members.
  private String firstName, lastName;
}

public class OnePublicClass {
  public static void main(String[] args) {
    Teacher t = new Teacher(); // Declares and initializes an object of type Teacher. 

    t.setFirstName("Professor");
    t.setLastName("Billy");
    t.printName();
    System.out.println("I am here to tell you, 't.firstName' and 't.lastName' won't work.");
  }
}
