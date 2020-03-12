public class ArtifactA {
    public static ArtifactA Create(){
        return new ArtifactA();
    }

    public ArtifactA(){
        ArtifactD d = new ArtifactD();
        d.addChild(d);
    }
}
