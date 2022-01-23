package opentutorials.javatutorials.overriding.example1;

//<<<<오버라이딩>>
//상속은 상위 클래스의 기능을 하위 클래스에게 물려주는 기능이다.
//-->즉 하위 클래스가 기존에 있던 상위 클래스의 기능들을 참조하여 사용하는 것이다.
// 그렇다면 하위 클래스는 상위 클래스의 메소드를 주어진 그대로 사용해야 할까?
// 만약 그래야 한다면 제약이 상당할 것이다.
// 이런 제약을 벗어나려면 하위 클래스가 부모 클래스의 기본적인 동작방법을 변경할 수 있어야 한다.
// 이런 맥락에서 도입된 기능이 메소드 오버라이딩(overriding)이다.

class Calculator{
    int left,right;
    
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
    
    public int multi(){
        return this.left*this.right;
    }
}

//ex)
//상속 시간의 예제를 살펴보자. 
//이전의 예제는 부모 클래스 Calculator의 기본적인 동작 방법을 참조하여 상속 받은 SubstractionableCalculator에 빼기 기능을 추가하고 있다. 
// 이것은 상위 클래스의 기능에 <<<<<단순히 새로운 기능만>>>>을 추가한 것이다.
// 만약 상위 클래스에서 물려 받은 메소드 sum을 호출했을 때 아래와 같이 그 결과를 좀 더 친절하게 알려줘야 한다면 어떻게 해야할까?
// -->오버라이딩: 하위 클래스에서 상의 클래스와 동일한 메소드를 정의하면 부모 클래스로부터 물려 받은 기본 동작 방법을 변경하는 효과를 갖게 된다



class SubstractionableCalculator extends Calculator {


//    하위 클래스에서 상의 클래스와 동일한 메소드를 정의하면 부모 클래스로부터 물려 받은 기본 동작 방법을 변경하는 효과를 갖게 된다
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
    
    //만약 부모 클래스의 메소드와 같은 로직을 가진다면 굳이 다시 쓸 필요 없이 super.해당 메서드를 해주면 된다.
//  (중복은 제거 되어야 한다. 생성자와 마찬가지로 super를 사용하면 이 문제를 해결 할 수 있다.)
    public int multi(){
       return super.multi(); //하위 클래스의 메소드에서 동일한 로직을 가지는 상위 클래스의 메소드를 호출하기 위해서 super를 사용하고 있다.
        // 덕분에 코드의 중복을 제거 할 수 있었다.
    }
    
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
//<<<<<주의점>>>
//overriding을 하기 위해서는 메소드의 리턴 형식이 같아야 한다.
//->예를 들어서 sum을 오버라이딩한다고 쳤을 때, 자식 클래스에서 return avg; 이런 식으로 int를 반환하면 안 된다.
//왜냐하면 이미 부모 클래스에서 반환형이 void이기 때문이다.
/*
*  오버라이딩을 하기 위해서는 아래의 조건을 충족시켜야 한다.
메소드의 이름
메소드 매개변수의 숫자와 데이터 타입 그리고 순서
메소드의 리턴 타입*/


public class CalculatorDemo {
    
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum(); //실행 결과는 30입니다.
//        실행결과는 c1.sum이 상위 클래스의 메소드가 아니라!!!!
//        하위 클래스의 메소드 sum을 실행하고 있다는 것을 보여준다.
        c1.avg();
        c1.substract();
    }
}
