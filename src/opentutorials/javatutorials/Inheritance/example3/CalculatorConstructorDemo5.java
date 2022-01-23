package opentutorials.javatutorials.Inheritance.example3;

//상위 클래스인 Calculator에는 left와 right 값을 초기화할 수 있는 좋은 생성자를 이미 만들어 놓자.
// 이것을 사용한다면 하위 클래스에서 left와 right의 값을 직접 설정하는 불필요한 절차를 생략할 수 있을 것이다. 어떻게 하면 상위 클래스의 생성자를 호출할 수 있을까?

//super는 상위 클래스를 가리키는 키워드다. 예제를 통해서 super의 사용법을 알아보자.


class Calculator{
    
    int left,right;
    
    //기본 생성자(파라미터가 없음)
    public Calculator(){}
    
    
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
    
    
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    
    public void sum() {
        System.out.println(this.left + this.right);
    }
    
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
    
}

//Calculator라는 기존의 객체를 참조하는 자식 클래스
class SubstractionableCalculator extends Calculator{
    
    //자식 클래스의 생성자
    public SubstractionableCalculator(int left,int right){
        super(left,right);
//        super 키워드는 부모 클래스를 의미한다. """여기에 ()붙이면 부모 클래스의 생성자를 의미"""하게 된다.
//        이렇게 하면 부모 클래스의 기본 생성자가 없어져도 오류가 발생하지 않는다.
    }
    
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorConstructorDemo5 {
    
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
