package com.example.demo.cmp;

import static com.example.demo.cmp.NodeIdConstant.CHANNEL5;
import static com.example.demo.cmp.NodeIdConstant.IF_3;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 业务判断3选择组件，并行获取供应商渠道剩余量
 *
 * @author bryan31
 */
@LiteflowComponent(id = IF_3, name = "业务判断3，并行获取供应商渠道剩余量")
public class IF3SwitchCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws InterruptedException {
        // 模拟业务耗时
        int time = ThreadLocalRandom.current().nextInt(1000);
        Thread.sleep(time);

        // 这里写死，你可以改成其他
        return CHANNEL5;
    }
}
