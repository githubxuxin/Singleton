package test;

public class ArrDemo {

    public static void main(String[] args) {
        // 创建数组的第一种方法
//       int[] arr = new int[6];
//       int intValue = arr[5];
//       System.out.println(intValue);

        // 创建数组的第二种方法
//        int[] x = {1,2,3,4};
//        System.out.println(x[1]);

        // 创建数组的第三种方法
        int[] y = new int[]{1,2,3,4,5};
        int m= 4;
        boolean length = isLength(m, y);
        if (length) {
            System.out.println(y[m]);
        } else {
            System.out.println("数组标越界");
        }
    }

    public static boolean isLength(int m, int[] arr) {
        boolean flag = false;
        int length = arr.length;
        if (m < length) {
            flag = true;
        }
        return flag;
    }

}
