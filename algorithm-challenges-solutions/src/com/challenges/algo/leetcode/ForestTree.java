package com.challenges.algo.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class ForestTree {public int cutOffTree(List<List<Integer>> forest) {
	int[][] a = new int[forest.size()][forest.get(0).size()];
	for(int i=0; i<forest.size(); i++)
		for(int j=0; j<forest.get(0).size(); j++)
			a[i][j] = forest.get(i).get(j);
	
    List<Integer> l = new ArrayList<Integer>();
    Map<Integer , int[]> map = new HashMap<>();
    for(int i=0; i<a.length; i++)
    	for(int j=0; j<a[0].length; j++) {
    		if(a[i][j] != 0)	l.add(a[i][j]);
    		map.put(a[i][j], new int[]{i, j});
    	}
    Collections.sort(l);
    
    int ret = 0;
    int[] cur = new int[]{0, 0};
    for(int i : l) {
    	int tmp = getStep(a, cur, map.get(i));
    	if(tmp == -1)	return -1;
    	ret += tmp;
    	cur = map.get(i);
    }
    return ret;
}

private int getStep(int[][] a, int[] cur, int[] end) {
	boolean[][] m = new boolean[a.length][a[0].length];
	int[][] d = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
	int step = 0;
	boolean f = false;
	Queue<int[]> q = new LinkedList<int[]>();
	Queue<int[]> qq = new LinkedList<int[]>();
	q.add(cur);
	while(!q.isEmpty()) {
		int[] t = q.remove();
		if(t[0]==end[0] && t[1]==end[1]) {
			f = true;
			break;
		}
		
		for(int i=0; i<4; i++) {
			int x = t[0] + d[i][0], y = t[1] + d[i][1];
			if(x<0||y<0||x>=a.length||y>=a[0].length||a[x][y]==0||m[x][y])	continue;
			qq.add(new int[]{x,y});
			m[x][y]  = true;
		}
		
		if(q.isEmpty()) {
			q = qq;
			qq = new LinkedList<int[]>();
			step ++;
		}
	}
	
	return f ? step : -1;
}

}

