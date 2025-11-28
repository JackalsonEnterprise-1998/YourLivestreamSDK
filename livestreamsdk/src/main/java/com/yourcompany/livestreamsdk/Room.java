package com.yourcompany.livestreamsdk;

public class Room {
    private String roomId;
    private String hostId;

    public Room(String roomId, String hostId) {
        this.roomId = roomId;
        this.hostId = hostId;
    }

    public String getRoomId() { return roomId; }
    public String getHostId() { return hostId; }
}
