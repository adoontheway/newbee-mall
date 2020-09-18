package ltd.newbee.mall.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import ltd.newbee.mall.controller.vo.SearchObjVO;
import ltd.newbee.mall.controller.vo.SearchPageGoodsVO;
import ltd.newbee.mall.entity.Goods;

public interface GoodsService extends IService<Goods> {

    /**
     * 分页查询
     * @param page 分页对象
     * @param goods 商品对象
     * @return 分页数据
     */
    IPage<Goods> selectPage(Page<Goods> page, Goods goods);

    /**
     * 根据搜索条件查询商品
     * @param page 分页对象
     * @param searchObjVO 搜索对象
     * @return 分页数据
     */
    IPage<Goods> findMallGoodsListBySearch(Page<SearchPageGoodsVO> page, SearchObjVO searchObjVO);

}
