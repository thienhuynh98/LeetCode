package com.company;

public class numToRoman {

    String result = "";

    public String intToRoman(int num)
    {
        while(num >= 1000)
        {
            result += "M";
            num -= 1000;
        }

        while(num >= 500 && num < 1000)
        {
            result += "D";
            num -= 500;
        }

        while(num >= 100 && num < 500)
        {
            result += "C";
            num -= 100;
        }

        while(num >= 50 && num < 100)
        {
            result += "L";
            num -= 50;
        }

        while(num >= 10 && num < 50)
        {
            result += "X";
            num -= 10;
        }

        while(num >= 5 && num < 10)
        {
            if(num != 9)
            {
                result += "V";
                num -= 5;
            }
            else{
                result += "IX";
                num = 0;
                break;
            }
        }

        while(num >= 1 && num < 5)
        {
            if(num != 4)
            {
                result += "I";
                num -= 1;
            }
            else{
                result += "IV";
                num = 0;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
	    numToRoman itr = new numToRoman();
	    itr.intToRoman(195);
        System.out.println(itr.result);
    }
}
