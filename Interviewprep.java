import java.util.Scanner;

public class Interviewprep {

    /**
     * @param args
     */
    public static void main (String [] args){

      /*   int i = 0;
       // String password = "Success";

            System.out.println("Please enter a number: ");
            Scanner input = new Scanner (System.in);
            int fig = input.nextInt();

                while(fig >=0){
                    System.out.println("Kindly enter another number: ");
                    //fig = input.nextInt();
                   double number = input.nextDouble();
                    //int num = fig.add();
                
                    if (fig < 0){
                       
                    }
                    int sum =fig+=number ;
                    System.out.println("The sum of all entered numbers is " + fig);
                }
                        
                       // scanner.close();

      /* while(i < 10){
            System.out.println(i);

            i++;
        }
                
                System.out.println("Please enter a name(to terminate this program kindly enter End): ");
                Scanner input = new Scanner (System.in);
                

                while(true){
                    System.out.println("Please enter another name(to terminate this program kindly enter End): ");
                    String name = input.nextLine();

                    if (name.equals("End")){
                        break;
                    } 
                    System.out.println(name);
                
                
            }
            System.out.println("i am done!");
            input.close();
*/

// this is a program that will ask the user to enter abunch of grades and at the end, the average is calculated using a while loop


/*System.out.println("Kindly input the number of grades which you would be entering: ");
Scanner input = new Scanner (System.in);
int NOG = input.nextInt();

if (NOG > 0){
    System.out.println("you may proceed to enter the individual grades: ");
    
}else{
    System.out.println("The program has now come to an end!");
}
Scanner grades = new Scanner (System.in);
int entry = grades.nextInt();

while (true){
    System.out.println("Kindly enter the next grade: ");
    double num = input.nextDouble();
    entry += num;

    if(entry >= 0 && entry <= 100){

        System.out.println(" Kindly enter the next grade (to terminate, kindly enter a value less than 0): ");
    }else{
        System.out.println("The program has now been terminated! ");
    }

    break;
}
double ave = entry/NOG;
System.out.println("The final grade is " + ave);
input.close();
grades.close();
*/

//FOR LOOPS
//Write a program to calculate the sum of first 10 natural number.
     /*    int sum = 0;
        for (int i = 1; i < 11; i ++){

            sum += i;

            System.out.println("The sum of the first 10 natural numbers is  " + sum);
        }
    */

//FOR LOOPS
// Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. 
/*Scanner mult = new Scanner(System.in);
System.out.println("Please enter a number less than 12 in order to print its multiplication table: ");
int entry = mult.nextInt();

for(int i = 1; i < 13; i ++){
    int FA = entry * i;
System.out.println("the multiplication table for the above number is " + FA );
}
*/

//Write a program to find the factorial value of any number entered through the keyboard. 
       /*  Scanner scan = new Scanner (System.in);
        System.out.println("Kindly make an entry of the nth factorial which you want to find: ");
        int entry = scan.nextInt();

// continue code form here
 if (entry <= 0){
    System.out.println("Invalid Entry!");
 }else {
    int factorial = 1;
        for(int i = 1; i <= entry; i++){
            factorial *=  i;
    }
    System.out.println("The factorial of the number entered is " + factorial);
 
       }*/


       //NEXT QUESTION
       //Two numbers are entered through the keyboard. 
       //Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

       //ARRAYS
       //Write a Java program to sum values of an array.

       /* Scanner scan = new Scanner (System.in);
        System.out.println("How large do you need this Array to be? ");
        int Arr = scan.nextInt(); 

        int [] Newarr = new int [Arr];
        if (Arr > 0){
            System.out.println("We may proceed! ");
        } else{
            System.out.println("Invalid Entry! ");
            return;
        }

        System.out.println("Please make your Array Entries: ");
            for (int i = 0;  i < Arr; i++ ){
                System.out.println("Please make an entry to index " + ((i + 1) -1) + ":");
                    Newarr[i] = scan.nextInt();

                    //to calculate the sum of the array
                        int sum = 0;
                        for(int num : Newarr){
                            sum += num;

                        }
                        System.out.println("The sum of trhe array is " + sum);
            }
         */

         //ARRAYS 2
         // Write a Java program to calculate the average value of array elements.
    /*    Scanner input = new Scanner (System.in);
         System.out.println("How large would this array be? ");
         int num = input.nextInt();

         int [] Ave = new int [num];

         if(num > 0 ){
            System.out.println("Let's Proceed!");
         }else {
            System.out.println("Invalid Entry!");
            return;
         }

                System.out.println("Kindly make entries into this array:");
            for (int i = 0; i < num; i++){
                System.out.println("kindly make an entry into index " + ((i + 1)-1) + ":");
                    Ave[i] = input.nextInt();
            }
                int arrave = 0;
            for (int fa : Ave){
                arrave += fa;                            
            }
            arrave/=num;
            //double average = (double) arrave/num; 
            System.out.println("The average of all entries made into this array would be " + arrave);

         input.close();
    */
     //ARRAYS
    //Write a Java program to test if an array contains a specific value.
         Scanner input = new Scanner (System.in);
         System.out.println("Let's dive into it. Make an entry: ");
         int entered = input.nextInt();

         int [] spec = new int [entered];

         //System.out.println("input an index to find");

         if(entered > 0 ){
                System.out.println("Let's Proceed!");
         }else{
                System.out.println("Invalid Entry!");
    return;
         }

         System.out.println("Kindly make entries into this array:");
            for (int i = 0; i < entered; i++){
                System.out.println("kindly make an entry into index " + ((i + 1)-1) + ":");
                spec[i] = input.nextInt();
            }
         for(int j = 0; j < entered; j++){
           // System.out.println("Let's find the desired number: ");
           // spec[j] = input.nextInt();
            

            if (spec[j] == 2*(j)){
                System.out.println("We have found our desired results,  and they are " + 2*(j));
            }else{
                System.out.println("Better luck next time! :( ");
            }
                return ;
         }
         input.close();
//  Get back to this work!
    }

}
