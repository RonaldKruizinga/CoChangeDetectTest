public class Independent {
    public static class SubClass{
        static int x;
    }

    public static SubClass instance;

    public static SubClass getInstance(){
        if(instance == null){
            instance = new SubClass();
        }
        return instance;
    }

    public Independent(int x){
        SubClass.x = x;
    }

}
