import java.nio.file.FileSystem;

/**
 * Created by 84098 on 2020/3/8.
 */
public class FlinkDemo {
    public static void main(String[] args) {
        String path = FlinkDemo.class.getClassLoader().getResource("wordCount.txt").getPath();
        System.out.println(path);

    }
}
