package opentutorials.javatutorials.constructor;

//클래스 생성자의 필요성:
//이전까지의 예제에서 객체 Calculator를 사용하기 위해서 사용자는 메소드 sum을 호출하기 전에 setOprands를 호출해야 한다는 것을 기억하고 있어야 한다는 것을 의미한다.
// 이러한 절차를 기억해야 한다는 것은 사용자 입장에서는 불편할 뿐 아니라 잘못된 사용으로 오류가 발생할 확률을 높이는 결과를 초래 할 수 있다.

//<<그래서 사용하는 것이 생성자(Constructor)이다. >>
// 아래와 같이 인스턴스가 생성될 때 left, right의 값을 입력하도록 강제한다면 어떨까?

class Calculator{
    
    int left,right;
    
    //생성자 - 클래스와 이름 같음, 반환형 없음
    public Calculator(int left,int right){
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

//생성자 덕분에 Calculator 객체를 사용하기 위해서
// 사실상 반드시 필요한 작업이라고 할 수 있는 좌항(left)과 우항(right)의 값을 설정하는 과정을 객체 생성 과정에서 강제할 수 있게 되었다
// 절차에 필수적인 작업을 포함시킨다는 것은 중요한 의미를 갖게 된다.



public class CalculatorDemo1 {
    
    public static void main(String[] args) {
        
        Calculator c1 = new Calculator(10, 20);
        c1.sum();
        c1.avg();
        
        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
}
