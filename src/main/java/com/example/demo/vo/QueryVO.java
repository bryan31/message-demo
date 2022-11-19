package com.example.demo.vo;

/**
 * @author LiXiaoPing
 */
public class QueryVO {

    /**
     * 渠道名称
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
