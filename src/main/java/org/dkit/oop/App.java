package org.dkit.oop;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App{

    public static void main(String[] args) {
        Codes("JC_Results.txt");


    }

    public static void Codes(String file) {

        System.out.println("Reading mixture of words, and numbers from text file");



        try {
            File inputFile = new File("JC_Results.txt");
            Scanner input = new Scanner(inputFile);

            input.useDelimiter("[,\r\n]+");


            while (input.hasNext()) {
                int studentNumber= input.nextInt();

                //Arrays declaration
                int[] subjectCode = new int[8];
                int[] Results = new int[8];

                for (int i = 0; i<subjectCode.length; i++){

                    int subjectC = input.nextInt();
                    subjectCode[i] = subjectC;

                    int grades = input.nextInt();
                    Results[i] = grades;
                }

                System.out.println("Student No: "+studentNumber+" Code: "+ Arrays.toString(subjectCode)+" Grades: "+Arrays.toString(Results));
                int[] TopFive = selectFiveGrades(subjectCode, Results);

                double average = calculateAverage(TopFive);

                System.out.println(average);

            }


            input.close();


        } catch (IOException e) {

            System.out.println(e.getMessage());

        }
    }

    public static int[] selectFiveGrades(int[] codes, int[] grades) {

        int[] topFiveGrades = new int[5];
        int[] temp = new int[8];

        int count = 0;
        for (int a = 0; a< codes.length;a++){

            if(codes[a] == 1 || codes[a] == 2 || codes[a] == 3){

                topFiveGrades[count] = grades[a];
                count++;

            }
            else{
                temp[a] = grades[a];

            }
            /*System.out.println("top five grades: "+Arrays.toString(topFiveGrades));
            System.out.println(Arrays.toString(temp));*/
        }
        Arrays.sort(temp);
        /*System.out.println(Arrays.toString(temp));*/

        topFiveGrades[topFiveGrades.length-1]=temp[temp.length-1];
        topFiveGrades[topFiveGrades.length-2]=temp[temp.length-2];

        System.out.println("top five grades: "+Arrays.toString(topFiveGrades));
          return topFiveGrades;

    }

    public static double calculateAverage( int[] selectedGrades) {

        int sum = 0;

        for(int i = 0; i< selectedGrades.length;i++){

          sum = sum+selectedGrades[i];
        }
       double average = (double) sum/selectedGrades.length;

        return average;
    }

/*
{
    public static void main(String[] args) {
        readFile("JC_Results.txt");
        fileToArray("JC_Results.txt");
        displayWords(fileToArray("JC_Results.txt"));

       // System.out.println(Arrays.toString(fileToArray));
    }

    public static void readFile( String file ) {

        System.out.println("Reading the file: ");


            try {
                //Scanner scan = new Scanner(new File(file)); testing
                Scanner s;
                s = new Scanner(new File("JC_Results.txt"));

                while (s.hasNext()){

                    String str = s.nextLine();
                    //System.out.println(str);
                }
                s.close();
            }

            catch (FileNotFoundException e) {
                */
/*e.printStackTrace();*//*
  //just testing
            }


    }




        }


        //System.out.print(list);



            list.add(s.next());

            */
/*System.out.println(list);*//*


        }
        for(int i=1;i < 17;i++ ){


    }
        if(list)
        //System.out.print(list);

        return(list);
    }

    public static void displayWords(ArrayList<String> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
*/

   /* Scanner s = new Scanner(new File("filepath"));
    ArrayList<String> list = new ArrayList<String>();
while (s.hasNext()){
    list.add(s.next());
}
s.close();*/






  /*  public int[] selectFiveGrades(int[] codes, int[] grades) {
        int[] selectedGrades;
        return selectedGrades[];
    }

    public double calculateAverage( int[] selectedGrades) {

        double avg = 0;


        return avg;
    }*/
}
