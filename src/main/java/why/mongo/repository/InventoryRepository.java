package why.mongo.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import why.mongo.domain.Inventory;

public interface InventoryRepository extends MongoRepository<Inventory, String> {

    List<Inventory> findInventoriesByItem(String item);

    Inventory findInventoriesById(String id);
    
    long count();

}