package org.sci.repo;


import org.jetbrains.annotations.NotNull;
import org.sci.model.Atlas;
import org.sci.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AtlasRepo {

    @NotNull
    private Connection connection;

    public AtlasRepo(){
        connection = ConnectionUtil.getInstance().getConn();
    }


    public Atlas createAtlas(Atlas atlas) {

//        String sql = ("INSERT INTO BOOKINTELIJ.BOOKS values("
//                +atlas.getRating()+
//                ", "
//                +atlas.getPublishhouse()+
//                ",'"
//                +atlas.getEditura()+
//                "','"
//                +atlas.getTitle()+
//                "', '"
//                +atlas.getIsbn()+
//                "')");

                String sql = ("INSERT INTO BOOKINTELIJ.BOOKS values(?, ?,?,?,?)");
        try (PreparedStatement stnnt = connection.prepareStatement(sql)){
            stnnt.setInt(1,atlas.getRating());
            stnnt.setInt(2,atlas.getNrPages());
            stnnt.setString(3, atlas.getPublishhouse());
            stnnt.setString(4, atlas.getTitle());
            stnnt.setString(5,atlas.getIsbn());

            stnnt.execute();

                 return null;

        } catch (SQLException throwables) {
            System.out.println("sql exception: createAtlas");
            // throw new Error("Fatal exception appeared");
        }

        return null;
    }

    public Atlas readAtlas(Atlas atlas) {
        return null;
    }

    public Atlas update(Atlas atlas) {
        String sql = ("UPDATE BOOKINTELIJ.BOOKS set NRPAGES = 560 where ISBN = '57-jhb-jbhb'");

        try (Statement stnnt = connection.createStatement()){
            stnnt.execute(sql);
        } catch (SQLException throwables) {
            System.out.println("sql exception: updateAtlas");
            // throw new Error("Fatal exception appeared");
        }

        return null;
    }

    public boolean deleteAtlas(Atlas atlas) {
        String sql = ("DELETE FROM BOOKINTELIJ.BOOKS where ISBN ='57-jhb-jbhb-09'");

        try (Statement stnnt = connection.createStatement()){
            stnnt.execute(sql);
        } catch (SQLException throwables) {
            System.out.println("sql exception: deleteAtlas");
            // throw new Error("Fatal exception appeared");
        }

        return false;
    }
}
