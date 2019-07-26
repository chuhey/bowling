package jp.co.uis.inf;

import static org.junit.Assert.assertTrue;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * ボーリングのスコア計算のテストクラス
 */
public class BowlingTest {

    @Test
    public void testNoSparesAndStrikes() {
        int[][] pins = new int[][] {
            {1, 2},  // No.1 frame
            {3, 4},  // No.2 frame
            {5, 0},  // No.3 frame
            {0, 6},  // No.4 frame
            {7, 0},  // No.5 frame
            {0, 8},  // No.6 frame
            {9, 0},  // No.7 frame
            {2, 4},  // No.8 frame
            {3, 3},  // No.9 frame
            {1, 9, 5}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(72));
    }

    @Test
    public void testSpare() {
        int[][] pins = new int[][] {
            {4, 6},  // No.1 frame ( spare )
            {2, 5},  // No.2 frame ( 2 pins & 5 pins )
            {0, 0},  // No.3 frame
            {0, 0},  // No.4 frame
            {0, 0},  // No.5 frame
            {0, 0},  // No.6 frame
            {0, 0},  // No.7 frame
            {0, 0},  // No.8 frame
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(19));
    }

    @Test
    public void test1Strike() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {0, 0},  // No.2 frame
            {0, 0},  // No.3 frame
            {0, 0},  // No.4 frame
            {0, 0},  // No.5 frame
            {0, 0},  // No.6 frame
            {0, 0},  // No.7 frame
            {0, 0},  // No.8 frame
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(10));
    }

    @Test
    public void test2Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {0, 0},  // No.3 frame
            {0, 0},  // No.4 frame
            {0, 0},  // No.5 frame
            {0, 0},  // No.6 frame
            {0, 0},  // No.7 frame
            {0, 0},  // No.8 frame
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(30));
    }

    @Test
    public void test3Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {0, 0},  // No.4 frame
            {0, 0},  // No.5 frame
            {0, 0},  // No.6 frame
            {0, 0},  // No.7 frame
            {0, 0},  // No.8 frame
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(60));
    }

    @Test
    public void test4Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {0, 0},  // No.5 frame
            {0, 0},  // No.6 frame
            {0, 0},  // No.7 frame
            {0, 0},  // No.8 frame
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(90));
    }

    @Test
    public void test5Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {10, 0}, // No.5 frame ( strike )
            {0, 0},  // No.6 frame
            {0, 0},  // No.7 frame
            {0, 0},  // No.8 frame
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(120));
    }

    @Test
    public void test6Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {10, 0}, // No.5 frame ( strike )
            {10, 0}, // No.6 frame ( strike )
            {0, 0},  // No.7 frame
            {0, 0},  // No.8 frame
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(150));
    }

    @Test
    public void test7Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {10, 0}, // No.5 frame ( strike )
            {10, 0}, // No.6 frame ( strike )
            {10, 0}, // No.7 frame ( strike )
            {0, 0},  // No.8 frame
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(180));
    }

    @Test
    public void test8Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {10, 0}, // No.5 frame ( strike )
            {10, 0}, // No.6 frame ( strike )
            {10, 0}, // No.7 frame ( strike )
            {10, 0}, // No.8 frame ( strike )
            {0, 0},  // No.9 frame
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(210));
    }

    @Test
    public void test9Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {10, 0}, // No.5 frame ( strike )
            {10, 0}, // No.6 frame ( strike )
            {10, 0}, // No.7 frame ( strike )
            {10, 0}, // No.8 frame ( strike )
            {10, 0}, // No.9 frame ( strike )
            {0, 0, 0}// No.10 frame
        };
        int score = Bowling.score(pins);
        assertThat(score, is(240));
    }

    @Test
    public void test10Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {10, 0}, // No.5 frame ( strike )
            {10, 0}, // No.6 frame ( strike )
            {10, 0}, // No.7 frame ( strike )
            {10, 0}, // No.8 frame ( strike )
            {10, 0}, // No.9 frame ( strike )
            {10, 0, 0}// No.10 frame ( strike only 1st throw )
        };
        int score = Bowling.score(pins);
        assertThat(score, is(270));
    }


    @Test
    public void test11Strikes() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {10, 0}, // No.5 frame ( strike )
            {10, 0}, // No.6 frame ( strike )
            {10, 0}, // No.7 frame ( strike )
            {10, 0}, // No.8 frame ( strike )
            {10, 0}, // No.9 frame ( strike )
            {10, 10, 0}// No.10 frame ( strike 1st & 2nd throws )
        };
        int score = Bowling.score(pins);
        assertThat(score, is(290));
    }

    @Test
    public void testPerfect() {
        int[][] pins = new int[][] {
            {10, 0}, // No.1 frame ( strike )
            {10, 0}, // No.2 frame ( strike )
            {10, 0}, // No.3 frame ( strike )
            {10, 0}, // No.4 frame ( strike )
            {10, 0}, // No.5 frame ( strike )
            {10, 0}, // No.6 frame ( strike )
            {10, 0}, // No.7 frame ( strike )
            {10, 0}, // No.8 frame ( strike )
            {10, 0}, // No.9 frame ( strike )
            {10, 10, 10}// No.10 frame ( strike all throws )
        };
        int score = Bowling.score(pins);
        assertThat(score, is(300));
    }
}
