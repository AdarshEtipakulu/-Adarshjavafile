 class Student {
    // 1. Private fields (Data Hiding)
    private String rollNo; // Corrected to use 'rollNo' for consistency (lowercase 'r')
    private String name;
    private int age;

    // Setter method (Controlled Write Access)
    public void setData(String x, String y, int z) {
        // Corrected assignment to use the private field name 'rollNo'
        this.rollNo = x; 
        this.name = y;
        this.age = z;
    }

    // Getter methods (Controlled Read Access)
    public String getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ExampleEncapsulation {
    public static void main(String args[]) {
        Student s = new Student();
        
        // Use the setter method to initialize private data
        s.setData("23AK1A0501", "balu", 20);

        // Use the getter methods to read the private data
        System.out.println("The student roll no: " + s.getRollNo());
        // Corrected method call: s.getName()
        System.out.println("The student name: " + s.getName()); 
        // Corrected method call: s.getAge()
        System.out.println("The student age: " + s.getAge()); 
    }
}
