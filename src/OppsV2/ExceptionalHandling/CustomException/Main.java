package OppsV2.ExceptionalHandling.CustomException;


class GraduationAgeException extends Exception{
    public GraduationAgeException(String message){
        super(message);
    }
}

class Student {
    int age;

    public Student(int age) {
        this.age = age;
    }

    public void verifyAge() throws GraduationAgeException {
        if(this.age < 18){
            throw new GraduationAgeException("Student admission is denied! Must be 18 years old!");
        }else{
            System.out.println("Welcome Student !");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(10);
        Student s2 = new Student(20);

        try{
            s1.verifyAge();
        } catch (GraduationAgeException e) {
            System.out.println(e.getMessage());
        }


        try {
            s2.verifyAge();
        }catch (GraduationAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
