package com.example.demo.cmp;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent(id = "channel1", name = "返回渠道1")
public class Channel1Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        context.setFinalResultChannel("channel1");
    }
}
