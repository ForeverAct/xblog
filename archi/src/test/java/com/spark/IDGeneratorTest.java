package com.spark;

import com.xblog.archi.common.generator.IDGenerator;
import org.junit.Test;

/**
 * @author WangYue
 * @datetime 2017-12-14 12:18
 */
public class IDGeneratorTest {
    @Test
    public void generatorTest() {
        System.out.println(IDGenerator.baseUuid8());
        System.out.println(IDGenerator.getOrderID16ByUUID());
        System.out.println(IDGenerator.randomNumberUniq8());
        System.out.println(IDGenerator.randomNumberUniq82());
        System.out.println(IDGenerator.uuid8());
        System.out.println(IDGenerator.uuid12());
    }
}
