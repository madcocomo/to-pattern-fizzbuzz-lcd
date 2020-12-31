package com.xp.refactoring;

public class FizzBuzz {

    public String countTo(int c) {
        if(c<=0) return "";

        Output lcd = createOutput();
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

    private Output createOutput() {
        Output lcd = new LCD();
        return lcd;
    }

    private Output createFancyOutput() {
        Output output = new FancyOutput(3, false, 0, false, false, " ");
        return output;
    }

}
