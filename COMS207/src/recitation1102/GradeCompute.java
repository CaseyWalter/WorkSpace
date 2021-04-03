package recitation1102;
import java.util.Scanner;


public class GradeCompute {
    /**
     * THIS METHOD IS CORRECT.
     * Do not modify the main method or any correct method. Down below are two methods you need to implement
     **/
    public static void main(String[] args) {
        // Create scanner to take input from user
        Scanner stdin = new Scanner(System.in);


        // These courseworks are what we require the user to enter
        String[] courseWorkNames = {"worksheets", "recitations", "assignments", "exams"};
        CourseWorkInfo[] courseWorkInfos = new CourseWorkInfo[4];
        for (int i = 0; i < courseWorkNames.length; i++) {
            CourseWorkInfo info = enterCourseWorkInfo(courseWorkNames[i], stdin);
            courseWorkInfos[i] = info;
        }

        // we "unpack" the return values of enterCourseWorkInfo()
        // exam total is thrown away: every exam is weighed differently
        int worksheetTotal, recitationTotal, assignmentTotal;
        int[] worksheetArr, recitationArr, assignmentArr, examArr;

        worksheetTotal = courseWorkInfos[0].getTotal();
        recitationTotal = courseWorkInfos[1].getTotal();
        assignmentTotal = courseWorkInfos[2].getTotal();

        worksheetArr = courseWorkInfos[0].getScores();
        recitationArr = courseWorkInfos[1].getScores();
        assignmentArr = courseWorkInfos[2].getScores();
        examArr = courseWorkInfos[3].getScores();

        // Calculate grade based on the scores and total
        String grade = computeGrade(worksheetArr, recitationArr, assignmentArr, examArr,
                worksheetTotal, recitationTotal, assignmentTotal);
        // Print grade
        System.out.println("Grade is " + grade);

        stdin.close();
    }
  
 
    public static int computeSum(int[] array) {
    	int sum = 0;
    	for (int i = 0; i <array.length; i++) {
    		sum += array[i];
    	}
        return sum;
    }

    /**
     * THIS METHOD IS CORRECT.
     **/
    public static void printArray(int[] array) {
        // e.g. prints to console "4 3 1 2 5", one by one on the same line, with new line in the end
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        } // end for
        System.out.println();
    }

    /**
     * THIS METHOD IS CORRECT.
     **/
    public static CourseWorkInfo enterCourseWorkInfo(String courseWorkName, Scanner stdin) {
        System.out.print("Enter number of " + courseWorkName + ": ");
        int numWork = stdin.nextInt();
        // Input total points for a course work.
        System.out.print("Enter total score for all " + courseWorkName + ": ");
        int total = stdin.nextInt();
        // create array to store each score
        int[] scores = new int[numWork];
        // enter the scores
        enterCourseWorkScores(courseWorkName, scores, stdin);
        // Print scores in array
        System.out.print("Score on "+courseWorkName+": ");
        printArray(scores);

        CourseWorkInfo info = new CourseWorkInfo(scores, total);
        return info;
    }

    /**
     * THIS METHOD IS CORRECT.
     **/
    public static void enterCourseWorkScores(String courseWorkName, int[] scores, Scanner in) {

        int userInput = 0;
        int i = 0;
        while (i < scores.length) {
            System.out.print("Enter score for " + courseWorkName + " " + (i + 1) + ": ");
            userInput = in.nextInt();
            scores[i] = userInput;
            i++;
        }
    }


    
    public static String computeGrade(int[] wksheetArr, int[] recitationArr, int[] assignmentArr, int[] examArr,
                                      int wksheetTotal, int recitationTotal, int assignmentTotal) {
        /*** fill in your code here: ***/
    	double overallScore = 0;
    	double classworkScore = computeSum(wksheetArr) + computeSum(recitationArr) + computeSum(assignmentArr);
    	overallScore += classworkScore / (wksheetTotal + recitationTotal + assignmentTotal) * 40;
    	overallScore += examArr[0] * 0.15 + examArr[1] * 0.2 + examArr[2] * 0.25;
    	String letter;
    	if (overallScore > 93) {
    		letter = "A";
    	}else if (overallScore >= 90) {
    		letter = "A-";
    	}else if (overallScore >= 87) {
    		letter = "B+";
    	}else if (overallScore >= 83) {
    		letter = "B";
    	}else if (overallScore >= 80) {
    		letter = "B-";
    	}else if (overallScore >= 77) {
    		letter = "C+";
    	}else if (overallScore >= 70) {
    		letter = "C";
    	}else if (overallScore >= 65) {
    		letter = "C-";
    	}else if (overallScore >= 60) {
    		letter = "D+";
    	}else if (overallScore >= 55) {
    		letter = "D";
    	}else if (overallScore >= 50) {
    		letter = "D-";
    	}else  {
    		letter = "F";
    	}
        return letter;
    }

}// end class GradeCompute

/**
 * THIS CLASS IS CORRECT.
 **/
class CourseWorkInfo {
    // Do not modify
    // You are not required to understand this for now. Just familiarize.

    private int total;
    private int[] scores;

    public CourseWorkInfo(int[] scores, int total) {
        this.total = total;
        this.scores = scores;
    }

    public int getTotal() {
        return total;
    }

    public int[] getScores() {
        return scores;
    }
}