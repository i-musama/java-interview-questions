import javax.sound.midi.Soundbank;
import javax.xml.transform.sax.SAXSource;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        question1();//        Question #1: Find and print count of duplicate characters in a string
//        question2();//        Question #2: Check if given string is palindrome
//        question3();//        Question #3: Swap two variables without using the third variable
//        question4();//        Question #4: Predict output (Switch-Case)
//        question5();//        Question #5: How many times hello will get printed (Loop)
//        question6();//          Question #6: How many times hello will get printed (Loop)
//        question7();//        Question #7: How many times hello will get printed (Loop)
//        question8();//        Question 8: Predict Output -- Answer 10
//        question9();//        Question 9: Predict Output (if else tricky)
//        question10();//        Question 10: Predict Output (if else simple)

    }

    private static void question10() {
        int a = 0;
        if(a==1){
            System.out.println("Sun");
        }
    }

    private static void question9() {
        int a = 0;
        if (a == 1);{
            System.out.println("Sun");
        }
    }

    private static void question8() {
//        Question 8: Predict Output -- Answer 10
        System.out.println(sum(1, sum(0,1)));
    }

    public static int sum(int a, int b){
        if(a+b>1)
            return 0;
        System.out.print(a+b);
        return a+b;
    }

    private static void question7() {
        //        Question #7: How many times hello will get printed (Loop)
        for(int i = 0; i<5; i+=2)
        {
            System.out.println("Hello");
            i+=2;
        }
//        Answer 2 times
    }

    private static void question6() {
        System.out.println("Question #6: How many times hello will get printed (Loop)");
        for(int i = 0; i>5; )
        {
            System.out.println("Hello");
        }
        System.out.println("Answer: 0 times as i=0 is less than 5 condition does not meet");
    }

    private static void question5() {
//        Question #5: How many times hello will get printed (Loop)
        for(int i = 0; i<5; i=5 )
        {

            System.out.println("Hello");
        }
    }

    private static void question4() {
//        Question 4: Predict output (Switch-Case)
        int a = 0;
        a +=5;

        switch(a){

            case 5: System.out.print("5");
            case 10: System.out.print("10");break;
            default: System.out.print("0");

        }
//        Answer: 510, Reason: break is not used in case5
    }

    private static void question3() {
//        Question #3: Swap two variables without using the third variable
        int a = 5;
        int b = 7;
        int sum = 0;

        System.out.println("Before:");
        System.out.println("a"+ a);
        System.out.println("b"+ b);

        sum= a+b;
        a= sum-a;
        b= sum-a;

        System.out.println("After:");
        System.out.println("a"+ a);
        System.out.println("b"+ b);
    }

    private static void question2() {
//      Question #2:  Check if given string is palindrome
        String palindrome = "1214";
        char[]  palindromeChar =  palindrome.toCharArray();

        for(int i=0; i<palindromeChar.length; i++){
            if (palindromeChar[i] == palindromeChar[(palindromeChar.length-1)-i]){
                System.out.println("Is palindrome");
            }else{
                System.out.println("Is not palindrome");
            }
        }
    }

    private static void question1() {
//        Question #1: Find and print count of duplicate characters in a string
        String str = "Usama";
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char c: str.toCharArray()){
            System.out.println(c);
            if(!countMap.containsKey(c)) {
                countMap.put(c, 1);
            }else{
                Integer temp = countMap.get(c) + 1 ;
                countMap.put(c, temp);
            }
        }

        for (Character keys: countMap.keySet()
             ) {
            System.out.println("key " + keys + " count " + countMap.get(keys) );
            System.out.println(String.format("Char %s  count $s", keys, countMap.get(keys)));
        }
    }

}
