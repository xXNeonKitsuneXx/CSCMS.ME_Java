class Student {
    private int idA;
    private String nameA;
    private char genderA;
    private int scoreA;
/////////////////////////////////////////////////////////////////////////////////////////
    public Student (int id, String name, char gender, int score){
        idA = id;
        nameA = name;
        genderA = gender;
        scoreA = score;
    }
///////////////////////////////////////////////////////////////////////////////////////////
    public char calGPA(){
        char GPA;
        if (scoreA >= 80 && scoreA <= 100){
            GPA = 'A';  // return 'A';
            return GPA;
        }
        if (scoreA >= 70 && scoreA <= 79){
            GPA = 'B';  // return 'B';
            return GPA;
        }
        if (scoreA >= 60 && scoreA <= 69){
            GPA = 'C';  // return 'C';
            return GPA;
        }
        if (scoreA >= 50 && scoreA <= 59){
            GPA = 'D';  // return 'D';
            return GPA;
        }
        GPA = 'F';  // return 'F';
        return GPA;
    }
    public void setId (int idM){
        idA = idM;
    }
    public int getId (){
        return idA;
    }
    public void setName (String nameM){
        nameA = nameM;
    }
    public String getName (){
        return nameA;
    }
    public void setGender (char genderM){
        genderA = genderM;
    }
    public char getGender (){
        return genderA;
    }
    public void setScore (int scoreM){
        scoreA = scoreM;
    }
    public int getScore() {
        return scoreA;
    }
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class Application{
    public static void main(String[] args) {
        // DO NOT MODIFY THE DRIVER CLASS
        Student boy = new Student(1133,"Thanaphon",'M',73);
        Student c = new Student(1130, "Sethanant", 'M', 60);
        boy.setName("Thanaphon Sombunkaeo");

        System.out.println(boy.getName());
        System.out.println(boy.getGender());
        System.out.println(boy.calGPA());

        boy.setScore(53);
        System.out.println("After change score : ");
        System.out.println(boy.calGPA());

        System.out.println("----C-----");
        System.out.println(c.getGender());
        System.out.println(c.getId());
        c.setId(230);
        c.setGender('F');
        System.out.println(c.getId());
        System.out.println(c.getScore());
        System.out.println(c.calGPA());
        System.out.println(c.getGender());
    }
}
