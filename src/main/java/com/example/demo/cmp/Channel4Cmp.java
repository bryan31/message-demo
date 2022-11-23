package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL4;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * 返回短信渠道4组件
 * @author LiXiaoPing
 */
@LiteflowComponent(id = CHANNEL4, name = "返回短信渠道4")
public class Channel4Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        context.setFinalResultChannel(CHANNEL4);
    }
}
