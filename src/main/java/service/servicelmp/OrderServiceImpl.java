package service.servicelmp;

import entity.Check;
import entity.Client;
import entity.Order;
import entity.Room;
import service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Override
    public List<Room> selectAllEmptyRoom() {
        return null;
    }

    @Override
    public List<Room> selectAllEmptyRoomT(String type) {
        return null;
    }

    @Override
    public List<Room> selectAllRoom() {
        return null;
    }

    @Override
    public List<Room> orderShow() {
        return null;
    }

    @Override
    public List<Order> ordShow() {
        return null;
    }

    @Override
    public List<Order> selectOrderByName(String userName) {
        return null;
    }

    @Override
    public List<Room> selectOrderById(int c_id) {
        return null;
    }

    @Override
    public boolean updateRoomStateByOrder(Room room) {
        return false;
    }

    @Override
    public boolean orderAdd(Order order) {
        return false;
    }

    @Override
    public boolean userAdd(Client client) {
        return false;
    }

    @Override
    public boolean reserveAdd(Room room) {
        return false;
    }

    @Override
    public boolean changeOrderA(Room room) {
        return false;
    }

    @Override
    public boolean changeOrderC(Room room) {
        return false;
    }

    @Override
    public boolean deleteOrder(Room room) {
        return false;
    }

    @Override
    public int selectUserIdByUserName(String userName) {
        return 0;
    }

    @Override
    public List<Check> empGoShowReserve() {
        return null;
    }

    @Override
    public List<Client> empGoShowUser() {
        return null;
    }
}
