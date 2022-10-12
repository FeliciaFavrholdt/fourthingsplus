package dat.backend.model.persistence;

import dat.backend.model.entities.Item;
import dat.backend.model.entities.User;
import dat.backend.model.exceptions.DatabaseException;

import java.util.List;

public class ItemFacade
{
    public static List<Item> getItems(ConnectionPool connectionPool) {
        return ItemMapper.getAll(connectionPool);
    }

    public static void toggleDone(int item_id, ConnectionPool connectionPool) {
        ItemMapper.toggleDone(item_id, connectionPool);
    }
}
