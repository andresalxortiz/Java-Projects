Java
=======
## <ins>Java Projects</ins>
**The purpose of this repository is to learn how to code in `Java`.**
- The goal is not for the projects to get more difficult, but to get more ***creative***.

### How to start:
<ins>For Windows users</ins>:
1) Download Java SE Development Kit 14 or the latest release: https://www.oracle.com/java/technologies/javase-downloads.html
2) If using Windows 10 go to `Control Panel` -> `System and Security` -> `System` and then click on `Advanced system settings`.
3) In the `Advanced` tab go to `Environment Variables...`.
4) Click `New...` under `System Variables` and add a new path.
5) Add whatever **variable name** you want in order to distinguish those files.
6) **variable value** should be the path to your directory which contains the Java kit. For example: `C:\Program Files\Java\jdk-14`
7) Click `OK` and verify if the path has been created.
8) Under `System Variables` click on `Path` and click `Edit...`.
9) Click `New...` and add your new variable by typing the following `%[insert variable name]%\bin`.
10) Click `OK` and you should be able to run Java and Javac from your Command Prompt.

### How to compile:
1) Create a program.
1) Open Command Prompt.
2) Change current directory to the directory containing Java. `cd C:\Program Files\Java`.
3) Enter the following: `javac [name of program].java`.
4) It will have generated a `.class` file. To verify enter  `dir` in the command line.
5) To run the program enter the following: java [name of program]. (If you created a program such as 'test.java,' then simply write 'java test').
6) Congratulations your ran your first program.

### Sources:
- For a more in-depth tutorial go to this online tutorial written by ***Nam Ha Minh***:
https://www.codejava.net/java-core/how-to-write-compile-and-run-a-hello-world-java-program-for-beginners
- For documentations or help troubleshooting:
https://docs.oracle.com/en/java/javase/14/index.html
