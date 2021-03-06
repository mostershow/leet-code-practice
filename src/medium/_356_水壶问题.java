package medium;

/**
 * 有两个容量分别为 x升 和 y升 的水壶以及无限多的水。请判断能否通过使用这两个水壶，从而可以得到恰好 z升 的水？

 如果可以，最后请用以上水壶中的一或两个来盛放取得的 z升 水。

 你允许：

 装满任意一个水壶
 清空任意一个水壶
 从一个水壶向另外一个水壶倒水，直到装满或者倒空
 示例 1: (From the famous "Die Hard" example)

 输入: x = 3, y = 5, z = 4
 输出: True
 示例 2:

 输入: x = 2, y = 6, z = 5
 输出: False
 */
public class _356_水壶问题 {
    public static boolean canMeasureWater(int x, int y, int z) {
        if(z==0&&x+y==0){
            return true;
        }
        if(x+y==0&&z!=0){
            return false;
        }
        if(y==0||x==0){
            if(z%(x+y)==0){
                return true;
            }else {
                return false;
            }
        }
        if(x>y){
            if(z%x==0||z%y==0||z%(y-x)==0||z%(2*x-y)==0||z%(y%(x%y))==0){
                return true;
            }else{
                return false;
            }
        }else if(y>x){
            if(z%x==0||z%y==0||z%(x-y)==0||z%(2*y-x)==0||z%(x%(y%x))==0){
                return true;
            }else{
                return false;
            }
        }else{
            if(z%x==0){
                return true;
            }else {
                return false;
            }
        }

    }

    public static void main(String[] args) {

        System.out.println(canMeasureWater(34,5,6));
    }
}
