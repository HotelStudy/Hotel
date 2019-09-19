package service;

import java.util.List;
import entity.Room;

public interface RoomService {
    /**
     * 删除房屋信息（房管）
     * @param r_id
     * @return
     */
    public boolean roomDelete(int r_id);



    /**
     * 添加房屋（房管）
     * @param room
     * @return
     */
    public boolean roomAdd(Room room);

    /**
     * 查询所有房屋信息（房管）
     * @return
     */
    public List<Room> selectAllRoom();

    /**
     * 查询所有空房信息（房管）
     * @return
     */
    public List<Room> selectAllEmptyRoom();

    /**
     * 查询所有预定房信息（房管）
     * @return
     */
    public List<Room> selectAllReservedRoom();

    /**
     * 查询所有入住房信息（房管）
     * @return
     */
    public List<Room> selectAllRoomInfo();
}
