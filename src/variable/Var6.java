package variable;

public class Var6 {
    public static void main(String[] args) {
        int a;
        try {
            //System.out.println(a); // 초기화 되지 않아서 오류 발생
            System.out.println(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(1000);
    }
}
