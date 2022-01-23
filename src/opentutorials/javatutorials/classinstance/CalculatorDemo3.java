package opentutorials.javatutorials.classinstance;
//클래스 변수가 있다면(CalcaulatorDemo3 - (커밋 메세지: "The difference between the class member variable and the instance member variable 참고)
// 클래스 메소드도 있지 않을까? 물론 있다.!!

//지금까지의 예제 Calculator은 인스턴스 변수 left와 right를 이용해서 합계(sum)과 평균(avg)을 계산한다.
// 생각해보면 굳이 인스턴스가 left와 right의 값을 항상 유지하고 있어야 할 이유는 없다.
// 합계나 평균을 구할 때마다 좌항과 우항의 값을 주는 방식으로 계산을 할 수도 있다. 아래 예제를 보자.


class Calculator3{
    
    public static void sum(int left, int right){
        System.out.println(left+right);
    }
    
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
    
    
//    1.인스턴스 메소드는 클래스 맴버에 접근 할 수 있다.
//    2.클래스 메소드는 인스턴스 맴버에 접근 할 수 없다.
////  ----> 인스턴스 변수는 인스턴스가 만들어지면서 생성되는데, 클래스 메소드는 인스턴스가 생성되기 전에 만들어지기 때문에
//          클래스 메소드가 인스턴스 맴버에 접근하는 것은 존재하지 않는 인스턴스 변수에 접근하는 것과 같다.
//즉 만들어지는 선후 관계가 
// 클래스 (멤버) 변수/ 메소드 -----> 인스턴스 (멤버) 변수/메소드    이므로, 선후 관계를 따지면 이해가 쉽다 


public class CalculatorDemo3 {
    
// 아래의 경우와 같이 
// 만약 메소드가 인스턴스를 참조할 필요가 없다면!
// 클래스 메소드만을 사용해서 <<<불필요한 인스턴스의 생성을 막을 수 있다.>>>>
    
    public static void main(String[] args) {
        Calculator3.sum(10, 20);
        Calculator3.avg(10, 20);
        
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
}


