package com.example.demo.cmp;

/**
 * 流程组件Id常量声明
 *
 * @author 李小平
 */
public class NodeIdConstant {
  private NodeIdConstant() {}

  /**
   * 组装数据组件Id
   */
  public static final String PACKAGE_DATA = "packageData";

  /**
   * 业务判断1组件Id（选择短信渠道）
   */
  public static final String IF_1 = "if_1";

  /**
   * 短信渠道1组件Id
   */
  public static final String CHANNEL1 = "channel1";

  /**
   * 短信渠道2组件Id
   */
  public static final String CHANNEL2 = "channel2";

  /**
   * 获取业务动态值组件Id
   */
  public static final String BIZ1 = "biz1";

  /**
   * 业务判断2组件Id（选择短信渠道）
   */
  public static final String IF_2 = "if_2";


  /**
   * 短信渠道3组件Id（并行获取供应商渠道剩余量）
   */
  public static final String CHANNEL3 = "channel3";

  /**
   * 短信渠道4组件Id
   */
  public static final String CHANNEL4 = "channel4";

  /**
   * 业务判断3组件Id
   */
  public static final String IF_3 = "if_3";

  /**
   * 短信渠道5组件Id
   */
  public static final String CHANNEL5 = "channel5";

  /**
   * 短信渠道6组件Id
   */
  public static final String CHANNEL6 = "channel6";

  /**
   * 业务判断2关联的选择子流程
   */
  public static final String SWITCH_SUB_2 = "s2";

  /**
   * 业务判断2关联的选择子流程
   */
  public static final String SWITCH_SUB_3 = "s3";

  /**
   * 选择剩余量最多的渠道
   */
  public static final String SELECT_BEST_CHANNEL = "branch1";

  /**
   * 根据业务信息选择短信渠道子流程
   */
  public static final String SELECT_BIZ_CHANNEL = "branch2";

  /**
   * 获取渠道1剩余量组件Id
   */
  public static final String CHANNEL1_QUERY = "channel1Query";

  /**
   * 获取渠道2剩余量组件Id
   */
  public static final String CHANNEL2_QUERY = "channel2Query";

  /**
   * 获取渠道3剩余量组件Id
   */
  public static final String CHANNEL3_QUERY = "channel3Query";

  /**
   * 获取渠道4剩余量组件Id
   */
  public static final String CHANNEL4_QUERY = "channel4Query";

  /**
   * 获取渠道4剩余量组件Id
   */
  public static final String CHANNEL5_QUERY = "channel5Query";

  /**
   * 获取渠道6剩余量组件Id
   */
  public static final String CHANNEL6_QUERY = "channel6Query";

  /**
   * 渠道余量最大选择器组件Id
   */
  public static final String CHANNEL_SELECTOR =  "channelSelector";

  /**
   * 批量发送器组件Id
   */
  public static final String BATCH_SENDER = "batchSender";
}
