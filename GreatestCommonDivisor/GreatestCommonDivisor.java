    /** 20 Greatest Common Divisor
     Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
     If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
     The method should return the greatest common divisor of the two numbers (int).
     The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
     */
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        int maximum = first;
        if(maximum < second){
            maximum = second;
        }
        int greatestDivisor = 1;
        for (int i = 1; i <= maximum ; i++) {
            if((first % i == 0) && (second % i == 0) && (i > greatestDivisor)){
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }

