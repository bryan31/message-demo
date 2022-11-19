package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL4;
import static com.example.demo.cmp.NodeIdConstant.CHANNEL4_QUERY;

import com.example.demo.context.BatchMessageResultContext;
import com.example.demo.vo.QueryVO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author bryan31
 */
@LiteflowComponent(id = CHANNEL4_QUERY, name = "获取渠道4剩余量")
public class Channel4QueryCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        //模拟查询业务耗时
        int time = ThreadLocalRandom.current().nextInt(1000);
        Thread.sleep(time);

        //mock下渠道4有7w条剩余量
        BatchMessageResultContext context = this.getFirstContextBean();
        context.addQueryVO(new QueryVO(CHANNEL4, 70000));
    }
}
