package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL5;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * 返回短信渠道5普通组件
 *
 * @author LiXiaoPing
 */
@LiteflowComponent(id = CHANNEL5, name = "返回短信渠道5")
public class Channel5Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        context.setFinalResultChannel(CHANNEL5);
    }
}
