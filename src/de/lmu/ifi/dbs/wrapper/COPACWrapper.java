package de.lmu.ifi.dbs.wrapper;

import de.lmu.ifi.dbs.algorithm.KDDTask;
import de.lmu.ifi.dbs.distance.EuklideanDistanceFunction;
import de.lmu.ifi.dbs.normalization.AttributeWiseDoubleVectorNormalization;

/**
 * Wrapper class for COPAC algorithm.
 *
 * @author Elke Achtert (<a href="mailto:achtert@dbs.ifi.lmu.de">achtert@dbs.ifi.lmu.de</a>)
 */
public class COPACWrapper {

  public static void main(String[] args) {

    String[] param1 = {
    "-algorithm", "COPAC"
//      "-algorithm", "KNNJoin"
//      "-algorithm", "OPTICS"
    , "-partAlg", "DBSCAN"
    , "-preprocessor", "de.lmu.ifi.dbs.preprocessing.KnnQueryBasedCorrelationDimensionPreprocessor"
    , "-epsilon", "10"
//      , "-epsilon", "1x100000"
    , "-minpts", "18"
    , "-database", "de.lmu.ifi.dbs.database.SequentialDatabase"
    , "-norm", AttributeWiseDoubleVectorNormalization.class.getName()
//      , "-database", RTreeDatabase.class.getName()
//      , "-" + SpatialIndexDatabase.BULK_LOAD_F
//      , "-distancefunction", "de.lmu.ifi.dbs.distance.LocallyWeightedDistanceFunction"
//      , "-distancefunction", CorrelationDistanceFunction.class.getName()
    , "-distancefunction", EuklideanDistanceFunction.class.getName()
    , "-in", "P:/nfs/infdbs/Publication/RECOMB06-ACEP/experiments/data/GDS42.txt"
//      , "-out", "results/partitionTest/partitionT1"
//      , "-out", "results/partitionTest/partitionT2"
    , "-out", "results/acep/GDS42"
    , "-verbose"
    , "-time"
    //      ,"-" + RTreeDatabase.FILE_NAME_P, "elki.idx"
    //      ,"-" + RTreeDatabase.FLAT_DIRECTORY_F
    //    , "-" + SpatialIndexDatabase.BULK_LOAD_F
    //    , "-" + RTreeDatabase.CACHE_SIZE_P, "50000000"
    //    , "-" + RTreeDatabase.PAGE_SIZE_P, "16000"
    };


    KDDTask task = new KDDTask();
    task.setParameters(param1);
    task.run();
  }


}
