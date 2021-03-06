package com.nest.ib.service;

import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * ClassName:MiningService
 * Description:
 */
public interface MiningService {
    void offer();

    String sendUSDTOffer(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger nonce,BigInteger blockNumber,BigInteger latestBlockNumber);

    void turnOut();

    void updateIntervalBlock(int blockInterval);

    int selectIntervalBlock();

    void startMining();

    boolean selectStartMining();

    void updateUserPrivateKey(String privateKey);

    String selectUserWalletAddress();

    void updateOfferFactoryContractAddress(String offerFactoryContractAddress);

    void updateOfferPriceContractAddress(String offerPriceContractAddress);

    void updateMiningSaveContractAddress(String miningSaveContractAddress);

    void updatePrice();

    void checkWalletBalance();

    String cancelTransaction(BigInteger nonce,BigInteger gasPrice);

}
