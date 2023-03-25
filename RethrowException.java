public class RethrowException {

    public static void test1() throws Exception {
        System.out.println("The Exception in test1() method");
        throw new Exception("thrown from test1() method");
        catch( Exception e){
        System.out.println("exception in test1");
        throw e; }
    }

    public static void test2() throws Throwable {
        try {
            test1();
        } catch (Exception e) {
            System.out.println("Inside test2() method");
            throw e;
        } finally {
            System.out.println("finally in test 2");
        }
    }

    public static void main(String[] args) throws Throwable {
        try {
            test2();
        } catch (Exception e) {
            System.out.println("Caught in main");
        }
    }
}
