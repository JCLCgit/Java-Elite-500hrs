package _14repasoLogic1;

public class _25AnswerCell {
    /*
Your cell phone rings. Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.

answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
     */
    static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep)
            return false;
        if (isMorning && isMom)
            return true;
        return  (isMorning) ? false : !isAsleep;
    }
    public static void main(String[] args) {
        System.out.println("answerCell(false, false, false) = " + answerCell(false, false, false));
        System.out.println("answerCell(false, false, true) = " + answerCell(false, false, true));
        System.out.println("answerCell(true, false, false) = " + answerCell(true, false, false));
    }
}
