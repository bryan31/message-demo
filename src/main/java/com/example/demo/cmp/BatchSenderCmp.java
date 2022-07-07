package com.example.demo.cmp;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

@LiteflowComponent(id = "batchSender", name = "批量发送器")
public class BatchSenderCmp extends NodeComponent {

    private static final Logger log = LoggerFactory.getLogger(BatchSenderCmp.class);

    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        log.info("最终获取到的渠道为:[{}]", context.getFinalResultChannel());

        //模拟业务发送耗时
        int time = new Random().nextInt(2000);
        Thread.sleep(time);
    }
}
