public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.length() < 2) {
            return false;
        } else if (x.substring(x.length()-2).equals("ly")) {
            return true;
        }
        return false;
    }

    public String conCat(String s1, String s2) {
        String end = s1.substring(s1.length()-1);
        String start = "";
        if (!s2.equals("")) {
            start = s2.substring(0,1);
        }
        if (end.equals(start)) {
            s2 = s2.substring(1);
        }
        return s1 + s2;
    }

    public String withoutX(String s1) {
        if (s1.substring(0,1).equals("x")) {
            s1 = s1.substring(1);
        }
        if (s1.substring(s1.length()-1).equals("x")) {
            s1 = s1.substring(0, s1.length()-1);
        }
        return s1;
    }

    public String fizzString(String s1) {
        if (s1.substring(0,1).equals("f") && s1.substring(s1.length()-1).equals("b")) {
            return "FizzBuzz";
        } else if (s1.substring(0,1).equals("f")) {
            return "Fizz";
        } else if (s1.substring(s1.length()-1).equals("b")) {
            return "Buzz";
        }
        return "";
    }

    public String fizzString2(int x) {
        if ((x%3 == 0) && (x%5 ==0)) {
            return "FizzBuzz!";
        } else if ((x%3 == 0)) {
            return "Fizz!";
        } else if ((x%5 ==0)) {
            return "Buzz!";
        } else {
            return x + "!";
        }
    }

}
