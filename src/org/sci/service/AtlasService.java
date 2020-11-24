package org.sci.service;

import org.sci.model.Atlas;
import org.sci.repo.AtlasRepo;

public class AtlasService {
    private AtlasRepo atlasRepo;

        public AtlasService(AtlasRepo atlasRepo){
            this.atlasRepo = atlasRepo;

        }

    //CRUD

    public Atlas createAtlas(Atlas atlas){
            return atlasRepo.createatlas(atlas/*DTO*/);
    }

    public Atlas readAtlas(Atlas atlas){
            return atlasRepo.readAtlas(atlas);
    }

    public Atlas updateAtlas(Atlas atlas){
            return atlasRepo.update(atlas);
    }

    public boolean deleteAtlas(Atlas atlas){
            return atlasRepo.deleteAtlas(atlas);
    }

}
