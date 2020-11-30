package org.sci.repo;


import org.sci.model.Atlas;
import org.sci.util.ConnectionUtil;

import java.sql.Connection;

public class AtlasRepo {

    private Connection connection;

    public AtlasRepo(){
        connection = ConnectionUtil.getInstance().getConn();
    }


    public Atlas createAtlas(Atlas atlas) {
        connection.createStatement("INSERT");
        return null;
    }

    public Atlas readAtlas(Atlas atlas) {
        return null;
    }

    public Atlas update(Atlas atlas) {
        return null;
    }

    public boolean deleteAtlas(Atlas atlas) {
        return false;
    }
}
