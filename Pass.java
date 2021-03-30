public class Pass {
    public static void main(String[] args) {
        ParamTest pt = new ParamTest();
        int i = 10;
        pt.pass(i);
        System.out.println("print main is " +i);
    }

    public void pass(int j){
        j = 20;
        System.out.println("print pass is"+j);
    }
}
