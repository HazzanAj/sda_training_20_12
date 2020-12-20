package model;

import javax.persistence.*;




    @Entity
    @Table(name = "GroceryShop")
    public class GroceryShop {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "shopId", insertable = false, nullable = false)
        private Integer shopId;
        private String shopName;
        private String address;
        private String location;

        public Integer getShopId() {
            return shopId;
        }

        public void setShopId(Integer shopId) {
            this.shopId = shopId;
        }

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }
    }





