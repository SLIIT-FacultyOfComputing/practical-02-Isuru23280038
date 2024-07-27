import java.util.Scanner;
public class Marks {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[][] details;
        int n;

        System.out.println("Enter the number of students:");
        n = scanner.nextInt();
        details = new int[n][3];

        while(true)
        {
            System.out.println("\n");
            System.out.println("1. Add student marks: add [studentID]");
            System.out.println("2. Update student mark : update [studentID] [subjectID]");
            System.out.println("3. Get the average for a subject: average_s [studentID]");
            System.out.println("4. Get the average for a student: average [studentID]");
            System.out.println("5. Get the total mark of a student : total [studentID]");
            System.out.println("6. Display the grades");
            System.out.println("7. Exit");

            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            int studentID;
            int subjectID;
            int sum;
            double average;
            String grade;

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the student ID 1 to "+ n );
                    studentID = scanner.nextInt()-1;

                    if(studentID>=0 && studentID<n)
                    {
                        System.out.println("Enter marks for Mathematics:");
                        details[studentID][0] = scanner.nextInt();
                        System.out.println("Enter marks for Chemistry:");
                        details[studentID][1] = scanner.nextInt();
                        System.out.println("Enter marks for Physics:");
                        details[studentID][2] = scanner.nextInt();
                        System.out.println("Marks added for student " + (studentID+1) + ".");
                    }
                    else
                    {
                        System.out.println("Invaid student ID.");
                    }
                    break;

                case 2:
                    System.out.println("Enter the student ID 1 to "+ n );
                    studentID = scanner.nextInt() - 1;

                    if (studentID >= 0 && studentID < n) {
                        System.out.println("Enter the subject ID (0 -> Mathematics, 1 -> Chemistry, 2 -> Physics):");
                        subjectID = scanner.nextInt();

                        if (subjectID >= 0 && subjectID < 3) {
                            System.out.println("Enter new mark:");
                            details[studentID][subjectID] = scanner.nextInt();
                            System.out.println("Marks updated for student " + (studentID + 1) + " in subject " + subjectID + ".");
                        } else {
                            System.out.println("Invalid subject ID.");
                        }
                    } else {
                        System.out.println("Invalid student ID.");
                    }
                    break;

                case 3:
                System.out.println("Enter the subject ID (0 -> Mathematics, 1 -> Chemistry, 2 -> Physics):");
                subjectID = scanner.nextInt();
                
                    if (subjectID >= 0 && subjectID < 3)
                    {
                        sum = 0;
                        
                        for (int i = 0; i<n ; i++)
                        {
                            sum += details[i][subjectID];
                        }

                        average = sum/(double)n;
                        System.out.println("average for a subject :" + average + " : " + (subjectID + 1) );
                    }
                    else 
                    {
                        System.out.println("Invalid subject ID.");
                    }
                    break;

                case 4:
                System.out.println("Enter the student ID 1 to "+ n );
                studentID = scanner.nextInt() - 1;

                    if (studentID >= 0 && studentID < n)
                    {
                        sum = 0;
                        
                        for (int i = 0; i<3 ; i++)
                        {
                            sum += details[studentID][i];
                        }

                        average = sum/3;
                        System.out.println("average for a student :" + average + " : " + (studentID + 1) );
                    }
                    else 
                    {
                        System.out.println("Invalid student ID.");
                    }
                    break;

                case 5:
                System.out.println("Enter the student ID 1 to "+ n );
                studentID = scanner.nextInt() - 1;

                if (studentID >= 0 && studentID < n)
                {
                    sum = 0;
                    
                    for (int i = 0; i<3 ; i++)
                    {
                        sum += details[studentID][i];
                    }

                    System.out.println("Total mark of a student :" + sum + " : " + (studentID + 1) );
                }
                else 
                {
                    System.out.println("Invalid student ID.");
                }
                break;

                case 6:
                System.out.println("Student ID   | Mathematics   | Chemistry   | Physics     |");
                    for (int i = 0; i < n; i++)
                    {
                        System.out.print("   " + (i + 1) + "         |");
                        for (int j = 0; j < 3; j++) 
                        {
                            int score = details[i][j];
                            
                            if (score >= 90) 
                            {
                                grade = "Grade A";
                            } 
                            else if (score >= 80) 
                            {
                                grade = "Grade B";
                            } 
                            else if (score >= 70) 
                            {
                                grade = "Grade C";
                            } 
                            else if (score >= 60) 
                            {
                                grade = "Grade D";
                            } 
                            else 
                            {
                                grade = "Fail";
                            }
                            System.out.print(" " + grade + "      |");
                        }
                        System.out.println();
                    }
                    break;

                case 7:
                    System.out.println("Exit...");
                    scanner.close();
                    return;

                    default:
                    System.out.println("Invalid choice.");
            }
        }
    } 
}
