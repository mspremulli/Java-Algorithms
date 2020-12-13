package Graphs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


  class Result {

    public static int connectedSum(
            int graphNodes,
            List<Integer> graphFrom,
            List<Integer> graphTo) {
      int sumOfSquares = 0;

      ArrayList<ArrayList<Integer>> nodes = new ArrayList<>();
      nodes.add(new ArrayList<Integer>());

      nodes.get(0).add(graphTo.get(0));
      nodes.get(0).add(graphFrom.get(0));

      for (int i = 1; i < graphFrom.size(); i++) {
        boolean isIn = false;
        for (ArrayList<Integer> nodeList : nodes) {
          if(nodeList.contains(graphFrom.get(i))){
            if(!nodeList.contains(graphTo.get(i)))
              nodeList.add(graphTo.get(i));
            isIn = true;
          }

          if(nodeList.contains(graphTo.get(i))){
            if(!nodeList.contains(graphFrom.get(i)))
              nodeList.add(graphFrom.get(i));
            isIn = true;
          }
        }

        if(!isIn) {
          nodes.add(new ArrayList<Integer>(Arrays.asList(graphTo.get(i),graphFrom.get(i))));
        }


      }

      System.out.println(nodes);

      for (ArrayList<Integer> arrayList : nodes) {
        sumOfSquares += (int) Math.ceil(Math.pow(arrayList.size(), 0.5));
      }

      for (int i = 1; i <= graphNodes; i++) {
        if(!graphTo.contains(i) && !graphFrom.contains(i)) sumOfSquares++;
      }

      return sumOfSquares;
    }

  }

