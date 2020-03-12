public class ArtifactB {
    ArtifactA a;
    int w;
    public ArtifactB(){
        a = ArtifactA.Create();
        w = new ArtifactC("test").getZ();
        w = w + 1;
        w = w*2;
        w= w-4;
    }

    public int getW() {
        return w+1; //enjoy debugging this
    }
}
