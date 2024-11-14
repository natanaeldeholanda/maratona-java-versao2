package javacore.Oexception.runtime.tes;

public class RunTimeExceptionTest01 {
    public static void main(String[] args) {
        //Checked e unchecked
        Object object = null;
        int[] nums = {1, 2, 3};
        System.out.println(nums[5]);
        //O object nem é executado pois assim que dá uma exception ele para a execução
        System.out.println(object.toString());
    }
}
