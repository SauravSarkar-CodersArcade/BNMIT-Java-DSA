package com.bnmit.dsa.basics.association;

public class Information {
    public Information(String blockNo, int floorNo, int roomNo, int bedNo) {
        this.blockNo = blockNo;
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.bedNo = bedNo;
    }

    String blockNo;
    int floorNo, roomNo, bedNo;
}
