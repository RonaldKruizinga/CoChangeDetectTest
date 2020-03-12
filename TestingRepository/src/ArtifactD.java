import java.util.ArrayList;

public class ArtifactD {
    public static int method(int x){
        return 2*x;
    }

    private ArrayList<ArtifactD> children;

    public ArtifactD(){
        children = new ArrayList<>();
    }

    public void addChild(ArtifactD d){
        children.add(d);
    }
}
