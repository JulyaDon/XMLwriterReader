import java.io.IOException;

/**
 * Created by July on 15.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        Data data = null;
        XMLwriterReader reader = new XMLwriterReader("src/data.xml");

        try {
            data = (Data)reader.ReadFile(Data.class);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Video source: " + data.getVideoSource());
        System.out.println("Video destination: " + data.getVideoDestination());
        System.out.println("Parameters: " + data.getParameters());
    }
}
