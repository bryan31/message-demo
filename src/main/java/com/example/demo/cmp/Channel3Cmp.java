package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL3;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * 返回短信渠道3组件
 *
 * @author bryan31
 */
@LiteflowComponent(id = CHANNEL3, name = "返回短信渠道3")
public class Channel3Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        context.setFinalResultChannel(CHANNEL3);
    }
}
