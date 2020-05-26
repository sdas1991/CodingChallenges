package com.challenges.algo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrisonCell {
public int[] prisonAfterNDays(int[] cells, int N) {
	int[] firstSimulation = new int[8];
for (int i=1; i<7; i++) firstSimulation[i] = (cells[i-1] == cells[i+1] ? 1 : 0);
cells = firstSimulation.clone();
N -= 1;
int cycle = 1;
while (N-- > 0) {
    int[] nextSimulation = new int[8];
    for (int i=1; i<7; i++) nextSimulation[i] = (cells[i-1] == cells[i+1] ? 1 : 0);
    //if (Arrays.equals(firstSimulation, nextSimulation)) N %= cycle;
    cells = nextSimulation.clone();
    //cycle++;
}

return cells;
}

}
