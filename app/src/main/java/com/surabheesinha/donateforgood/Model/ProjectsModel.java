package com.surabheesinha.donateforgood.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by surabheesinha on 10/26/18.
 */

public class ProjectsModel {
    @SerializedName("title")
    @Expose
    String title;
    String teachersName;
    String TotalPrice;
    int numDonors;

    public ProjectsModel(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        TotalPrice = totalPrice;
    }

    public int getNumDonors() {
        return numDonors;
    }

    public void setNumDonors(int numDonors) {
        this.numDonors = numDonors;
    }
}
