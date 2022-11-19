package com.example.demo.cmp;

/**
 * @author 李小平
 * @Description 流程组件Id常量声明
 * @Project 供水SaaS
 * @Date 2022-11-19 10:14
 * @Version V1.0
 */
public interface NodeIdConstant {

  /**
   * 组装数据组件Id
   */
  String PACKAGE_DATA = "packageData";

  /**
   * 业务判断1组件Id（选择短信渠道）
   */
  String IF_1 = "if_1";

  /**
   * 短信渠道1组件Id
   */
  String CHANNEL1 = "channel1";

  /**
   * 短信渠道2组件Id
   */
  String CHANNEL2 = "channel2";

  /**
   * 获取业务动态值组件Id
   */
  String BIZ1 = "biz1";

  /**
   * 业务判断2组件Id（选择短信渠道）
   */
  String IF_2 = "if_2";


  /**
   * 短信渠道3组件Id（并行获取供应商渠道剩余量）
   */
  String CHANNEL3 = "channel3";

  /**
   * 短信渠道4组件Id
   */
  String CHANNEL4 = "channel4";

  /**
   * 业务判断3组件Id
   */
  String IF_3 = "if_3";

  /**
   * 短信渠道5组件Id
   */
  String CHANNEL5 = "channel5";

  /**
   * 短信渠道6组件Id
   */
  String CHANNEL6 = "channel6";

  /**
   * 业务判断2关联的选择子流程
   */
  String SWITCH_SUB_2 = "s2";

  /**
   * 业务判断2关联的选择子流程
   */
  String SWITCH_SUB_3 = "s3";

  /**
   * 选择剩余量最多的渠道
   */
  String SELECT_BEST_CHANNEL = "branch1";

  /**
   * 根据业务信息选择短信渠道子流程
   */
  String SELECT_BIZ_CHANNEL = "branch2";

  /**
   * 获取渠道1剩余量组件Id
   */
  String CHANNEL1_QUERY = "channel1Query";

  /**
   * 获取渠道2剩余量组件Id
   */
  String CHANNEL2_QUERY = "channel2Query";

  /**
   * 获取渠道3剩余量组件Id
   */
  String CHANNEL3_QUERY = "channel3Query";

  /**
   * 获取渠道4剩余量组件Id
   */
  String CHANNEL4_QUERY = "channel4Query";

  /**
   * 获取渠道4剩余量组件Id
   */
  String CHANNEL5_QUERY = "channel5Query";

  /**
   * 获取渠道6剩余量组件Id
   */
  String CHANNEL6_QUERY = "channel6Query";

  /**
   * 渠道余量最大选择器组件Id
   */
  String CHANNEL_SELECTOR =  "channelSelector";
}
