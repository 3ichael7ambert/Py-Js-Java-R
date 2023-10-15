// RIntegration.java
import org.rosuda.JRI.Rengine;

public class RIntegration {
    public static void main(String[] args) {
        Rengine re = new Rengine(new String[] { "--vanilla" }, false, null);

        re.eval("source('r/analysis.R')");

        double meanValue = re.eval("mean_value").asDouble();
        double sdValue = re.eval("sd_value").asDouble();

        System.out.println("Mean: " + meanValue);
        System.out.println("Standard Deviation: " + sdValue);

        re.end();
    }
}
