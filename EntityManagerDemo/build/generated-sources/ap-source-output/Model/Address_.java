package Model;

import Model.Customer;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2022-10-30T21:44:57", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> zipcode;
    public static volatile SingularAttribute<Address, String> country;
    public static volatile SingularAttribute<Address, Customer> customerFk;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, Long> id;

}