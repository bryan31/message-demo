package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL1;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * @author LiXiaoPing
 */
@LiteflowComponent(id = CHANNEL1, name = "返回短信渠道1")
public class Channel1Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        context.setFinalResultChannel(CHANNEL1);
    }
}
