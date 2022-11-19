package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.BIZ1;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 获取业务动态值普通组件
 * @author LiXiaoPing
 */
@LiteflowComponent(id = BIZ1, name = "获取业务动态值")
public class Biz1Cmp extends NodeComponent {
    @Override
    public void process() throws InterruptedException {
        // 模拟业务耗时
        int time = ThreadLocalRandom.current().nextInt(1500);
        Thread.sleep(time);
    }
}
