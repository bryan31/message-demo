package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL6;

import com.example.demo.context.BatchMessageResultContext;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

/**
 * 返回短信渠道6普通组件
 *
 * @author LiXiaoPing
 */
@LiteflowComponent(id = CHANNEL6, name = "返回短信渠道6")
public class Channel6Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        BatchMessageResultContext context = this.getFirstContextBean();
        context.setFinalResultChannel(CHANNEL6);
    }
}
