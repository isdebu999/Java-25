package Debu_Stuff.XX_Interview_Pre.StaticKeyWord;

class Employee {
    String name;
    int age;
    static String companyName = "XYZ pvt Ltd";


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Company: " + companyName);
    }

    public static void changeCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }
}
public class StaticMethodExplain {
    public static void main(String[] args) {

        Employee e1 = new Employee("John", 30);
        Employee e2 = new Employee("Alice", 25);

        e1.displayInfo();
        e2.displayInfo();

        System.out.println("######## After Change the Company Name! ########");
        Employee.changeCompanyName("ABC pvt Ltd!");

        e1.displayInfo();
        e2.displayInfo();
    }
}
