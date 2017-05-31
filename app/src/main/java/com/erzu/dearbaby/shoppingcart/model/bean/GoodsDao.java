package com.erzu.dearbaby.shoppingcart.model.bean;/**
 * Created by holmes k on 2017.05.24.
 */

import java.util.List;

public interface GoodsDao {


    //查询
    List<GoodsForCart> queryAll();

    void insert(List<GoodsForCart> goods);

    boolean delete(int id);

    boolean upData(GoodsForCart goods);
}
