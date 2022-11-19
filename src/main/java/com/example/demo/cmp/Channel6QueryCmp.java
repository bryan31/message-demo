package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL6;
import static com.example.demo.cmp.NodeIdConstant.CHANNEL6_QUERY;

import com.example.demo.context.BatchMessageResultContext;
import com.example.demo.vo.QueryVO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author LiXiaoPing
 */
@LiteflowComponent(id = CHANNEL6_QUERY, name = "获取渠道6剩余量")
public class Channel6QueryCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        //模拟查询业务耗时
        int time = ThreadLocalRandom.current().nextInt(1000);
        Thread.sleep(time);

        //mock下渠道6有3w条剩余量
        BatchMessageResultContext context = this.getFirstContextBean();
        context.addQueryVO(new QueryVO(CHANNEL6, 30000));
    }
}
