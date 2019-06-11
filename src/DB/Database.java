package DB;

import com.mongodb.*;
import com.mongodb.MongoClient;
import com.mongodb.client.*;
import com.mongodb.client.model.CreateCollectionOptions;
import com.mongodb.client.model.CreateViewOptions;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.conversions.Bson;

import java.util.List;

public class Database {
    MongoClient client;
    DB db;

    public Database() {
    }
    public void connect(){
//        //Se crea el cliente
//         MongoClient client = new MongoClient("localhost",27017);
//         //Se crea la base de datos
//         DB database = client.getDB("test");
//         client.getDatabaseNames().forEach(System.out::println);
    }
    public void insert(){


    }


    public static void main(String[] args) {
//        MongoClient client = new MongoClient("localhost",27052);
//        MongoDatabase db = client.getDatabase("test");
//        client.listDatabaseNames();
//        System.out.println(client.listDatabaseNames());

    }

}
