package hcd.ca.gov.assets;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Assets.class)
public abstract class Assets_ {

	public static volatile SingularAttribute<Assets, String> ntfcType;
	public static volatile SingularAttribute<Assets, String> businessUnit;
	public static volatile SingularAttribute<Assets, Double> cost;
	public static volatile SingularAttribute<Assets, BigInteger> quantity;
	public static volatile SingularAttribute<Assets, Date> acquisitionDt;
	public static volatile SingularAttribute<Assets, Integer> sid;
	public static volatile SingularAttribute<Assets, BigInteger> tagNumber;
	public static volatile SingularAttribute<Assets, String> descr;
	public static volatile SingularAttribute<Assets, Date> accountingDt;
	public static volatile SingularAttribute<Assets, String> descrshort;
	public static volatile SingularAttribute<Assets, String> fundCode;
	public static volatile SingularAttribute<Assets, Date> locationEffdt;
	public static volatile SingularAttribute<Assets, String> serialId;
	public static volatile SingularAttribute<Assets, String> profileId;
	public static volatile SingularAttribute<Assets, String> purchaseOrder;
	public static volatile SingularAttribute<Assets, String> locations;
	public static volatile SingularAttribute<Assets, String> vin;
	public static volatile SingularAttribute<Assets, Integer> id;
	public static volatile SingularAttribute<Assets, Date> inServiceDt;
	public static volatile SingularAttribute<Assets, String> asset;
	public static volatile SingularAttribute<Assets, String> category;
	public static volatile SingularAttribute<Assets, Date> transDt;

}

