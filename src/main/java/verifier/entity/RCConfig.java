package verifier.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

@Entity
@Table(name = "rc_config", indexes = {@Index(columnList = "key", name = "idx_config_key", unique = true)})
public class RCConfig extends AbstractPersist<Long> {

    @Column
    private String key;

    @Column
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
