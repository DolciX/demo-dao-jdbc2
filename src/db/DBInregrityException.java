package db;

public class DBInregrityException extends RuntimeException{
    public DBInregrityException(String msg){
        super(msg);
    }
}
