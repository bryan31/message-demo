package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL1;
import static com.example.demo.cmp.NodeIdConstant.CHANNEL1_QUERY;

import com.example.demo.context.BatchMessageResultContext;
import com.example.demo.vo.QueryVO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 获取渠道1剩余量
 * @author bryan31
 */
@LiteflowComponent(id = CHANNEL1_QUERY, name = "获取渠道1剩余量")
public class Channel1QueryCmp extends NodeComponent {
    @Override
    public void process() throws InterruptedException {
        // 模拟查询业务耗时
        int time = ThreadLocalRandom.current().nextInt(1000);
        Thread.sleep(time);

        // mock下渠道1有2w条剩余量
        BatchMessageResultContext context = this.getFirstContextBean();
        context.addQueryVO(new QueryVO(CHANNEL1, 20000));
    }
}
