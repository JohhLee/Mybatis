package com.lee.dao;

import org.junit.Test;

import java.util.function.Function;

public class Tesr1 {
    @Test
    public  void sum(){
        int sum = 0;
        for(int i = 1;i <= 10;i++){
            sum += fun(i);

        }
        System.out.println(sum);

    }
    public int fun(int i){
        if((i == 1) || (i == 0)){
            return 1;
        }
        else
        {
            return  i * fun(i - 1);
        }

    }



}
