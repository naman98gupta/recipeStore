package org.naman.recipestore.main.core.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserBE.class)
public abstract class UserBE_ {

	public static volatile SingularAttribute<UserBE, Long> loginId;
	public static volatile SingularAttribute<UserBE, Date> loginTime;
	public static volatile SingularAttribute<UserBE, Long> modificationId;
	public static volatile SingularAttribute<UserBE, Date> modificationTime;
	public static volatile SingularAttribute<UserBE, String> name;
	public static volatile SingularAttribute<UserBE, Long> id;

}

