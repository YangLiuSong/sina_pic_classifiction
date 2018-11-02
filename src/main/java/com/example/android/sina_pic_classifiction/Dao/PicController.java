package com.example.android.sina_pic_classifiction.Dao;


import com.example.android.sina_pic_classifiction.Dao.Domain.Count;
import com.example.android.sina_pic_classifiction.Dao.Domain.Pic;
import com.example.android.sina_pic_classifiction.Dao.Domain.Update_android_Count;
import com.example.android.sina_pic_classifiction.Dao.Domain.Update_android_data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/android")

public class PicController {

    @Autowired
    private PicService picService;


    @RequestMapping(value = "/getpic",method = RequestMethod.POST)
    public List<Pic> getPic_by_month(@RequestParam(value = "month",required = true)String month){
        return picService.getPic_by_month(month);
    }

    @RequestMapping(value = "/getcount",method = RequestMethod.POST)
    public Count getCount(@RequestParam(value = "month",required = true)String month){
        return picService.getCount(month);
    }

    @RequestMapping(value = "/updateData",method = RequestMethod.POST)
    public void updateData(Update_android_data update_androidData){
        picService.updateData(update_androidData);
    }

    @RequestMapping(value = "/updateCount",method = RequestMethod.POST)
    public void updateCount(Update_android_Count update_android_count){
        picService.updateCount(update_android_count);
    }

    @RequestMapping(value = "getpicone",method = RequestMethod.POST)
    public Pic getPic_one(@RequestParam(value = "month",required = true)String month){
        return picService.getPic_one(month);
    }
}
