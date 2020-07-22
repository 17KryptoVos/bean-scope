package com.kryptovos;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Fortune 500 Quote!";
    }
}
