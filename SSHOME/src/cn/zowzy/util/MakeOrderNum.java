package cn.zowzy.util;

import java.io.Serializable;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.factory.IdentifierGeneratorFactory;

public class MakeOrderNum implements IdentifierGenerator {




	@Override
	public Serializable generate(SharedSessionContractImplementor arg0, Object arg1) throws HibernateException {
		String str = new SimpleDateFormat("yyMMddHHmm").format(new Date());  
	    long orderNo = Long.parseLong((str)) * 1000000;  
	    return String.valueOf(orderNo);
	}

}
