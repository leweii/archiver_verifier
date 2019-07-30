package verifier.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import verifier.constant.ItemStatus;
import verifier.constant.ItemType;
import verifier.entity.Item;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Integer countItemsByOwnerIdAndExtensionIdAndStatusAndType
            (Long ownerId, Long extensionId, ItemStatus status, List<ItemType> types);
}
