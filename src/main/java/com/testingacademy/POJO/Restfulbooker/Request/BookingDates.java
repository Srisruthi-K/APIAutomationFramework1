package com.testingacademy.POJO.Restfulbooker.Request;

import com.google.gson.annotations.SerializedName;

public class BookingDates {

    @SerializedName("checkin")
        private String checkin;

        @SerializedName("checkout")
        private String checkout;

        public void setCheckin(String checkin){
            this.checkin = checkin;
        }

        public String getCheckin(){
            return checkin;
        }

        public void setCheckout(String checkout){
            this.checkout = checkout;
        }

        public String getCheckout(){
            return checkout;
        }

        @Override
        public String toString(){
            return
                    "BookingdatesDTO{" +
                            "checkin = '" + checkin + '\'' +
                            ",checkout = '" + checkout + '\'' +
                            "}";
        }
    }

