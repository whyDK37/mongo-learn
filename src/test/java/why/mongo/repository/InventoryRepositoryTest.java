package why.mongo.repository;

import com.alibaba.fastjson2.JSON;
import java.util.List;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import why.mongo.domain.Inventory;
import why.mongo.domain.Size;

@SpringBootTest
class InventoryRepositoryTest {

  @Autowired
  InventoryRepository inventoryRepository;


  @Autowired
  private MongoTemplate mongoTemplate;

  @Test
  void putOne() {
    Inventory inventory = new Inventory();

    inventory.setItem("test");
    inventory.setQty(2);
    inventory.setTags(Lists.list("a", "b"));
    inventory.setSize(new Size(1, 2, "3"));
    Inventory insert = mongoTemplate.insert(inventory);

    System.out.println(JSON.toJSONString(insert));
  }

  @Test
  void query() {
    Query query = new Query();
    List<Inventory> inventories = mongoTemplate.find(query, Inventory.class);
    System.out.println(JSON.toJSONString(inventories));

  }

  @Test
  void findInventoriesByItemEquals() {

    System.out.println(inventoryRepository.count());

    List<Inventory> journal = inventoryRepository.findAll();
    System.out.println(JSON.toJSONString(journal));

    journal = inventoryRepository.findInventoriesByItem("test");
    System.out.println(JSON.toJSONString(journal));
  }

  @Test
  void findInventoriesById() {
    Inventory journal = inventoryRepository.findInventoriesById("628987309f7e3a3b0d7f6934");
    System.out.println(JSON.toJSONString(journal));
  }
}