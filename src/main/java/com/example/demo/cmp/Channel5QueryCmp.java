package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL5;
import static com.example.demo.cmp.NodeIdConstant.CHANNEL5_QUERY;

import com.example.demo.context.BatchMessageResultContext;
import com.example.demo.vo.QueryVO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 获取渠道5剩余量
 *
 * @author LiXiaoPing
 */
@LiteflowComponent(id = CHANNEL5_QUERY, name = "获取渠道5剩余量")
public class Channel5QueryCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        //模拟查询业务耗时
        int time = ThreadLocalRandom.current().nextInt(1000);
        Thread.sleep(time);

        //mock下渠道5有5000条剩余量
        BatchMessageResultContext context = this.getFirstContextBean();
        context.addQueryVO(new QueryVO(CHANNEL5, 5000));
    }
}
