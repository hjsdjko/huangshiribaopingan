package com.dao;

import com.entity.ChuruguidingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuruguidingView;

/**
 * 出入规定 Dao 接口
 *
 * @author 
 */
public interface ChuruguidingDao extends BaseMapper<ChuruguidingEntity> {

   List<ChuruguidingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
