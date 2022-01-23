package opentutorials.javatutorials.Inheritance.example1;

//상속이란?
//"기존의 객체를 그대로 유지하면서" 어떤 [[[[[[기능을 추가하는 방법]]]]]이 없을까?
// 이런 맥락에서 등장하는 것이 상속이다.

//즉 "기존의 객체"를 """수정하지 않으면서"""  새로운 객체가 기존의 객체를 "기반으로" 만들어지게 되는 것이다

//->즉 기존에서 내가 필요한 기능 몇 가지만 더하고 싶을 때 만든다


//기존의 객체(클래스)- 즉 부모 클래스
class Calculator{
    
    int left,right;
    
    public void setOperands(int left,int right){
        this.left=left;
        this.right=right;
    }
    
    public void sum() {
        System.out.println(this.left + this.right);
    }
    
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}


//기존의 클래스(객체)를 참조해서 내가 쓰고 싶은 기능을 추가해서 만든 자식 클래스
class SubstractionableCalculator extends Calculator{
    //내가 추가한 기능(메서드)
    public void substract(){
        System.out.println(this.left-this.right); //자식 클래스에서 부모의 멤버 변수(인스턴스 변수이든 클래스 변수이든)를 자유롭게 참조해서 쓸 수 있음
    }
    
}
public class CalculatorDemo1 {
    
    public static void main(String[] args){
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOperands(10, 20);
        //자식 인스턴스가 부모의 멤버 메서드들을 자유롭게 호출할 수 있음(어쨌든 부모 기반이므로)
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
