package javainuse.route;


import javainuse.processor.MyProcessor;
import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {
    public void configure() throws Exception {
        from("file:C:/inputFolder?noop=true").process(new MyProcessor()).to("file:C:/outputFolder");
    }
}
