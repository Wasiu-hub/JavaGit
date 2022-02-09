    /** Teen Number Checker
     We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
     Write a method named hasTeen with 3 parameters of type int.
     The method should return boolean, and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise, return false.
     */
    public static boolean hasTeen(int age1, int age2, int age3) {
        boolean teen = false;
        boolean teen1 = false;
        boolean teen2 = false;
        boolean teen3 = false;

        if(age1 >= 13 && age1 <= 19){
            return true;
        }if(age2 >= 13 && age2 <= 19){
            return true;
        }if(age3 >= 13 && age3 <= 19){
            return true;
        }
        if (teen1 || teen2 || teen3){
            teen = true;
        }
        return teen;
    }
