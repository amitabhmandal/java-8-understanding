package batch.understanding;

import javax.batch.api.AbstractBatchlet;
import javax.batch.runtime.BatchStatus;
import javax.inject.Named;

@Named
public class SimpleBatchLet extends AbstractBatchlet {

    @Override
    public String process() throws Exception {
        System.out.println("batchlet running");
        return BatchStatus.COMPLETED.toString();
    }

}
