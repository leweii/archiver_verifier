package verifier.entity;

import org.springframework.data.domain.Persistable;
import verifier.constant.RCConstant;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by lewei at 2019-03-14 11:20 AM.
 */
@MappedSuperclass
public abstract class AbstractPersist<P extends Serializable> implements Persistable<P> {

    @Id
    @Column(length = RCConstant.Persistence.LENGTH_64, name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tms_hibernate_seq")
    @SequenceGenerator(name = "tms_hibernate_seq", sequenceName = "tms_hibernate_seq", allocationSize = 1)
    private P id;

    @Override
    @Transient
    public boolean isNew() {
        return null == this.getId();
    }

    @Override
    public String toString() {
        return String.format("Entity of type %s with id: %s", this.getClass().getName(), this.getId());
    }

    @Override
    public boolean equals(final Object obj) {
        if (null == obj) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!this.getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractPersist<?> that = (AbstractPersist<?>) obj;
        return null != this.getId() && this.getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        int hashCode = 17;
        hashCode += null == this.getId() ? 0 : this.getId().hashCode() * 31;
        return hashCode;
    }

    @Override
    public P getId() {
        return id;
    }

    public void setId(final P id) {
        this.id = id;
    }

}
