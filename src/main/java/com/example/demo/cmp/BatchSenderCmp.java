package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.BATCH_SENDER;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;
import java.util.concurrent.ThreadLocalRandom;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 批量发送器
 *
 * @author bryan31
 */
@LiteflowComponent(id = BATCH_SENDER, name = "批量发送器")
public class BatchSenderCmp extends NodeComponent {

    private static final Logger log = LoggerFactory.getLogger(BatchSenderCmp.class);

    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        log.info("最终获取到的渠道为:[{}]", context.getFinalResultChannel());

        // 模拟业务发送耗时
        int time = ThreadLocalRandom.current().nextInt(2000);
        Thread.sleep(time);
    }
}
