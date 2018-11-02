package com.example.android.sina_pic_classifiction.Dao.Domain;

public class Count {
    private String month;
    private int all_count;
    private int has_tag;
    private int no_tag;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getAll_count() {
        return all_count;
    }

    public void setAll_count(int all_count) {
        this.all_count = all_count;
    }

    public int getHas_tag() {
        return has_tag;
    }

    public void setHas_tag(int has_tag) {
        this.has_tag = has_tag;
    }

    public int getNo_tag() {
        return no_tag;
    }

    public void setNo_tag(int no_tag) {
        this.no_tag = no_tag;
    }
}
