package utils;

public class Timer {
    private double begin = 0;

    public Timer() {
        resetBegin();
    }

    public void resetBegin() {
        begin = System.currentTimeMillis(); // 程序开始时间，调用系统的当前时间
    }

    public void printRunTime(String label) {
        printRunTime();
        System.out.println(label);
    }

    /**
     * 打印时间差，从begin开始
     */
    public void printRunTime() {
        // 你要运行的程序
        double end = System.currentTimeMillis(); // 程序结束时间，调用系统当前时间
        //System.out.println("end="+end);
        double time = end - begin;// 程序的运行时间
        begin = end;
        System.out.print("【" + time + "ms】");
    }
}