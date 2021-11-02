package important_concepts;

/* todo DEBUGGING : f7, f8 and f9
      f7----> take you to inside a method
      f8----> line by line execution
      f9----> break point to breakpoint execution
 */
public class DebugJavaCode {

    public void forLoopWorking() {
// normal for loop
        for (int i = 0; i < 5; i++) {

            System.out.println("Value of i is -->" + i);
        }
    }
    // for each loop
    public void forEachLoopWorking() {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
    }


    public static void main(String[] args) {

        DebugJavaCode obj=new DebugJavaCode();

        obj.forLoopWorking();
        obj.forEachLoopWorking();
    }

}
