package com.dao;

import com.entity.KechengLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengLiuyanView;

/**
 * 课程资讯 Dao 接口
 *
 * @author 
 * @since 2021-04-13
 */
public interface KechengLiuyanDao extends BaseMapper<KechengLiuyanEntity> {

   List<KechengLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
