package ltd.newbee.mall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import ltd.newbee.mall.controller.vo.ShopCatVO;
import ltd.newbee.mall.entity.ShopCat;

import java.util.List;

public interface ShopCatService extends IService<ShopCat> {

    /**
     * 添加商品至购物车
     * @param shopCat 购物车对象
     */
    void saveShopCat(ShopCat shopCat);

    /**
     * 获取用户购物车商品详情
     * @param userId 用户ID
     * @return 商品集合
     */
    List<ShopCatVO> getShopCatVOList(Long userId);
}
