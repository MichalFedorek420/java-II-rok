package WłasneProjekty;
import java.io.File;
import java.util.Objects;
import java.util.stream.Stream;

public class FileManager {
    public void ListFilesInDirectory(String directory){

        Stream.of(Objects.requireNonNull(new File(directory).listFiles()))
            .filter(File::isFile)
            .map(File::getName)
            .forEach(System.out::println);
    }


    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        fileManager.ListFilesInDirectory("/Workspace/IIrokJava/lekcja2");
    }//gowno chujowe nie chce dzialaxc
}
