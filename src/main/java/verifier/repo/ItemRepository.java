package verifier.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import verifier.entity.Item;
import verifier.entity.RCConfig;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    Integer countItemsByOwnerIdAndExtensionId(Long ownerId, Long extensionId);
}
