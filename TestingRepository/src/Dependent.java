public class Dependent {
    public Dependent(){
        Cyclic.cyclicMethod();
        Cyclic.MethodFactoryBuilderLogger();
    }

    public String rant(){
        return "I still feel like string should be an acceptable primitive like in C#";
    }
}
