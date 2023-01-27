/* lets discuss this with the help of an example 
 * we will count the majoirty element occuring more than (n/2) number of times.
 */
public class MooreVotingAlgo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1, 2, 2, 1, 2 };
        int ans = MooreVotingAlgo(arr);
        System.out.println(ans);
    }

    /*
     * so here in the following array we will simply increase the count of number
     * when we found the same occurance
     * else we will decrease the counter
     * Note : if the counter leads to zero on that condition we can say that
     * majority element == minority element.
     * 
     * in the below example the | signifies where the counter leads to zero.
     * and the last element to give non zero counter wins.
     * 7 7 5 7 5 1 | 5 7 | 5 5 7 7 | 5 5 5 5
     */

    private static int MooreVotingAlgo(int[] a) {
        int count = 0;
        int elm = 0;

        for (int i = 0; i < a.length; i++) {
            if (count == 0) {
                elm = a[i];
            }
            if (elm == a[i])
                count++;
            else
                count--;
        }

        return elm;
    }
}
