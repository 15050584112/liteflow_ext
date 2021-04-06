package com.yomahub.liteflow.test.subflow.cmp2;

import com.yomahub.liteflow.core.NodeComponent;
import org.springframework.stereotype.Component;

import static com.yomahub.liteflow.test.subflow.ImplicitSubFlowTest.RUN_TIME_SLOT;


@Component("m")
public class MCmp extends NodeComponent {
    @Override
    public void process() throws Exception {

        RUN_TIME_SLOT.add(this.getSlotIndex());

        System.out.println("Mcomp executed!");
    }
}
