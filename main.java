public class main {
    public static void main(String[] args) {

        /* 
        Program main body for numbers; we created 6 different iterations to test for positive and negative integers and doubles, as well as a special case being 0.
            */
        System.out.println("Test case 1: Positive integer");
        int startNumber1 = 3; // Positive number for testing
        System.out.println("Initial value: " + startNumber1);
        startNumber1 = startNumber1 * 2;
        System.out.println("Multiplied by 2: " + startNumber1);
        startNumber1 +=6;
        System.out.println("Added 6: " + startNumber1);
        startNumber1/=2;
        System.out.println("Divided by 2: " + startNumber1);
        startNumber1 -= 3;
        System.out.println("Subtracted 3: " + startNumber1);
        System.out.println("Final value: " + startNumber1);

        System.out.println("\nTest case 2: Negative integer");
        int startNumber2 = -5; // negative number for testing
        System.out.println("Initial value: " + startNumber2);
        startNumber2 = startNumber2 * 2;
        System.out.println("Multiplied by 2: " + startNumber2);
        startNumber2 +=6;
        System.out.println("Added 6: " + startNumber2);
        startNumber2 /=2 ;
        System.out.println("Divided by 2: " + startNumber2);
        startNumber2 -= -5;
        System.out.println("Subtracted -5: " + startNumber2);
        System.out.println("Final value: " + startNumber2);
        
        System.out.println("\nTest case 3: Zero");
        int startNumber3 = 0; // 0 value for testing
        System.out.println("Initial value: " + startNumber3);
        startNumber3 = startNumber3 * 2;
        System.out.println("Multiplied by 2: " + startNumber3);
        startNumber3 += 6;
        System.out.println("Added 6: " + startNumber3);
        startNumber3 /= 2;
        System.out.println("Divided by 2: " + startNumber3);
        startNumber3 -= 0;
        System.out.println("Subtracted 0: " + startNumber3);
        System.out.println("Final value: " + startNumber3);    
        
        System.out.println("\nTest case 4: Multi positive integer");
        int startNumber4 = 1; // multi pos. value for testing
        System.out.println("Initial value: " + startNumber4);
        startNumber4 = startNumber4 * 2;
        System.out.println("Multiplied by 2: " + startNumber4);
        startNumber4 += 6;
        System.out.println("Added 6: " + startNumber4);
        startNumber4 /= 2;
        System.out.println("Divided by 2: " + startNumber4);
        startNumber4 -= 1;
        System.out.println("Subtracted 1: " + startNumber4);
        System.out.println("Final value: " + startNumber4);

        System.out.println("\nTest case 5: Positive double");
        double startNumber5 = 2.5; // positive double value for testing
        System.out.println("Initial value: " + startNumber5);
        startNumber5 = startNumber5 * 2;
        System.out.println("Multiplied by 2: " + startNumber5);
        startNumber5 +=6;
        System.out.println("Added 6: " + startNumber5);
        startNumber5 /=2 ;
        System.out.println("Divided by 2: " + startNumber5);
        startNumber5 -= 2.5;
        int finalNumber5 = (int) startNumber5; 
        System.out.println("Subtracted 2.5: " + startNumber5);
        System.out.println("Final value: " + finalNumber5);
        
        System.out.println("\nTest case 6: Negative double");
        double startNumber6 = -3.5; // negative double value for testing
        System.out.println("Initial value: " + startNumber6);
        startNumber6 = startNumber6 * 2;
        System.out.println("Multiplied by 2: " + startNumber6);
        startNumber6 += 6;
        System.out.println("Added 6: " + startNumber6);
        startNumber6 /= 2;
        System.out.println("Divided by 2: " + startNumber6);
        startNumber6 -= -3.5;
        int finalNumber6 = (int) startNumber6;
        System.out.println("Subtracted -3.5: " + startNumber6);
        System.out.println("Final value: " + finalNumber6);
    
    }
}
