package com.cabbooking.cab_booking_system.Service;

import com.cabbooking.cab_booking_system.Config.MongoDBConnection;
import com.cabbooking.cab_booking_system.Model.Cab;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


public class CabService {
    private MongoCollection<Document> cabCollection;

    public CabService() {
        // Get the MongoDB collection
        cabCollection = MongoDBConnection.getInstance().getDatabase().getCollection("cabs");
    }
    public void addCab(Cab cab) {
        Document cabDocument = cab.toDocument();
        cabCollection.insertOne(cabDocument);
        System.out.println("Cab added to the database: " + cab.getCabId());
    }
}
