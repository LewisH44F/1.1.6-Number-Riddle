public class main {
    public static void main(String[] args) {

        /* 
        Program main body for numbers; we created 6 different iterations to test for positive and negative integers and doubles, as well as a special case being 0.
            */
        int startNumber1 = 3; // Positive number for testing
        startNumber1 = startNumber1 * 2;
        startNumber1 +=6;
        startNumber1/=2;
        startNumber1 -= 3;
        System.out.println(startNumber1);

        int startNumber2 = -5; // negative number for testing
        startNumber2 = startNumber2 * 2;
        startNumber2 +=6;
        startNumber2 /=2 ;
        startNumber2 -= 3;
        System.out.println(startNumber2);
        
        int startNumber3 = 0; // 0 value for testing
        startNumber3 = startNumber3 * 2;
        startNumber3 += 6;
        startNumber3 /= 2;
        startNumber3 -= 3;
        System.out.println(startNumber3)    
        
        int startNumber4 = 1; // multi pos. value for testing
        startNumber4 = startNumber4 * 2;
        startNumber4 += 6;
        startNumber4 /= 2;
        startNumber4 -= 3;
        System.out.println(startNumber4);

        double startNumber5 = 2.5; // positive double value for testing
        startNumber5 = startNumber5 * 2;
        startNumber5 +=6;
        startNumber5 /=2 ;
        startNumber5 -= 2.5;
        System.out.println((int)startNumber5);
        
        double startNumber6 = -3.5; // negative double value for testing
        startNumber6 = startNumber6 * 2;
        startNumber6 +=6;
        startNumber6 /=2 ;
        startNumber6 -= -3.5;
        System.out.println((int)startNumber6);
    
    }
}
