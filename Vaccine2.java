public static void main(String[] args) {
    user u = new user(18, "indian");
    if (u.firstDose()) {
      u.booosterDose();
    }
    
  }

}

abstract class vaccine {
  int age;
  String nationality;

  public vaccine(int age, String nationality) {
    this.age = age;
    this.nationality = nationality;
  }

  boolean firstDose() {
    if (age >= 18 && nationality.equals("indian")) {
      System.out.println("Your first dose is successfull . now pay 250 RS");
      secondDose();
      return true;
    }
    return false;
  }

  void secondDose() {
    System.out.println("your second dose is successfull");
  }
}

class user extends vaccine {
  public user(int age, String nationality) {
    super(age, nationality);

  }
