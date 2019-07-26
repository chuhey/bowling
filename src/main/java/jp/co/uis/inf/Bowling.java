package jp.co.uis.inf;

/**
 * ボーリングのスコア計算プログラム
 *
 */
public class Bowling {
    public static int score(int[][] pinsOfEachFrames) {
        // wrong calculation
        int score = 0;
        for (int[] frame : pinsOfEachFrames) {
            for (int pins : frame) {
                score += pins;
            }
        }
        return score;
    }
}
