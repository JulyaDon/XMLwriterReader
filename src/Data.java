import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by July on 15.11.2017.
 */
public class Data {
    String videoSource = "some/path";
    String videoDestination = "some/path";
    String parameters = "first second third";

    public Data(String source, String destination, String param){
        this.videoSource = source;
        this.videoDestination = destination;
        this.parameters = param;
    }

    public String getVideoSource(){
        return videoSource;
    }

    public String getVideoDestination(){
        return videoDestination;
    }

    public String getParameters(){
        return parameters;
    }
}
