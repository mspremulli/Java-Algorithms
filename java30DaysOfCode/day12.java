package java30DaysOfCode;

class Student extends Person{
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        testScores = scores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    char calculate(){
        int avg = 0;
        char avgGrade;
        int length = testScores.length;
        for( int i = 0; i < length; i++){
            avg += testScores[i];
        }
        avg = avg/length;
        if(avg >= 90) avgGrade = 'O';
        else if( avg >= 80) avgGrade = 'E';
        else if( avg >= 70) avgGrade = 'A';
        else if( avg >= 55) avgGrade = 'P';
        else if( avg >= 40) avgGrade = 'D';
        else avgGrade = 'T';

        return avgGrade;
    }

}

