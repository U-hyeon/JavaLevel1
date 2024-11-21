package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수 리터럴. 기본 int
        byte b = 127;
        short s = 32767; // -32768 ~ 32767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,648
        // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L; // 대문자 L, 소문자 l 모두 가능하지만, 혼동의 여지가 있기 때문에 관례상 L 을 사용

        // 실수. 기본적으로 double이 사용됨. float 사용시 f 를 붙인다
        float f = 10.0f;
        double d = 10.0; // 정밀도가 더 높다
    }
}
