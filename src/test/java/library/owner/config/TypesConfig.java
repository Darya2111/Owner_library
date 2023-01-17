package library.owner.config;

import org.aeonbits.owner.Config;


public interface TypesConfig extends Config {

    @org.aeonbits.owner.Config.Key("integer")
    Integer getInteger();

    @org.aeonbits.owner.Config.Key("double")
    Double getDouble();

    @org.aeonbits.owner.Config.Key("boolean")
    Boolean getBoolean();

    @org.aeonbits.owner.Config.Key("enum")
    Browser getEnum();

}
