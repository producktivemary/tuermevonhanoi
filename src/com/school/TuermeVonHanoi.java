package com.school;
import java.util.Scanner;

class TowersofHanoi {
        // die verschiedenen Pegs
        public static final String SOURCE_PEG = "Source";
        public static final String TARGET_PEG = "Target";
        public static final String SPARE_PEG = "Spare";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number of discs:");
            int numberOfDiscs = scanner.nextInt();
            solveTowersOfHanoi(numberOfDiscs, SOURCE_PEG, TARGET_PEG, SPARE_PEG);
            scanner.close();
        }

        // Solve towers of hanoi puzzle using recursion
        // Note the change roles of pegs internally
        private static void solveTowersOfHanoi(int numberOfDiscs, String sourcePeg, String targetPeg, String sparePeg) {
            if (numberOfDiscs == 1) {
                System.out.println(sourcePeg + " => " + targetPeg);
            } else {
                // Freilegen
                // löst Problem mit n-1 Scheiben
                solveTowersOfHanoi(numberOfDiscs - 1, sourcePeg, sparePeg, targetPeg);
                // Wenn dies fertig ist, wird der letzte auf dem Source peg (der größte) auf den targetPeg gelegt
                System.out.println(sourcePeg + " => " + targetPeg);
                solveTowersOfHanoi(numberOfDiscs - 1, sparePeg, targetPeg, sourcePeg);
            }

        }
    }