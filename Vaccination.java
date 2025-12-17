
abstract class Vaccine {

    int age;
    String nationality;

  
    Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

 
    void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("User is eligible for First Dose");
            System.out.println("Amount to be paid: 250");
        } else {
            System.out.println("User is NOT eligible for First Dose");
        }
    }

  
    void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("User is eligible for Second Dose");
        } else {
            System.out.println("Complete First Dose before taking Second Dose");
        }
    }

  
    abstract void boosterDose();
}


class VaccinationSuccessful extends Vaccine {

    VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

   
    @Override
    void boosterDose() {
        System.out.println("Booster Dose Successfully Completed");
    }
}


public class Vaccination {

    public static void main(String[] args) {

        
        int age = 18;
        String nationality = "Indian";

        VaccinationSuccessful v = new VaccinationSuccessful(age, nationality);

        
        v.firstDose();
        v.secondDose(true);
        v.boosterDose();
    }
}