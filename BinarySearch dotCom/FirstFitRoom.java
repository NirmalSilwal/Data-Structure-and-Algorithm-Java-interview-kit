import java.util.*;
/*
You are given a list of integers rooms and an integer target. Return the first integer in rooms that's target or larger. If there is no solution, return -1.
*/

class Solution {
    public int solve(int[] rooms, int target) {
        
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == target || rooms[i] > target) {
                return rooms[i];
            }
        }
        return -1;
    }
}