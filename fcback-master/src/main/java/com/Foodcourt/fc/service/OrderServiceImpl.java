package com.Foodcourt.fc.service;

import com.Foodcourt.fc.Entity.BestSellingItem;
import com.Foodcourt.fc.Entity.Items;
import com.Foodcourt.fc.Entity.Menu;
import com.Foodcourt.fc.Repository.BestSellingItemRepo;
import com.Foodcourt.fc.Repository.ItemsRepositary;
import com.Foodcourt.fc.Repository.OrderRepository;
import com.Foodcourt.fc.dto.CountDto;
import com.Foodcourt.fc.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ItemsRepositary itemsRepositary;

    @Autowired
    BestSellingItemRepo bestSellingItemRepo;
    @Override
    public void saveOrder(OrderDTO orderDTO) {

        Menu order = new Menu();
        order.setDate(new Date());
        List<CountDto> items = orderDTO.getItems();
        List<Items> itemsInOrder =new ArrayList<>();
        for(CountDto i:items){
            Items it=itemsRepositary.findById(i.getItemId());
            itemsInOrder.add(it);
            BestSellingItem bestSellingItem=bestSellingItemRepo.findByItemId(it.getId());
            if(bestSellingItem==null){
                bestSellingItem=new BestSellingItem(it.getId(),i.getCount());
            }
            else{
                bestSellingItem.setCount(bestSellingItem.getCount()+i.getCount());
            }
            bestSellingItemRepo.save(bestSellingItem);
        }


        //OrderTable orderTable = new OrderTable(orderDTO.getPhNo(),orderDTO.getOrder());
        //orderRepository.save(orderTable);
    }


}
