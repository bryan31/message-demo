package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL1;
import static com.example.demo.cmp.NodeIdConstant.IF_1;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 业务判断1流程选择组件：选择短信渠道
 * @author bryan31
 */
@LiteflowComponent(id = IF_1, name = "业务判断1：选择短信渠道")
public class IF1SwitchCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws InterruptedException {
        // 模拟业务耗时
        int time = ThreadLocalRandom.current().nextInt(1000);
        Thread.sleep(time);

        // 这里写死跳到并行获取剩余量那条分支，你可以改成其他分支测试
        return CHANNEL1;
    }
}
