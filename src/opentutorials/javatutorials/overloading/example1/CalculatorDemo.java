package opentutorials.javatutorials.overloading.example1;

//우리의 계산기는 2개의 값(left, right)에 대한 연산(sum, avg) 만을 수행 할 수 있다.
// 그런데 만약 3개의 값을 대상으로 연산을 해야 한다면 어떻게 해야할까?

// 아예 새로운 함수를 만드는 것은 너무 비효율적이다. 이렇게 파라미터만 달라지는 경우 오버로딩을 사용핞다.


//결론적으로 말하면 메소드 오버로딩은 매개변수를 사용한다.즉 매개변수가 다르면 이름이 같아도 서로 다른 메소드가 되는 것이다.
// 반면에 매개변수는 같지만 <<<리턴타입이 다르면>>> 오류가 발생한다.!!!!!!!!!!!!!!!1


class Calculator{
    int left,right;
    int third=0;
    
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
    
    public void setOprands(int left, int right, int third){
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }
    
    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }
    
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
    
}


// overloading을 이용해서 같은 이름, 다른 매개변수의 메소드들을 여러개 만들 수 있다는 사실을 아는 것이 중요하다.
public class CalculatorDemo {
    
    public static void main(String[] args) {
        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();
        c1.avg();
        
    }
}
