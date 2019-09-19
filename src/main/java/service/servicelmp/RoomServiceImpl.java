package service.servicelmp;

import entity.Room;
import service.RoomService;

import java.util.List;

public class RoomServiceImpl implements RoomService {
    @Override
    public boolean roomDelete(int r_id) {
        return false;
    }

    @Override
    public boolean roomAdd(Room room) {
        return false;
    }

    @Override
    public List<Room> selectAllRoom() {
        return null;
    }

    @Override
    public List<Room> selectAllEmptyRoom() {
        return null;
    }

    @Override
    public List<Room> selectAllReservedRoom() {
        return null;
    }

    @Override
    public List<Room> selectAllRoomInfo() {
        return null;
    }
}
