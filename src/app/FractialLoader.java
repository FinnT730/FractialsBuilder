package app;

import app.db.DB;

import java.util.function.Consumer;

public class FractialLoader {




    public F01 mandel = new F01();



    public DB db = new DB(new Integer(8));





    public void register(Consumer<Class>... cl) {
        if(cl == null) {
            return;
        }
    }



}
