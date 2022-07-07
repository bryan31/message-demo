package com.example.demo.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.Random;

@LiteflowComponent(id = "biz1", name = "获取业务动态值")
public class Biz1Cmp extends NodeComponent {
    @Override
    public void process() throws Exception {
        //模拟业务耗时
        int time = new Random().nextInt(1500);
        Thread.sleep(time);
    }
}
