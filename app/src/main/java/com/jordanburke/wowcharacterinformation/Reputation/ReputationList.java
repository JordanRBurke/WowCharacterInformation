package com.jordanburke.wowcharacterinformation.Reputation;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ReputationList {

    @SerializedName("reputation")
    List<Reputation> reputationLists;

    class Reputation {

        @SerializedName("name")
        private String reputationName;

        @SerializedName("value")
        private int reputationValue;

        @SerializedName("max")
        private int reputationMax;

        public String getReputationName() {
            return reputationName;
        }

        public int getReputationValue() {
            return reputationValue;
        }

        public int getReputationMax() {
            return reputationMax;
        }
    }

}
