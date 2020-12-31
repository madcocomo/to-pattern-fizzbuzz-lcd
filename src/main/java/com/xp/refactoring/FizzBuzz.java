package com.xp.refactoring;

public class FizzBuzz {

    public String countTo(int c) {
        if(c<=0) return "";

        LCD lcd = new LCD();
        for(int i=1; i<=c; i++) {
            if (i%3==0) {
                lcd.appendFizz();
            }
            if(i%5==0) {
                lcd.appendBuzz();
                if (i < c) {
                    lcd.appendComma();
                }
            }
            if (i%3==0 && i%5!=0) {
                if (i < c) {
                    lcd.appendComma();
                }
            }
            if (i%3!=0 && i%5!=0) {
                lcd.appendNumber(i);
                if (i < c) {
                    lcd.appendComma();
                }
            }
        }
        return lcd.output();
    }

}
