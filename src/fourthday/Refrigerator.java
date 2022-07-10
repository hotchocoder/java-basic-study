package fifthday;

public class Refrigerator {
    float 음식수;
    int 이동횟수;

    float sum(int 넣은갯수){
        return 음식수 + 넣은갯수;
    }
    float diff(int 뺀갯수){
        return 음식수 - 뺀갯수;
    }

    void equalact(){
        System.out.println(음식수);
    }
    void clear(){
        음식수 = 0;
        이동횟수 = 0;
    }
    void 이동횟수(){
        System.out.println(이동횟수);
    }

}
