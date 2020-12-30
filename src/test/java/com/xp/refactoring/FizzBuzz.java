package com.xp.refactoring;

public class FizzBuzz {

    public String countTo(int c) {
        if(c<=0) return "";

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for(int i=1; i<=c; i++) {
            if (i%3==0) {
                new StringBuilders(sb1, sb2, sb3).appendFizz();
            }
            if(i%5==0) {
                sb1.append("      __ __ ");
                sb2.append("|_ | | /  / ");
                sb3.append("|_||_|/_ /_ ");
                if (i < c) {
                    sb1.append(" ");
                    sb2.append(" ");
                    sb3.append(",");
                }
            }
            if (i%3==0 && i%5!=0) {
                new StringBuilders(sb1, sb2, sb3).appendComma(c, i);
            }
            if (i%3!=0 && i%5!=0) {
                String[][] numberMarks = new String[][]{
                        {" _ ","   "," _ "," _ ","   "," _ "," _ "," _ "," _ "," _ ",},
                        {"| |","|  "," _|"," _|","|_|","|_ ","|_ ","  |","|_|","|_|",},
                        {"|_|","|  ","|_ "," _|","  |"," _|","|_|","  |","|_|"," _|",}};

                char[] numberChars = String.valueOf(i).toCharArray();
                for(char numberChar: numberChars) {
                    int i1 = Integer.parseInt(""+numberChar);
                    sb1.append(numberMarks[0][i1]);
                    sb2.append(numberMarks[1][i1]);
                    sb3.append(numberMarks[2][i1]);
                }
                new StringBuilders(sb1, sb2, sb3).appendComma(c, i);
            }
        }
        System.out.println(sb1.toString() + "\n" + sb2.toString() + "\n" + sb3.toString());
        return sb1.toString() + "\n" + sb2.toString() + "\n" + sb3.toString();
    }

    class StringBuilders {
        StringBuilder sb1;
        StringBuilder sb2;
        StringBuilder sb3;

        public StringBuilders(StringBuilder sb1, StringBuilder sb2, StringBuilder sb3) {
            this.sb1 = sb1;
            this.sb2 = sb2;
            this.sb3 = sb3;
        }

        private void appendFizz() {
            sb1.append(" _    __ __ ");
            sb2.append("|_  |  /  / ");
            sb3.append("|   | /_ /_ ");
        }

        private void appendComma(int c, int i) {
            if (i < c) {
                sb1.append(" ");
                sb2.append(" ");
                sb3.append(",");
            }
        }
    }

}
