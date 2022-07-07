package com.example.demo.cmp;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

@LiteflowComponent(id = "channel2", name = "返回渠道2")
public class Channel2Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        context.setFinalResultChannel("channel2");
    }
}
