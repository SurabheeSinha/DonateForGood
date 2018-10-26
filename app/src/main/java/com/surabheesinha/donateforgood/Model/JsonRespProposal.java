package com.surabheesinha.donateforgood.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by surabheesinha on 10/26/18.
 */

public class JsonRespProposal {
    @SerializedName("proposals")
    @Expose
    public ProjectsModel[] proposals;
    public ProjectsModel[] getProposals() {
        return proposals;
    }

    /*public List<ProjectsModel> proposals ;

    public List<ProjectsModel> getProposals() {
       return proposals;
    }

    public void setProposals(List<ProjectsModel> proposals) {
        this.proposals = proposals;
    }*/
}
