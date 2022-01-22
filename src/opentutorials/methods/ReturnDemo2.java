package opentutorials.methods;

public class ReturnDemo2 {
//    public static String num(int i) { //리턴값이 있으면 c++처럼 반환형을 반드시! 명시해줘야 한다!
//        if(i==0){
//            return "zero";
//        } else if(i==1){
//            return "one";
//        } else if(i==2){
//            return "two";
//        }
//        return "none";
//    }
//
//    public static void main(String[] args) {
//        System.out.println(num(1));
//    }


    //반환 자료형이 배열도 가능함!
    public static String[] getMembers() {
        String[] myMem = { "최혁", "최빈", "한이" };
        return myMem; //이렇게 배열 자체를 리턴해줄 수도 있다!
    }


    public static void main(String[] args) {
        String[] members = getMembers();
        System.out.println(members[0]);
    }


}
