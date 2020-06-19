package kata_8kyu;

public class AreaOfPerimeter {
    public static int areaOfPerimeter(int l, int w){
        if (l == w){
            return l * w;
        } else {
            return 2 * l + 2* w;
        }
    }
}
