package com.Practice.IndianRailways;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class RailwayService {
    private List<RailModel> stats = new ArrayList<>();
     String line ="";

    public List<RailModel> getStats() {
        return stats;
    }

    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public void fetch() throws IOException, InterruptedException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/isl_wise_train_detail_03082015_v1.csv")));
        while ((line = br.readLine())!=null){
            String [] data = line.split(",");
            RailModel Train = new RailModel();
            Train.setTrainNo(data[0]);
            Train.setTrainName(data[1]);
            Train.setIslno(data[2]);
            Train.setStationCode(data[3]);
            Train.setStationName(data[4]);
            Train.setArrivaltime(data[5]);
            Train.setDeparturetime(data[6]);
            Train.setDistance(data[7]);
            Train.setSourceStationCode(data[8]);
            Train.setSourceStationName(data[9]);
            Train.setDestinationstationCode(data[10]);
            Train.setDestinationStationName(data[11]);
            stats.add(Train);
        }
    }


}

