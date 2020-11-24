package org.sci.repo;

import org.sci.model.Atlas;
import org.sci.util.ConnectionUtil;

import java.sql.Connection;

public class AtlasRepo {

    private Connection connection;

    public AtlasRepo(){

        connection = ConnectionUtil.getInstance();

    }

    public Atlas createatlas(Atlas atlas) {
        //INSERT sql
        return null;
    }

    public Atlas readAtlas(Atlas atlas) {
        //SELECT sql
        return null;
    }

    public Atlas update(Atlas atlas) {
        //UPDATE sql
        return null;
    }

    public boolean deleteAtlas(Atlas atlas) {
        //DELETE sql
        return false;
    }
}
