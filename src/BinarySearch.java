import utils.Constant;
import utils.Timer;

import java.util.Arrays;

public class BinarySearch {
    /**
     * @param key 要找的数字
     * @param arr 有序数组
     * @return 数字的下标
     */
    public static int indexOf(int key, int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        // 被查找的key要么不存在, 要么存在于 arr[low..high]中
        while (low <= high) {
            // 取中位数下标, 若是小数会自动向下舍入
            int mid = (low + high) / 2;
            if (key < arr[mid]) high = mid - 1;
            else if (key > arr[mid]) low = mid + 1;
            else return mid;
        }

        return -1;
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        // 读取白名单数字
        int[] whitelist = new In(Constant.FILES + "largeAllowlist.txt").readAllInts();
        Arrays.sort(whitelist);
        timer.printRunTime("读取白名单排序成功:" + whitelist.length);
//        System.out.println(Arrays.toString(whitelist));
        // 读取输入的数字
        int[] inputText = new In(Constant.FILES + "largeText.txt").readAllInts();
//        System.out.println(Arrays.toString(inputText));
        timer.printRunTime("读取输入: " + inputText.length);
        // 用二分查找查出不在白名单的数字，并且输出
        for (int item : inputText) {
            if (indexOf(item, whitelist) == -1) {

            }
        }
        timer.printRunTime("结束");

    }
}
