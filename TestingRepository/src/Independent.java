public class Independent {
    public static class SubClass{
        int x;
    }

    public static SubClass instance;

    public static SubClass getInstance(){
        if(instance == null){
            instance = new SubClass();
        }
        return instance;
    }
}
