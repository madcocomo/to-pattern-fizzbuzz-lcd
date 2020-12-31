package com.xp.refactoring;

class LCD implements Output {
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    StringBuilder sb3 = new StringBuilder();

    @Override
    public void appendFizz() {
        sb1.append(" _    __ __ ");
        sb2.append("|_  |  /  / ");
        sb3.append("|   | /_ /_ ");
    }

    @Override
    public void appendComma() {
        sb1.append(" ");
        sb2.append(" ");
        sb3.append(",");
    }

    @Override
    public void appendBuzz() {
        sb1.append("      __ __ ");
        sb2.append("|_ | | /  / ");
        sb3.append("|_||_|/_ /_ ");
    }

    @Override
    public void appendNumber(int number) {
        String[][] numberMarks = new String[][]{
                {" _ ","   "," _ "," _ ","   "," _ "," _ "," _ "," _ "," _ ",},
                {"| |","|  "," _|"," _|","|_|","|_ ","|_ ","  |","|_|","|_|",},
                {"|_|","|  ","|_ "," _|","  |"," _|","|_|","  |","|_|"," _|",}};

        char[] numberChars = String.valueOf(number).toCharArray();
        for(char numberChar: numberChars) {
            int i1 = Integer.parseInt(""+numberChar);
            sb1.append(numberMarks[0][i1]);
            sb2.append(numberMarks[1][i1]);
            sb3.append(numberMarks[2][i1]);
        }
    }

    @Override
    public String output() {
        return sb1.toString() + "\n" + sb2.toString() + "\n" + sb3.toString();
    }
}
