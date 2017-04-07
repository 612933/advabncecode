import org.apache.hadoop.mapreduce.Partitioner;

 
public class CustomPartitioner extends Partitioner<CompositeKey, DonationWritable> {
 
    @Override
    public int getPartition(CompositeKey key, DonationWritable value, int numPartitions) {
 
        if (key.state.compareTo("J") < 0) {
            return 0;
        } else if (key.state.compareTo("R") < 0) {
            return 1;
        } else {
            return 2;
        }
    }
}  