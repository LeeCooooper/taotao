package com.taotao.mapper;


import com.taotao.pojo.TbItem;

public interface TbContentCategoryMapper {
    TbItem findTbItemById(long tbItemId);
}