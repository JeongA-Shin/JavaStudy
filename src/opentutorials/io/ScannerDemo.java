package opentutorials.io;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        int i = sc.nextInt(); sc.nextInt()가 실행되면 자바는 사용자의 입력이 있을 때까지 변수 i에 값을 할당하지 않고 대기상태에 있게 된다

        while(sc.hasNextInt()) {
//            sc.hasNextInt()는 입력값이 생기기 전까지 실행을 유보시키는 역할을 한다.
//            만약 입력한 값이 int 형이 아닐 경우는 false를 리턴하고, int로 표현할 수 있는 형식의 숫자형인 경우는 true를 리턴한다.
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();
    }




}
