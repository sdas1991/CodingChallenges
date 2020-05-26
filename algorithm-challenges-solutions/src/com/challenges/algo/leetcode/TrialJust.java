package com.challenges.algo.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int minimumCostIncurred(int numTotalEdgeNodes, 
                            int numTotalAvailableNetworkRoutes, 
                            List<List<Integer>> networkRoutesAvailable, 
                            int numNewNetworkRoutesConstruct, 
                            List<List<Integer>> costNewNetworkRoutesConstruct)
	{
        //visited paths
        int totalCost=0;
        //all false nothing visited
        boolean[] visited=new boolean[numTotalEdgeNodes];
        int[] keys=new int[numTotalEdgeNodes];
        int[] parent=new int[numTotalEdgeNodes];
        
        int[][] adjacentMatrix=getAdjacentMatrix(networkRoutesAvailable,costNewNetworkRoutesConstruct,numTotalEdgeNodes);
        for(int i=0;i<numTotalEdgeNodes;i++){
            keys[i]=Integer.MAX_VALUE;
        }
        
        keys[0]=0;
        parent[0]=-1;
        
        for(int i=0;i<numTotalEdgeNodes-1;i++){
            int u=findMin(visited, keys);
            
            visited[u]=true;
            for(int v=0;v<numTotalEdgeNodes;v++){
                if(visited[v]==false && adjacentMatrix[u][v]!=Integer.MAX_VALUE & adjacentMatrix[u][v]<keys[v]){
                    parent[v]=u;
                    keys[v]=adjacentMatrix[u][v];
                }
            }
            
            for(int j=1;j<numTotalEdgeNodes;j++){
                totalCost=totalCost+adjacentMatrix[parent[j]][j];
            }
        }
		return totalCost;
         
         
        
    }
    //compare adjacent paths
    private static int[][] getAdjacentMatrix(List<List<Integer>> networkRoutesAvailable, List<List<Integer>> costNewNetworkRoutesConstruct,int numTotalEdgeNodes){
        
        int[][] adjMatrix2=new int[numTotalEdgeNodes][numTotalEdgeNodes];
        for(int i=0;i<numTotalEdgeNodes;i++){
            for(int j=0;j<numTotalEdgeNodes;j++){
                adjMatrix2[i][j]=Integer.MAX_VALUE;
            }
        }
        
        int count=0;
        for(int k=0;k<networkRoutesAvailable.size();k++){
            int start=networkRoutesAvailable.get(k).get(count)-1;
            int end=networkRoutesAvailable.get(k).get(count+1)-1;
            adjMatrix2[start][end]=0;
        }
        
        for(int k=0;k<costNewNetworkRoutesConstruct.size();k++){
            int start=costNewNetworkRoutesConstruct.get(k).get(count)-1;
            int end=costNewNetworkRoutesConstruct.get(k).get(count+1)-1;
            int cost=costNewNetworkRoutesConstruct.get(k).get(count+2)-1;
            adjMatrix2[start][end]=cost;
        }
        
        return adjMatrix2;
    }
    //find min value
    private static int findMin(boolean[] visited,int[] keys){
        int min=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0;i<keys.length;i++){
            if(visited[i]==false && keys[i]<min){
                min=keys[i];
                index=i;
            }
        }
        return index;
        
    }
    // METHOD SIGNATURE ENDS
}
public class TrialJust {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	

}
}
