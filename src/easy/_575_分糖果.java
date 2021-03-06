package easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: candies = [1,1,2,2,3,3]
 * 输出: 3
 * 解析: 一共有三种种类的糖果，每一种都有两个。
 * 最优分配方案：妹妹获得[1,2,3],弟弟也获得[1,2,3]。这样使妹妹获得糖果的种类数最多。
 * 示例 2 :
 * <p>
 * 输入: candies = [1,1,2,3]
 * 输出: 2
 * 解析: 妹妹获得糖果[2,3],弟弟获得糖果[1,1]，妹妹有两种不同的糖果，弟弟只有一种。这样使得妹妹可以获得的糖果种类数最多。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/distribute-candies
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _575_分糖果 {
    public static int distributeCandies(int[] candies) {
        //HashSet 去重最好的工具
        HashSet<Integer> set = new HashSet<Integer>();
        //遍历数组，将数组中的元素添加至set中（重复则覆盖）
        for (int candy : candies) {
            set.add(candy);
        }
        //判断最后整个set中拥有的糖果种类数量和分到手中的糖果数量相比较返回小值
        return Math.min(set.size(), candies.length / 2);
    }
    //test
    public static void main(String[] args) {
        int [] a = {1,1,2,2,3,3};
        System.out.println(distributeCandies(a));
    }

}
