package com.example.android.sina_pic_classifiction.Dao;


import com.example.android.sina_pic_classifiction.Dao.Domain.Count;
import com.example.android.sina_pic_classifiction.Dao.Domain.Pic;
import com.example.android.sina_pic_classifiction.Dao.Domain.Update_android_Count;
import com.example.android.sina_pic_classifiction.Dao.Domain.Update_android_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicService {
    @Autowired
    private PicMapper picmapper;

    public List<Pic> getPic_by_month(String month){
        return picmapper.getPic_by_month(month);
    }

    public Count getCount(String month){return picmapper.getCount(month);}

    public void updateData(Update_android_data update_androidData){picmapper.updateData(update_androidData);}

    public void updateCount(Update_android_Count update_android_count){picmapper.updateCount(update_android_count);}

    public Pic getPic_one(String month){return picmapper.getPic_one(month);}
}
