### USDT-ETH自动报价操作说明

[toc]

#### 启动配置

1. 准备好：钱包私钥、以太坊节点URL、etherscan-api-key、USDT代币合约地址、获取价格API。
   * 钱包私钥：通过助记词生成，可通过nestDapp注册。报价至少需要准备10.2ETH和价值10ETH的ERC20代币。
   * 以太坊节点URL：可通过https://infura.io 免费申请。
   * etherscan-api-key：可通过https://cn.etherscan.com免费申请。
   * ERC20代币合约地址：例如报价HT，那么就需要填写HT代币合约地址。
   * USDT-ETH火币价格API：  https://api.huobi.pro/market/history/trade?symbol=ethusdt&size=1
2. 在 application.properties 里面根据注释将数据填写在对应的地方。
3. resources/templates/miningData.html 页面里面127.0.0.1的ip改为自己服务器ip地址。

#### 设置（GasPrice、GasLimit）

1. GasPrice：
   * 报价：默认为1.4倍默认gasPrice，参数名：OFFER_GAS_PRICE_MULTIPLE。
   * 加速报价：默认为报价基础上增加1.2倍，参数名：TURNOUT_GAS_PRICE_MULTIPLE。
   * 取回：默认为1.2倍默认gasPrice，参数名：TURNOUT_GAS_PRICE_MULTIPLE。
   * 取消报价交易：报价gasPrice的2倍。
2. GasLimit：
   * 所有gasLimit没有进行预估，均给予的默认值。

#### 测试报价

```
1. 将发起报价交易代码注释（正常报价和加速报价）：
transactionHash = web3j.ethSendRawTransaction(hexValue).sendAsync().get().getTransactionHash();
2. 打开 http://127.0.0.1:8080/offer/miningData ,进行区块间隔设置以及修改启动状态。
3. 查看打印的log里面的报价ETH数量和报价USDT数量，核对数据。
```

#### 合约交互

[合约交互说明](./Mining/README.md)

