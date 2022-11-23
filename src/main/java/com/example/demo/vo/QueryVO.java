package com.example.demo.vo;

/**
 * 短信渠道剩余短信包数量数据类
 *
 * @author bryan31
 */
public class QueryVO {

    /**
     * 短信渠道名称
     */
    private final String channel;

    /**
     * 剩余短信包数量
     */
    private final int availCount;

    public QueryVO(String channel, int availCount) {
        this.channel = channel;
        this.availCount = availCount;
    }

    public String getChannel() {
        return channel;
    }


    public int getAvailCount() {
        return availCount;
    }

    @Override
    public String toString() {
        return "QueryVO{" +
            "channel='" + channel + '\'' +
            ", availCount=" + availCount +
            '}';
    }
}
