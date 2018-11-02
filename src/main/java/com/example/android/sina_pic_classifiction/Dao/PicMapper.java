package com.example.android.sina_pic_classifiction.Dao;

import com.example.android.sina_pic_classifiction.Dao.Domain.Count;
import com.example.android.sina_pic_classifiction.Dao.Domain.Pic;
import com.example.android.sina_pic_classifiction.Dao.Domain.Update_android_Count;
import com.example.android.sina_pic_classifiction.Dao.Domain.Update_android_data;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PicMapper {
    @Select("select * from pic where month = #{month} order by RAND() LIMIT 10")
    public List<Pic> getPic_by_month(String month);

    @Select("select * from data_count where month = #{month}")
    public Count getCount(String month);

    @Update("update pic set tag_ids = #{tag_ids},tag_names=#{tag_names} where pic_id = #{pic_id}")
    public void updateData(Update_android_data update_androidData);

    @Update("update data_count set has_tag = #{has_tag},no_tag=#{no_tag} where month = #{month}")
    public void updateCount(Update_android_Count update_android_count);

    @Select("select * from pic where month = #{month} order by RAND() LIMIT 1")
    public Pic getPic_one(String month);
}
