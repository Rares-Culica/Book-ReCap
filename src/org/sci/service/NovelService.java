package org.sci.service;

import org.sci.model.Novel;
import org.sci.repo.AtlasRepo;
import org.sci.repo.NovelRepo;

public class NovelService {

    private NovelRepo novelRepo;

        public NovelService(NovelRepo novelRepo){
            this.novelRepo = novelRepo;

        }
}
