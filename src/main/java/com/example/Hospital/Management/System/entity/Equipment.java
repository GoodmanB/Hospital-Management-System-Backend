package com.example.Hospital.Management.System.entity;

public class Equipment {
    private String equipment;
    private String name;
    private String desc;
    private int quantity;
    private Room details;


    private Equipment(){

    }

    public String getEquipment() {
        return equipment;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
    public int getQuantity() {
        return quantity;
    }
    public Room getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipment='" + equipment + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", quantity=" + quantity +
                ", room=" + details +
                '}';
    }

    public static class Builder{
        private String equipment;
        private String name;
        private String desc;
        private int quantity;
        private Room details;

        public Builder(String equipment){
            this.equipment = equipment;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setDetails(Room details){
            this.details = details;
            return this;
        }
        public Builder copy(Equipment equipment1){
            this.equipment = equipment;
            this.name = name;
            this.desc = desc;
            this.quantity = quantity;
            this.details =details;
            return this;
        }

        public Equipment build(){
            Equipment equipmentOne = new Equipment();

            equipmentOne.equipment = equipment;
            equipmentOne.name = name;
            equipmentOne.desc = desc;
            equipmentOne.quantity = quantity;
            equipmentOne.details = details;
            return equipmentOne;
        }
    }
}
