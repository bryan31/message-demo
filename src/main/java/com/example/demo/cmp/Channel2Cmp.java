package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL2;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author bryan31
 */
@LiteflowComponent(id = CHANNEL2, name = "返回短信渠道2")
public class Channel2Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        context.setFinalResultChannel(CHANNEL2);
    }
}
