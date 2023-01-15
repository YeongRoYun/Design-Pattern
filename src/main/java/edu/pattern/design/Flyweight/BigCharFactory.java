package edu.pattern.design.Flyweight;

import lombok.Getter;

import java.util.HashMap;

/**
 * BigCharFactory : Flyweight Factory 로, 공유 가능한 Instance 는 새로 생성하지 않는다.
 *
 * @author teddy
 * @version 1.0.0
 * @since 2023/01/15
 **/
public class BigCharFactory {
    @Getter
    private static BigCharFactory instance = new BigCharFactory();
    private HashMap<Character, BigChar> pool = new HashMap<>();

    private BigCharFactory() {
    }

    public BigChar getBigChar(char charname) {
        if(pool.containsKey(charname)) {
            return pool.get(charname);
        } else {
            pool.put(charname, new BigChar(charname));
            return pool.get(charname);
        }
    }

}