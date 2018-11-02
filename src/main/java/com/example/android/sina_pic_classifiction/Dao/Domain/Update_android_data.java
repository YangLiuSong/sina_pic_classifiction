package com.example.android.sina_pic_classifiction.Dao.Domain;

public class Update_android_data {
    private String pic_id;
    private String tag_ids;
    private String tag_names;

    public String getPic_id() {
        return pic_id;
    }

    public void setPic_id(String pic_id) {
        this.pic_id = pic_id;
    }

    public String getTag_ids() {
        return tag_ids;
    }

    public void setTag_ids(String tag_ids) {
        this.tag_ids = tag_ids;
    }

    public String getTag_names() {
        return tag_names;
    }

    public void setTag_names(String tag_names) {
        this.tag_names = tag_names;
    }
}
