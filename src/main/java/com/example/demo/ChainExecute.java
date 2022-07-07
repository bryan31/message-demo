package com.example.demo;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.core.FlowExecutor;
import com.yomahub.liteflow.flow.LiteflowResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class ChainExecute implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(ChainExecute.class);

    @Resource
    private FlowExecutor flowExecutor;

    @Override
    public void run(String... args) throws Exception {
        //第二个参数为流程入参，示例中没用到，所以传null，实际业务是有值的
        LiteflowResponse response = flowExecutor.execute2Resp("channelSenderChain", null, BatchMessageResultContext.class);
        BatchMessageResultContext context = response.getFirstContextBean();
        if (response.isSuccess()){
            log.info("执行成功，最终选择的渠道是{}", context.getFinalResultChannel());
        }else{
            log.error("执行失败", response.getCause());
        }
    }
}
