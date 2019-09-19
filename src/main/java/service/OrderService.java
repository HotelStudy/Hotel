package service;


import java.util.List;
import entity.Room;
import entity.Order;
import entity.Check;
import entity.Client;

public interface OrderService {
    /**
     * 查询所有空房间（前台）
     * @return
     */
    public List<Room> selectAllEmptyRoom();

    /**
     * 查询所有空房间带类型（前台）
     * @return
     */
    public List<Room> selectAllEmptyRoomT(String type);

    /**
     * 查询所有房间（前台）
     * @return
     */
    public List<Room> selectAllRoom();

    /**
     * 显示所有预定的房间（前台）
     * @return
     */
    public List<Room> orderShow();

    /**
     * 显示订房信息（前台）
     * @return
     */
    public List<Order> ordShow();

    /**
     * 显示指定用户的订房信息（前台）
     * @return
     */
    public List<Order> selectOrderByName(String userName);

    /**
     * 	显示指定用户ID的订房信息（前台）
     * @return
     */
    public List<Room> selectOrderById(int c_id);

    /**
     * 修改客房信息，即空房-->已预订（前台）
     * @param room
     * @return
     */
    public boolean updateRoomStateByOrder(Room room);

    /**
     * 向预定表里加入预定信息（前台）
     * @param order
     * @return
     */
    public boolean orderAdd(Order order);

    /**
     *	转接待时向用户表里面插入信息（前台）
     * @param client
     * @return
     */
    public boolean userAdd(Client client);

    /**
     *	转接待时入住表里加入信息（前台）
     * @param room
     * @return
     */
    public boolean reserveAdd(Room room);

    /**
     * 取消订房
     * @param room（前台）
     * @return
     */
    public boolean changeOrderA (Room room);

    /**
     * 转接待
     * @param room（前台）
     * @return
     */
    public boolean changeOrderC (Room room);

    /**
     * 删除订单表里的信息（前台）
     * @param room
     * @return
     */
    public boolean deleteOrder (Room room);

    /**
     * 	查出指定userName的人的userId
     * @param userName
     * @return
     */
    public int selectUserIdByUserName(String userName);

    /**
     * 	显示所有的房间入住信息
     * @return
     */
    public List<Check> empGoShowReserve();

    /**
     * 	显示所有用户信息（入住）
     * @return
     */
    public List<Client> empGoShowUser();
}

