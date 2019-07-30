package verifier.entity;

import verifier.constant.DirectionType;
import verifier.constant.ItemStatus;
import verifier.constant.ItemType;
import verifier.constant.StorageConstant;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Entity
@Table(name = "rc_item", indexes = {@Index(columnList = "ownerId,createTime,type,direction,storage,status,fromNumber,toNumber", name = "idx_full_col")})
public class Item extends AbstractPersist<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "jobId")
    private long jobId;

    @Column(name = "ownerId", nullable = false)
    private long ownerId;

    @Column(name = "url")
    private String url;

    @Column(name = "fromNumber")
    private String fromNumber;

    @Column(name = "toNumber")
    private String toNumber;

    @Column(name = "fromExtensionNum")
    private int fromExtensionNum;

    @Column(name = "toExtensionNum")
    private int toExtensionNum;

    @Column(name = "extensionId")
    private long extensionId;

    @Enumerated
    @Column(name = "direction", columnDefinition = "smallint default 0", nullable = false)
    private DirectionType direction;

    @Column(name = "generateTime", columnDefinition = "TIMESTAMP")
    private Instant generateTime;

    @Enumerated
    @Column(name = "storage", columnDefinition = "smallint default 0", nullable = false)
    private StorageConstant storage;

    @Enumerated
    @Column(name = "status", columnDefinition = "smallint", nullable = false)
    private ItemStatus status;

    @Enumerated
    @Column(name = "type", columnDefinition = "smallint default 0", nullable = false)
    private ItemType type;

    @Column(name = "autoRetryCount", nullable = false, columnDefinition = "int default 0")
    private int autoRetryCount;

    @Column(name = "manualRetryCount", nullable = false, columnDefinition = "int default 0")
    private int manualRetryCount;

    @Column(name = "archiveTime", columnDefinition = "TIMESTAMP")
    private Instant archiveTime;

    @Column(name = "updateTime", columnDefinition = "TIMESTAMP")
    private Instant updateTime;

    @Column(name = "createTime", columnDefinition = "TIMESTAMP")
    private Instant createTime;

    @Column(name = "exceptionCategoryId", columnDefinition = "bigint default 0", nullable = false)
    private long exceptionCategoryId;

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFromNumber() {
        return fromNumber;
    }

    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    public String getToNumber() {
        return toNumber;
    }

    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    public int getFromExtensionNum() {
        return fromExtensionNum;
    }

    public void setFromExtensionNum(int fromExtensionNum) {
        this.fromExtensionNum = fromExtensionNum;
    }

    public int getToExtensionNum() {
        return toExtensionNum;
    }

    public void setToExtensionNum(int toExtensionNum) {
        this.toExtensionNum = toExtensionNum;
    }

    public DirectionType getDirection() {
        return direction;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

    public Instant getGenerateTime() {
        return generateTime;
    }

    public void setGenerateTime(Instant generateTime) {
        this.generateTime = generateTime;
    }

    public StorageConstant getStorage() {
        return storage;
    }

    public void setStorage(StorageConstant storage) {
        this.storage = storage;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public int getAutoRetryCount() {
        return autoRetryCount;
    }

    public void setAutoRetryCount(int autoRetryCount) {
        this.autoRetryCount = autoRetryCount;
    }

    public int getManualRetryCount() {
        return manualRetryCount;
    }

    public void setManualRetryCount(int manualRetryCount) {
        this.manualRetryCount = manualRetryCount;
    }

    public Instant getArchiveTime() {
        return archiveTime;
    }

    public void setArchiveTime(Instant archiveTime) {
        this.archiveTime = archiveTime;
    }

    public Instant getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Instant updateTime) {
        this.updateTime = updateTime;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Instant createTime) {
        this.createTime = createTime;
    }

    public long getExceptionCategoryId() {
        return exceptionCategoryId;
    }

    public void setExceptionCategoryId(long exceptionCategoryId) {
        this.exceptionCategoryId = exceptionCategoryId;
    }

    public long getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(long extensionId) {
        this.extensionId = extensionId;
    }

    @Override
    public String toString() {
        return "Item{"
                + "jobId="
                + jobId
                + ", ownerId="
                + ownerId
                + ", url='"
                + url + '\''
                + ", fromNumber="
                + fromNumber
                + ", toNumber="
                + toNumber
                + ", direction="
                + direction
                + ", generateTime="
                + generateTime
                + ", storage="
                + storage
                + ", status="
                + status
                + ", type="
                + type
                + ", autoRetryCount="
                + autoRetryCount
                + ", manualRetryCount="
                + manualRetryCount
                + ", archiveTime="
                + archiveTime
                + ", updateTime="
                + updateTime
                + ", createTime="
                + createTime
                + '}';
    }
}
