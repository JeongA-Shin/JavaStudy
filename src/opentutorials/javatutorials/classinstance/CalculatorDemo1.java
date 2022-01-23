package opentutorials.javatutorials.classinstance;


class Calculator{
    static double PI=3.14;
// 아래 left,right와 같은 인스턴스 멤버 변수와 달리
// 모든 인스턴스가 같은 값을 공유하게 하고 싶을 때가 있다.
// 예를 들어 원주율은 인스턴스와 상관없이 늘 동일하므로
// 값을 별도로 가지고 있을 필요가 없다. 이런 경우 변수를 클래스의 맴버로 만들면 된다.
//static을 맴버(변수,메소드) 앞에 붙이면 클래스의 맴버가 된다.
    
    //클래스의 멤버변수로 base를 하나 더 만들자
    static int base=0;
    
    int left,right;
//    left와 right 변수는 누구의 맴버일까? 인스턴스의 맴버다.
//    인스턴스를 만들어야 사용할 수 있었고,<<<<< 인스턴스마다 서로 다른 값을 가지고 있기 때문이다.>>>>>>>
    
    
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
    
    
//    클래스 변수의 용도를 정리해보면 아래와 같다.
//
//    1.인스턴스에 따라서 변하지 않는 값이 필요한 경우 (위의 예에서는 PI)
//     -(이런 경우 final을 이용해서 상수로 선언하는 것이 바람직 하지만 final을 아직 배우지 않았기 때문에 언급하지 않았다)
//    2.인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
////  3.값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우


public class CalculatorDemo1 {
    
    public static void main(String[] args) {
    
//        클래스 변수에 접근하는 방법 두가지
        
        //1. 인스턴스를 통해서 PI에 접근
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);
        
        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
    
        //2. 클래스를 통해서 PI에 접근
//        두번째 방법은 객체 Calculator.java의 다른 기능(sum, avg)은 필요없고,
//        원주율만 필요할 때 클래스에 직접 접근하기 때문에 인스턴스를 생성할 필요가 없어진다.
        
        System.out.println(Calculator.PI);
        
        // "클래스의" 멤버변수의 값을 바꿀 수도 있다.
        System.out.println(Calculator.base); //0
        Calculator.base=20;
        System.out.println(Calculator.base); //20
        
    }
}
