/**
 * Created by hartmann on 3/8/14.
 */

import weka.classifiers.trees.UserClassifier;
import weka.core.Instance;
import weka.core.SerializationHelper;

import java.io.FileInputStream;

public class myTest {

    public static void main(String[] args) throws Exception {
        UserClassifier userClassifier = (UserClassifier) SerializationHelper.read(new FileInputStream("/DATA/manual_dt.model"));

        Instance instance = new Instance(1, new double [] {
                (double) 0, // tag
                (double) 1, // v.yMean,
                (double) 2,  // v.yVar,
                (double) 3,   //  v.s2Mean,
                (double) 7,    // v.s2Var,
                (double) 0.32,     // v.tilt,
                (double) 1,     // v.S2FTBins[0]
                (double) 1,     // v.S2FTBins[0]
                (double) 1,     // v.S2FTBins[0]
                (double) 1,     // v.S2FTBins[0]
                (double) 1,     // v.S2FTBins[0]
                (double) 1,     // v.S2FTBins[0]
                (double) 1,     // v.S2FTBins[0]
                (double) 1,     // v.S2FTBins[0]
                (double) 1,     // v.S2FTBins[0]
                (double) 1     // v.S2FTBins[0]
        } );

        System.out.println(userClassifier.classifyInstance(instance));
     }

}
