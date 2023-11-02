package com.solvd.laba.block1.task3;

public class Main {

        private String name;
        private String address;
        private int experience;

    public Main(String name, String address, int experience){
            this.name = name;
            this.address = address;
            this.experience = experience;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getName () {
            return name;
        }

        public void setAddress (String address){
            this.name = address;
        }

        public String getAddress () {
            return address;
        }
        public int getExperience () {
            return experience;
        }
        public void setExperience ( int experience){
            this.experience = experience;
        }

}