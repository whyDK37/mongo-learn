package why.mongo.repository;

import com.alibaba.fastjson2.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import why.mongo.domain.GroceryItem;

@SpringBootTest
class ItemRepositoryTest {

  @Autowired
  private ItemRepository itemRepository;


  @Test
  void findItemByName() {
    GroceryItem abc = itemRepository.findItemByName("abc");

    System.out.println(JSON.toJSONString(abc));
  }

  @Test
  void findAll() {
  }

  @Test
  void count() {
  }
}