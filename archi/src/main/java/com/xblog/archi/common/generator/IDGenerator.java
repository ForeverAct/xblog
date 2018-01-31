package com.xblog.archi.common.generator;

import sun.misc.BASE64Encoder;

import java.util.Base64;
import java.util.Random;
import java.util.UUID;

/**
 * @author WangYue
 * @datetime 2017-12-14 11:53
 */
public class IDGenerator {
    public static String uuid8() {
        String[] chars = new String[] { "a", "b", "c", "d", "e", "f",
                "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z" };
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }

    @Deprecated
    public static String baseUuid8() {
        String ss = Base64.getEncoder().encodeToString((UUID.randomUUID().toString()).getBytes());
        ss = ss.replace("[B@", "");
        return ss;
    }

    public static String uuid12() {
        String s = UUID.randomUUID().toString();
        s =  s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
        /* System.out.println(s.substring(0, 12)); */
        return s;
    }

    public static String getOrderID16ByUUID() {
        /* 最大支持1-9个集群机器部署 */
        int machineId = 1;
        int hashCodeV = UUID.randomUUID().toString().hashCode();
        /* 有可能是负数 */
        if(hashCodeV < 0) {
            hashCodeV = - hashCodeV;
        }
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        return machineId + String.format("%015d", hashCodeV);
    }

    public static String randomNumberUniq8() {
        String no="";
        //初始化备选数组
        int[] defaultNums = new int[10];
        for (int i = 0; i < defaultNums.length; i++) {
            defaultNums[i] = i;
        }

        Random random = new Random();
        int[] nums = new int[8];
        //默认数组中可以选择的部分长度
        int canBeUsed = 10;
        //填充目标数组
        for (int i = 0; i < nums.length; i++) {
            //将随机选取的数字存入目标数组
            int index = random.nextInt(canBeUsed);
            nums[i] = defaultNums[index];
            //将已用过的数字扔到备选数组最后，并减小可选区域
            //swap(index, canBeUsed - 1, defaultNums);
            int temp = defaultNums[index];
            defaultNums[index] = defaultNums[canBeUsed - 1];
            defaultNums[canBeUsed - 1] = temp;

            canBeUsed--;
        }
        if (nums.length>0) {
            for (int i = 0; i < nums.length; i++) {
                no+=nums[i];
            }
        }

        return no;
    }

    public static String randomNumberUniq82() {
        String no="";
        int num[]=new int[8];
        int c=0;
        for (int i = 0; i < 8; i++) {
            num[i] = new Random().nextInt(10);
            c = num[i];
            for (int j = 0; j < i; j++) {
                if (num[j] == c) {
                    i--;
                    break;
                }
            }
        }
        if (num.length>0) {
            for (int i = 0; i < num.length; i++) {
                no+=num[i];
            }
        }
        return no;
    }

    public static void main(String[] args) {
        System.out.println(uuid8());
        System.out.println(uuid12());
        System.out.println(getOrderID16ByUUID());
        System.out.println(randomNumberUniq8());
        System.out.println(randomNumberUniq82());
    }
}
