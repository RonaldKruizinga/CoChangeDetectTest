public class ArtifactB {
    ArtifactA a;
    int w;
    public ArtifactB(){
        a = ArtifactA.Create();
        w = new ArtifactC("test").getZ();
        w = w + 1;
    }
}
