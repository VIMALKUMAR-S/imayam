package com.Foodcourt.fc.Repository;

import com.Foodcourt.fc.Entity.BestSellingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestSellingItemRepo extends JpaRepository<BestSellingItem,Integer> {

    public BestSellingItem findByItemId(int id);
}
