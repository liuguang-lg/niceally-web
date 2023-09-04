package com.niceally.webpage.utils;

import java.util.UUID;

/**
 * @ProjectName: hisun-boot-parent
 * @Package: org.hisun.modules.enviroment.util
 * @ClassName: UUidUtils
 * @Author: 15936
 * @Date: 2022/9/6
 * @Version: 1.0
 */
public class UUidUtils {

    public static String getUUid(){
        return UUID.randomUUID().toString().replace("-", "");
    }

}
