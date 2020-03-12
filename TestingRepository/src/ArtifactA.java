public class ArtifactA {
    public static ArtifactA Create(){
        return new ArtifactA();
    }

    public ArtifactA(){
        ArtifactD d = new ArtifactD();
        int c = d.addChild(d);
        System.out.println("twice the child count:" + c);
    }
}
