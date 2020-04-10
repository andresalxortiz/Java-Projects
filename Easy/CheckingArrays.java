public class Teacher {
  public static void main(String[] args) {
    int[] arr = new int[10];

    System.out.println("The length of the array: " + arr.length);

    for(int i = 0; i < arr.length; i++) {
      arr[i] = 100 - i;
      System.out.println("At index "+ i + ": " + arr[i]);
    }
  }
}
