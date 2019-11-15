package app.db

class DB<CLASS> {


    String name = ""
    Object data = null;

    DB(CLASS cl) {
        this.name = cl.toString()
        this.data = cl.any {
            m ->
                m.toString()
        }
    }



}
