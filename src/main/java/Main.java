// 문제 : 각각의 자동차가 서로 다른 최고속력으로 달리게 해주세요.
public class Main {
    public static void main(String[] args) {

        // 구현시작
        자동차 a자동차1 = new 자동차();
        a자동차1.최고속력 = 230;

        자동차 a자동차2 = new 자동차();
        a자동차2.최고속력 = 210;
        // 구현끝

        a자동차1.달리다();
        // 출력 => 자동차가 최고속력 230km로 달립니다.

        a자동차2.달리다();
        // 출력 => 자동차가 최고속력 210km로 달립니다.
    }
}

class 자동차 {
    // 구현
    public int 최고속력;

    void 달리다(){
        System.out.println("자동차가 최고속력 "+this.최고속력+"km로 달립니다.");
    }
}