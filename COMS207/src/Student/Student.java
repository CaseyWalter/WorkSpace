package Student;
public class Student {
    private String firstName;
    private String lastName;
    private int [ ] hwScores = new int [3];

    public Student (String first, String last){
        firstName = first;
        lastName = last;
    }

    public void setScore (int hwNumber, int score){
        hwScores [hwNumber - 1] = score;
    } // end void setScore

    public String toString(){
        return ( firstName + "˽" + lastName + "˽" + getAverageScore());
    } // end toString

    public double getAverageScore(){
        double sum = 0.0;
        for (int i = 0; i < hwScores.length; i++){
            sum = sum + hwScores[i];
        } // end for i
        return (sum/hwScores.length);
    } // end double getAverageScore

    public static void main (String [] args) {
        Student s1 = new Student ("Nicole", "Bruck");
        Student s2 = new Student ("Devon", "Eilers");
        s1.setScore (1, 90);
        s1.setScore (2, 80);
        s1.setScore (3, 70);
        s2.setScore (1, 70);
        s2.setScore (2, 60);
        s2.setScore (3, 50);

        //To print an object, Java looks for a specific
        //instance method called toString in the class
          //definition, which returns a String value
        System.out.println (s1);
        System.out.println (s2);
                                
        Student s3;                  
        s3 = s1;                     
        s1 = s2;
        s2 = s3;

        System.out.println (s1);     
        System.out.println (s2);     
        System.out.println (s3);     

    } // end main
}