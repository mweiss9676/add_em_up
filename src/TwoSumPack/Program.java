/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TwoSumPack;

/**
 *
 * @author Michael
 */
public class TwoSumPack {
    public static void main(String[] args)
    {
        int[] a = {2, 4, 23, 5, 6, 25};
        int b = 28;
        Sums.sum(b, a);
    }
}

class Sums
{
    public static void sum(int target, int[] set)
    {
        for (int x = 0; x < set.length; x++)
        {
            for (int y = 1; y < set.length; y++)
            {
                if (set[x] + set[y] == target)
                {
                    System.out.println("integer " + set[x] + " at position "
                    + x + " and integer " + set[y] + " at position " + y + 
                            " add up to " + target);
                }
                else
                {
                    System.out.println("No values exist in the set that add up"
                            + "to the target value");
                }
            }
        }
    }
}
