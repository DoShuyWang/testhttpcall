package math;

/**
 * Created by doshuy on 07/14/2017.
 */
public class Test {

    @org.junit.Test
    public void test1() {

        boolean result = false;

        for (int i = 0; i < 10000; i++) {
            result = i % 1 == 0 && i % 2 == 0 && i % 3 == 0 && i % 4 == 2 && i % 5 == 4 && i % 6 == 0 && i % 7 == 5 && i % 8 == 2 && i % 9 == 0;
            if (result) {
                System.out.println("框里有鸡蛋 " + i + " 个");
            } else {
                //System.out.println("这个不对 —— " + i );
            }
        }

    }
}
