package java30DaysOfCode;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}



class Student extends Person{
    private int[] testScores;


    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        testScores = scores;
    }

    // Write your method here
    char calculate(){
        int avg = 0;
        char avgGrade;
        int length = testScores.length;
        for (int testScore : testScores) {
            avg += testScore;
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

