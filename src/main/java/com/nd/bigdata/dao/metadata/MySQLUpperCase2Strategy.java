package com.nd.bigdata.dao.metadata;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;

/**
 * Created by IntelliJ IDEA
 * Author: zhangliang
 * Date: 18-1-23
 * Time: 下午8:41
 * AuthorEmail: zhangliangxgd@163.com
 */
public class MySQLUpperCase2Strategy extends SpringPhysicalNamingStrategy {
    private static final long serialVersionUID = 1383021413247872469L;

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        //将小写表名转换为大写表名
        return Identifier.toIdentifier(name.getText().toUpperCase(),name.isQuoted());
    }
}
