package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip>lastInRow) {
            System.out.println("number to skip is bugger then the last");
            return;
        }
        if (lastInRow<0){
            System.out.println("last number in row is negative");
            return;
        }
        int skipSum = 0;
        int countSum = 0;
        for (int i = 0; i <= lastInRow; i++) {
            if (i<=numberToSkip) {
                skipSum+=i;
            } else {
                countSum+=i;
            }
        }
        System.out.printf("skipped sum is %d\n",skipSum);
        System.out.printf("counted sum is %d\n",countSum);
    }
}
