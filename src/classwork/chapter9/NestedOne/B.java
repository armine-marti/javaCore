package classwork.chapter9.NestedOne;

public class B implements A.NestedIF {
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}
