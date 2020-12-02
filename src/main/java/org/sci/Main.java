package org.sci;

import org.sci.model.Atlas;
import org.sci.model.Book;
import org.sci.model.Novel;
import org.sci.modelother.Mystery;
import org.sci.repo.AtlasRepo;

public class Main {


        public static void main(String[] args) {

            Book book1 = new Book();
            book1.setEditura("RAMIRA ");


            Book book2 = new Book();
            book2.setEditura("HUMANITAS ");


            Book book3 = new Book();
            book3.setEditura("HUMANITAS ");

            Book b12 = new Book(121, "Reptile");

            Novel novel = new Novel("Fiction");
//            Atlas atlas = new Atlas("Maps","Universal");
            Mystery mystery = new Mystery("Sci-Fi");





            System.out.println("cartile sunt egale: " + book2.equals(book3));
            System.out.println("editura 1: " + book1.getEditura());
            System.out.println("editura 2: " + book2.getEditura());
            System.out.println(novel.getGenre() + " " + novel.getTitle() + " " + novel.getNrPages() + ".");
//            System.out.println(atlas.getGenre() + " " + atlas.getTitle() + " " + atlas.getNrPages() + ".");
            System.out.println(mystery.getGenre() + " " + mystery.getTitle() + " " + mystery.getNrPages() + ".");

            AtlasRepo atlasRepo = new AtlasRepo();


            Atlas atlas = new Atlas();
            atlas.setRating((byte)3);
            atlas.setNrPages(1234);
            atlas.setPublishhouse("Tomas");
            atlas.setTitle("Mystery");
            atlas.setIsbn("34-drgf-456");


            atlasRepo.createAtlas(atlas);
            //atlasRepo.deleteAtlas(null);
            //atlasRepo.update(null);
        }
    }
