package com.example.demo.cmp;

import com.example.demo.context.BatchMessageResultContext;
import com.example.demo.vo.QueryVO;
import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.Random;

@LiteflowComponent(id = "channel3Query", name = "获取渠道3剩余量")
public class Channel3QueryCmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        //模拟查询业务耗时
        int time = new Random().nextInt(1000);
        Thread.sleep(time);

        //mock下渠道3有10w条剩余量
        BatchMessageResultContext context = this.getFirstContextBean();
        context.addQueryVO(new QueryVO("channel3", 100000));
    }
}
