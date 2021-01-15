package tn.iit.storemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.iit.storemanagement.entity.Item;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {
}
