package opentutorials.array;

public class ForeachDemo {

    public static void main(String[] args){
        String[] members={"최진혁","최유빈","한이람"};
//        일반적인 for 반복문
//        for(int i = 0; i < members.length; i++) {
//            String member = members[i];
//            System.out.println(member + "이 상담을 받았습니다"); 
//        }

//        for each 문법 사용해서 돌리기
        for(String e:members){
            System.out.println(e);
        }
        
        
        //배열 선언한는 방법
        String[] members2=new String[5]; 
        //5칸 짜리 배열임
    }
}
