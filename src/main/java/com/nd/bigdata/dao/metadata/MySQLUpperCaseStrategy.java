package com.nd.bigdata.dao.metadata;

import org.hibernate.cfg.ImprovedNamingStrategy;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-23
 * Time: 下午8:35
 * AuthorEmail: zhangliangxgd@163.com
 */
public class MySQLUpperCaseStrategy extends ImprovedNamingStrategy {
    private static final long serialVersionUID = 1383021413247872469L;

    @Override
    public String tableName(String tableName){
        return tableName.toUpperCase();
    }
}
