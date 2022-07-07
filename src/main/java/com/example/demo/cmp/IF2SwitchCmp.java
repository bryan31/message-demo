package com.example.demo.cmp;

import com.yomahub.liteflow.annotation.LiteflowComponent;
import com.yomahub.liteflow.core.NodeSwitchComponent;

import java.util.Random;

@LiteflowComponent(id = "if_2", name = "业务判断2")
public class IF2SwitchCmp extends NodeSwitchComponent {
    @Override
    public String processSwitch() throws Exception {
        //模拟业务耗时
        int time = new Random().nextInt(1000);
        Thread.sleep(time);

        //这里写死，你可以改成其他分支
        return "s3";
    }
}
